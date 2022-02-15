package com.liferay.treinamento.servico.rest.application;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyService;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.treinamento.contacto.model.Contacto;
import com.liferay.treinamento.contacto.service.ContactoService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author quitumba
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/contactos",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Contacto.Rest"
	},
	service = Application.class
)
public class ContactoRestApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	
	@Reference
	private ContactoService contactoService;
	
	@Reference
	private CompanyService companyService;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getContactosByGroupId() {
		try {
			List<Contacto> contactos = new ArrayList<Contacto>();
			Company company = companyService.getCompanyById(PortalUtil.getDefaultCompanyId());
			
			List<Group> groups = GroupLocalServiceUtil.getGroups(company.getCompanyId(), 0, true);
			
			for(Group group : groups) {
				contactos.addAll(contactoService.getContactosByGroupId(group.getGroupId()));
			}
			
			return JSONFactoryUtil.serialize(contactos);
		} catch (Exception e) {
			return "{}";
		}
	}
	
//	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContactos() {
		try {
			List<Contacto> contactos = new ArrayList<Contacto>();
			Company company = companyService.getCompanyById(PortalUtil.getDefaultCompanyId());
			
			List<Group> groups = GroupLocalServiceUtil.getGroups(company.getCompanyId(), 0, true);
			
			for(Group group : groups) {
				contactos.addAll(contactoService.getContactosByGroupId(group.getGroupId()));
			}
			
			return Response.ok(contactos).build();
		} catch (Exception e) {
			return Response.ok().build();
		}
	}
	
	@GET
	@Path("/{contactoId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContactos(@PathParam("contactoId") long contactoId) {
		try {
			return Response.ok(contactoService.getContacto(contactoId)).build();
		} catch (Exception e) {
			return Response.serverError().build();
		}
	}
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	public Response addContacto(ContactoDto contactoDto, @Context HttpServletRequest request) {
		try {
			
			long userId = Long.parseLong(request.getUserPrincipal().getName());
			
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setRequest(request);
			serviceContext.setCompanyId(PortalUtil.getDefaultCompanyId());
			serviceContext.setUserId(userId);
			
			Contacto contacto = contactoService.addContacto(contactoDto.getGroupId(), 
					contactoDto.getNome(), 
					contactoDto.getTelefone(), 
					contactoDto.getEmail(), 
					contactoDto.getIdade(), 
					serviceContext);
					
			return Response.ok(contacto).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@PUT
	@Path("/{contactoId}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response updateContacto(@PathParam("contactoId") long contactoId, ContactoDto contactoDto) {
		try {
			Contacto contacto = contactoService.updateContacto(contactoId, contactoDto.getNome(), 
					contactoDto.getTelefone(), 
					contactoDto.getEmail(), 
					contactoDto.getIdade());
					
			return Response.ok(contacto).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@DELETE
	@Path("/{contactoId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteContactos(@PathParam("contactoId") long contactoId) {
		try {
			System.out.println(contactoId);
			return Response.ok(contactoService.deleteContacto(contactoId)).build();
		} catch (Exception e) {
			return Response.serverError().build();
		}
	}
}