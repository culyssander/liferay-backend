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
 * Provides a wrapper for {@link ContactoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContactoLocalService
 * @generated
 */
public class ContactoLocalServiceWrapper
	implements ContactoLocalService, ServiceWrapper<ContactoLocalService> {

	public ContactoLocalServiceWrapper(
		ContactoLocalService contactoLocalService) {

		_contactoLocalService = contactoLocalService;
	}

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
	@Override
	public com.liferay.treinamento.contacto.model.Contacto addContacto(
		com.liferay.treinamento.contacto.model.Contacto contacto) {

		return _contactoLocalService.addContacto(contacto);
	}

	@Override
	public com.liferay.treinamento.contacto.model.Contacto addContacto(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoLocalService.addContacto(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	/**
	 * Creates a new contacto with the primary key. Does not add the contacto to the database.
	 *
	 * @param contactoId the primary key for the new contacto
	 * @return the new contacto
	 */
	@Override
	public com.liferay.treinamento.contacto.model.Contacto createContacto(
		long contactoId) {

		return _contactoLocalService.createContacto(contactoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.treinamento.contacto.model.Contacto deleteContacto(
		com.liferay.treinamento.contacto.model.Contacto contacto) {

		return _contactoLocalService.deleteContacto(contacto);
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
	@Override
	public com.liferay.treinamento.contacto.model.Contacto deleteContacto(
			long contactoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoLocalService.deleteContacto(contactoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contactoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _contactoLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _contactoLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _contactoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _contactoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _contactoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.treinamento.contacto.model.Contacto fetchContacto(
		long contactoId) {

		return _contactoLocalService.fetchContacto(contactoId);
	}

	/**
	 * Returns the contacto matching the UUID and group.
	 *
	 * @param uuid the contacto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	@Override
	public com.liferay.treinamento.contacto.model.Contacto
		fetchContactoByUuidAndGroupId(String uuid, long groupId) {

		return _contactoLocalService.fetchContactoByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _contactoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the contacto with the primary key.
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto
	 * @throws PortalException if a contacto with the primary key could not be found
	 */
	@Override
	public com.liferay.treinamento.contacto.model.Contacto getContacto(
			long contactoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoLocalService.getContacto(contactoId);
	}

	/**
	 * Returns the contacto matching the UUID and group.
	 *
	 * @param uuid the contacto's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contacto
	 * @throws PortalException if a matching contacto could not be found
	 */
	@Override
	public com.liferay.treinamento.contacto.model.Contacto
			getContactoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoLocalService.getContactoByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.treinamento.contacto.model.Contacto>
		getContactos(int start, int end) {

		return _contactoLocalService.getContactos(start, end);
	}

	/**
	 * Returns all the contactos matching the UUID and company.
	 *
	 * @param uuid the UUID of the contactos
	 * @param companyId the primary key of the company
	 * @return the matching contactos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.treinamento.contacto.model.Contacto>
		getContactosByUuidAndCompanyId(String uuid, long companyId) {

		return _contactoLocalService.getContactosByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.treinamento.contacto.model.Contacto>
		getContactosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.treinamento.contacto.model.Contacto>
					orderByComparator) {

		return _contactoLocalService.getContactosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of contactos.
	 *
	 * @return the number of contactos
	 */
	@Override
	public int getContactosCount() {
		return _contactoLocalService.getContactosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _contactoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _contactoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contactoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.treinamento.contacto.model.Contacto updateContacto(
		com.liferay.treinamento.contacto.model.Contacto contacto) {

		return _contactoLocalService.updateContacto(contacto);
	}

	@Override
	public com.liferay.treinamento.contacto.model.Contacto updateContacto(
			long contactoId, String nome, String telefone, String email,
			int idade)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactoLocalService.updateContacto(
			contactoId, nome, telefone, email, idade);
	}

	@Override
	public ContactoLocalService getWrappedService() {
		return _contactoLocalService;
	}

	@Override
	public void setWrappedService(ContactoLocalService contactoLocalService) {
		_contactoLocalService = contactoLocalService;
	}

	private ContactoLocalService _contactoLocalService;

}