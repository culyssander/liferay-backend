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

package com.liferay.treinamento.contacto.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.treinamento.contacto.model.Contacto;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the contacto service. This utility wraps <code>com.liferay.treinamento.contacto.service.persistence.impl.ContactoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactoPersistence
 * @generated
 */
public class ContactoUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Contacto contacto) {
		getPersistence().clearCache(contacto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Contacto> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Contacto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Contacto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Contacto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Contacto update(Contacto contacto) {
		return getPersistence().update(contacto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Contacto update(
		Contacto contacto, ServiceContext serviceContext) {

		return getPersistence().update(contacto, serviceContext);
	}

	/**
	 * Returns all the contactos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contactos
	 */
	public static List<Contacto> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the contactos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @return the range of matching contactos
	 */
	public static List<Contacto> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the contactos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contactos
	 */
	public static List<Contacto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contactos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contactos
	 */
	public static List<Contacto> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contacto> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contacto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public static Contacto findByUuid_First(
			String uuid, OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first contacto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static Contacto fetchByUuid_First(
		String uuid, OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last contacto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public static Contacto findByUuid_Last(
			String uuid, OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last contacto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static Contacto fetchByUuid_Last(
		String uuid, OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the contactos before and after the current contacto in the ordered set where uuid = &#63;.
	 *
	 * @param contactoId the primary key of the current contacto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contacto
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public static Contacto[] findByUuid_PrevAndNext(
			long contactoId, String uuid,
			OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findByUuid_PrevAndNext(
			contactoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the contactos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of contactos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contactos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the contacto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContactoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public static Contacto findByUUID_G(String uuid, long groupId)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contacto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static Contacto fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contacto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static Contacto fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the contacto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contacto that was removed
	 */
	public static Contacto removeByUUID_G(String uuid, long groupId)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of contactos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contactos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the contactos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contactos
	 */
	public static List<Contacto> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the contactos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @return the range of matching contactos
	 */
	public static List<Contacto> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the contactos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contactos
	 */
	public static List<Contacto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contactos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contactos
	 */
	public static List<Contacto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Contacto> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public static Contacto findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static Contacto fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public static Contacto findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static Contacto fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the contactos before and after the current contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param contactoId the primary key of the current contacto
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contacto
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public static Contacto[] findByUuid_C_PrevAndNext(
			long contactoId, String uuid, long companyId,
			OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			contactoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the contactos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of contactos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contactos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the contactos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching contactos
	 */
	public static List<Contacto> findBygroupId(long groupId) {
		return getPersistence().findBygroupId(groupId);
	}

	/**
	 * Returns a range of all the contactos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @return the range of matching contactos
	 */
	public static List<Contacto> findBygroupId(
		long groupId, int start, int end) {

		return getPersistence().findBygroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the contactos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contactos
	 */
	public static List<Contacto> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contactos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contactos
	 */
	public static List<Contacto> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Contacto> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contacto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public static Contacto findBygroupId_First(
			long groupId, OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findBygroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first contacto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static Contacto fetchBygroupId_First(
		long groupId, OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().fetchBygroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last contacto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public static Contacto findBygroupId_Last(
			long groupId, OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last contacto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public static Contacto fetchBygroupId_Last(
		long groupId, OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the contactos before and after the current contacto in the ordered set where groupId = &#63;.
	 *
	 * @param contactoId the primary key of the current contacto
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contacto
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public static Contacto[] findBygroupId_PrevAndNext(
			long contactoId, long groupId,
			OrderByComparator<Contacto> orderByComparator)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findBygroupId_PrevAndNext(
			contactoId, groupId, orderByComparator);
	}

	/**
	 * Removes all the contactos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeBygroupId(long groupId) {
		getPersistence().removeBygroupId(groupId);
	}

	/**
	 * Returns the number of contactos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching contactos
	 */
	public static int countBygroupId(long groupId) {
		return getPersistence().countBygroupId(groupId);
	}

	/**
	 * Caches the contacto in the entity cache if it is enabled.
	 *
	 * @param contacto the contacto
	 */
	public static void cacheResult(Contacto contacto) {
		getPersistence().cacheResult(contacto);
	}

	/**
	 * Caches the contactos in the entity cache if it is enabled.
	 *
	 * @param contactos the contactos
	 */
	public static void cacheResult(List<Contacto> contactos) {
		getPersistence().cacheResult(contactos);
	}

	/**
	 * Creates a new contacto with the primary key. Does not add the contacto to the database.
	 *
	 * @param contactoId the primary key for the new contacto
	 * @return the new contacto
	 */
	public static Contacto create(long contactoId) {
		return getPersistence().create(contactoId);
	}

	/**
	 * Removes the contacto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto that was removed
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public static Contacto remove(long contactoId)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().remove(contactoId);
	}

	public static Contacto updateImpl(Contacto contacto) {
		return getPersistence().updateImpl(contacto);
	}

	/**
	 * Returns the contacto with the primary key or throws a <code>NoSuchContactoException</code> if it could not be found.
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public static Contacto findByPrimaryKey(long contactoId)
		throws com.liferay.treinamento.contacto.exception.
			NoSuchContactoException {

		return getPersistence().findByPrimaryKey(contactoId);
	}

	/**
	 * Returns the contacto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto, or <code>null</code> if a contacto with the primary key could not be found
	 */
	public static Contacto fetchByPrimaryKey(long contactoId) {
		return getPersistence().fetchByPrimaryKey(contactoId);
	}

	/**
	 * Returns all the contactos.
	 *
	 * @return the contactos
	 */
	public static List<Contacto> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the contactos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @return the range of contactos
	 */
	public static List<Contacto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the contactos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contactos
	 */
	public static List<Contacto> findAll(
		int start, int end, OrderByComparator<Contacto> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contactos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contactos
	 * @param end the upper bound of the range of contactos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of contactos
	 */
	public static List<Contacto> findAll(
		int start, int end, OrderByComparator<Contacto> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the contactos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of contactos.
	 *
	 * @return the number of contactos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ContactoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactoPersistence, ContactoPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ContactoPersistence.class);

		ServiceTracker<ContactoPersistence, ContactoPersistence>
			serviceTracker =
				new ServiceTracker<ContactoPersistence, ContactoPersistence>(
					bundle.getBundleContext(), ContactoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}