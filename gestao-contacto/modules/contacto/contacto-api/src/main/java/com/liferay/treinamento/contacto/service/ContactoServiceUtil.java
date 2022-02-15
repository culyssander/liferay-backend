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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Contacto. This utility wraps
 * <code>com.liferay.treinamento.contacto.service.impl.ContactoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ContactoService
 * @generated
 */
public class ContactoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.treinamento.contacto.service.impl.ContactoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.treinamento.contacto.model.Contacto addContacto(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addContacto(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	public static com.liferay.treinamento.contacto.model.Contacto
			deleteContacto(long contactoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteContacto(contactoId);
	}

	public static com.liferay.treinamento.contacto.model.Contacto getContacto(
			long contactoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getContacto(contactoId);
	}

	public static java.util.List
		<com.liferay.treinamento.contacto.model.Contacto> getContactosByGroupId(
			long groupId) {

		return getService().getContactosByGroupId(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.treinamento.contacto.model.Contacto
			updateContacto(
				long contactoId, String nome, String telefone, String email,
				int idade)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateContacto(
			contactoId, nome, telefone, email, idade);
	}

	public static ContactoService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactoService, ContactoService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ContactoService.class);

		ServiceTracker<ContactoService, ContactoService> serviceTracker =
			new ServiceTracker<ContactoService, ContactoService>(
				bundle.getBundleContext(), ContactoService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}