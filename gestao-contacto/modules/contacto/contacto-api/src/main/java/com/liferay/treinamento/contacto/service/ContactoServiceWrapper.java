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

package com.liferay.treinamento.contacto.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ContactoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContactoService
 * @generated
 */
public class ContactoServiceWrapper
	implements ContactoService, ServiceWrapper<ContactoService> {

	public ContactoServiceWrapper(ContactoService contactoService) {
		_contactoService = contactoService;
	}

	@Override
	public com.liferay.treinamento.contacto.model.Contacto addContacto(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoService.addContacto(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	@Override
	public com.liferay.treinamento.contacto.model.Contacto deleteContacto(
			long contactoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoService.deleteContacto(contactoId);
	}

	@Override
	public com.liferay.treinamento.contacto.model.Contacto getContacto(
			long contactoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoService.getContacto(contactoId);
	}

	@Override
	public java.util.List<com.liferay.treinamento.contacto.model.Contacto>
		getContactosByGroupId(long groupId) {

		return _contactoService.getContactosByGroupId(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contactoService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.treinamento.contacto.model.Contacto updateContacto(
			long contactoId, String nome, String telefone, String email,
			int idade)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoService.updateContacto(
			contactoId, nome, telefone, email, idade);
	}

	@Override
	public ContactoService getWrappedService() {
		return _contactoService;
	}

	@Override
	public void setWrappedService(ContactoService contactoService) {
		_contactoService = contactoService;
	}

	private ContactoService _contactoService;

}