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
 * Provides the local service utility for Contacto. This utility wraps
 * <code>com.liferay.treinamento.contacto.service.impl.ContactoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ContactoLocalService
 * @generated
 */
public class ContactoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.treinamento.contacto.service.impl.ContactoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the contacto to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContactoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contacto the contacto
	 * @return the contacto that was added
	 */
	public static com.liferay.treinamento.contacto.model.Contacto addContacto(
		com.liferay.treinamento.contacto.model.Contacto contacto) {

		return getService().addContacto(contacto);
	}

	public static com.liferay.treinamento.contacto.model.Contacto addContacto(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addContacto(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	/**
	 * Creates a new contacto with the primary key. Does not add the contacto to the database.
	 *
	 * @param contactoId the primary key for the new contacto
	 * @return the new contacto
	 */
	public static com.liferay.treinamento.contacto.model.Contacto
		createContacto(long contactoId) {

		return getService().createContacto(contactoId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the contacto from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContactoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contacto the contacto
	 * @return the contacto that was removed
	 */
	public static com.liferay.treinamento.contacto.model.Contacto
		deleteContacto(
			com.liferay.treinamento.contacto.model.Contacto contacto) {

		return getService().deleteContacto(contacto);
	}

	/**
	 * Deletes the contacto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContactoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto that was removed
	 * @throws PortalException if a contacto with the primary key could not be found
	 */
	public static com.liferay.treinamento.contacto.model.Contacto
			deleteContacto(long contactoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteContacto(contactoId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.treinamento.contacto.model.impl.ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.treinamento.contacto.model.impl.ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.treinamento.contacto.model.Contacto fetchContacto(
		long contactoId) {

		return getService().fetchContacto(contactoId);
	}

	/**
	 * Returns the contacto matching the UUID and group.
	 *
	 * @param uuid the contacto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static com.liferay.treinamento.contacto.model.Contacto
		fetchContactoByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchContactoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the contacto with the primary key.
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto
	 * @throws PortalException if a contacto with the primary key could not be found
	 */
	public static com.liferay.treinamento.contacto.model.Contacto getContacto(
			long contactoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getContacto(contactoId);
	}

	/**
	 * Returns the contacto matching the UUID and group.
	 *
	 * @param uuid the contacto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contacto
	 * @throws PortalException if a matching contacto could not be found
	 */
	public static com.liferay.treinamento.contacto.model.Contacto
			getContactoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getContactoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the contactos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.treinamento.contacto.model.impl.ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @return the range of contactos
	 */
	public static java.util.List
		<com.liferay.treinamento.contacto.model.Contacto> getContactos(
			int start, int end) {

		return getService().getContactos(start, end);
	}

	/**
	 * Returns all the contactos matching the UUID and company.
	 *
	 * @param uuid the UUID of the contactos
	 * @param companyId the primary key of the company
	 * @return the matching contactos, or an empty list if no matches were found
	 */
	public static java.util.List
		<com.liferay.treinamento.contacto.model.Contacto>
			getContactosByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getContactosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of contactos matching the UUID and company.
	 *
	 * @param uuid the UUID of the contactos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching contactos, or an empty list if no matches were found
	 */
	public static java.util.List
		<com.liferay.treinamento.contacto.model.Contacto>
			getContactosByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.treinamento.contacto.model.Contacto>
						orderByComparator) {

		return getService().getContactosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of contactos.
	 *
	 * @return the number of contactos
	 */
	public static int getContactosCount() {
		return getService().getContactosCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the contacto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContactoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contacto the contacto
	 * @return the contacto that was updated
	 */
	public static com.liferay.treinamento.contacto.model.Contacto
		updateContacto(
			com.liferay.treinamento.contacto.model.Contacto contacto) {

		return getService().updateContacto(contacto);
	}

	public static com.liferay.treinamento.contacto.model.Contacto
			updateContacto(
				long contactoId, String nome, String telefone, String email,
				int idade)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateContacto(
			contactoId, nome, telefone, email, idade);
	}

	public static ContactoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactoLocalService, ContactoLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ContactoLocalService.class);

		ServiceTracker<ContactoLocalService, ContactoLocalService>
			serviceTracker =
				new ServiceTracker<ContactoLocalService, ContactoLocalService>(
					bundle.getBundleContext(), ContactoLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}