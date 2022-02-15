/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.treinamento.contacto.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.treinamento.contacto.model.Contacto;
import com.liferay.treinamento.contacto.service.base.ContactoLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the contacto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.treinamento.contacto.service.ContactoLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactoLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.treinamento.contacto.model.Contacto",
	service = AopService.class
)
public class ContactoLocalServiceImpl extends ContactoLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.treinamento.contacto.service.ContactoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.treinamento.contacto.service.ContactoLocalServiceUtil</code>.
	 */
	
	
	public Contacto addContacto(long groupId, String nome, String telefone, String email, int idade, 
			ServiceContext serviceContext) throws PortalException {
		
		Group group = GroupLocalServiceUtil.getGroup(groupId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);
		
		long contactoId = counterLocalService.increment(Contacto.class.getName());
		
		Contacto contacto = createContacto(contactoId);
		
		contacto.setGroupId(groupId);
		contacto.setCompanyId(group.getCompanyId());
		contacto.setUserId(userId);
		contacto.setUserName(user.getScreenName());
		contacto.setCreateDate(new Date());
		contacto.setModifiedDate(new Date());
		
		contacto.setNome(nome);
		contacto.setTelefone(telefone);
		contacto.setEmail(email);
		contacto.setIdade(idade);
		
		return super.addContacto(contacto);
	}
	
	public Contacto updateContacto(long contactoId, String nome, String telefone, String email, int idade) throws PortalException {
		
		Contacto contacto = getContacto(contactoId);
		
		contacto.setModifiedDate(new Date());
		
		contacto.setNome(nome);
		contacto.setTelefone(telefone);
		contacto.setEmail(email);
		contacto.setIdade(idade);
		
		return super.updateContacto(contacto);
		
	}
	
	
	@Override
	public Contacto addContacto(Contacto contacto) {
		throw new UnsupportedOperationException("Not supported.");
	}
	
	@Override
	public Contacto updateContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported.");
	}
	
}