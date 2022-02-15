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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.treinamento.contacto.exception.NoSuchContactoException;
import com.liferay.treinamento.contacto.model.Contacto;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the contacto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactoUtil
 * @generated
 */
@ProviderType
public interface ContactoPersistence extends BasePersistence<Contacto> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContactoUtil} to access the contacto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the contactos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contactos
	 */
	public java.util.List<Contacto> findByUuid(String uuid);

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
	public java.util.List<Contacto> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Contacto> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

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
	public java.util.List<Contacto> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contacto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public Contacto findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Returns the first contacto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public Contacto fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

	/**
	 * Returns the last contacto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public Contacto findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Returns the last contacto in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public Contacto fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

	/**
	 * Returns the contactos before and after the current contacto in the ordered set where uuid = &#63;.
	 *
	 * @param contactoId the primary key of the current contacto
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contacto
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public Contacto[] findByUuid_PrevAndNext(
			long contactoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Removes all the contactos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of contactos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contactos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the contacto where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContactoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public Contacto findByUUID_G(String uuid, long groupId)
		throws NoSuchContactoException;

	/**
	 * Returns the contacto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public Contacto fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the contacto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public Contacto fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the contacto where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contacto that was removed
	 */
	public Contacto removeByUUID_G(String uuid, long groupId)
		throws NoSuchContactoException;

	/**
	 * Returns the number of contactos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contactos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the contactos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contactos
	 */
	public java.util.List<Contacto> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Contacto> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Contacto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

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
	public java.util.List<Contacto> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public Contacto findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Returns the first contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public Contacto fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

	/**
	 * Returns the last contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public Contacto findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Returns the last contacto in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public Contacto fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

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
	public Contacto[] findByUuid_C_PrevAndNext(
			long contactoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Removes all the contactos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of contactos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contactos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the contactos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching contactos
	 */
	public java.util.List<Contacto> findBygroupId(long groupId);

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
	public java.util.List<Contacto> findBygroupId(
		long groupId, int start, int end);

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
	public java.util.List<Contacto> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

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
	public java.util.List<Contacto> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contacto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public Contacto findBygroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Returns the first contacto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public Contacto fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

	/**
	 * Returns the last contacto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto
	 * @throws NoSuchContactoException if a matching contacto could not be found
	 */
	public Contacto findBygroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Returns the last contacto in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacto, or <code>null</code> if a matching contacto could not be found
	 */
	public Contacto fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

	/**
	 * Returns the contactos before and after the current contacto in the ordered set where groupId = &#63;.
	 *
	 * @param contactoId the primary key of the current contacto
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contacto
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public Contacto[] findBygroupId_PrevAndNext(
			long contactoId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contacto>
				orderByComparator)
		throws NoSuchContactoException;

	/**
	 * Removes all the contactos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeBygroupId(long groupId);

	/**
	 * Returns the number of contactos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching contactos
	 */
	public int countBygroupId(long groupId);

	/**
	 * Caches the contacto in the entity cache if it is enabled.
	 *
	 * @param contacto the contacto
	 */
	public void cacheResult(Contacto contacto);

	/**
	 * Caches the contactos in the entity cache if it is enabled.
	 *
	 * @param contactos the contactos
	 */
	public void cacheResult(java.util.List<Contacto> contactos);

	/**
	 * Creates a new contacto with the primary key. Does not add the contacto to the database.
	 *
	 * @param contactoId the primary key for the new contacto
	 * @return the new contacto
	 */
	public Contacto create(long contactoId);

	/**
	 * Removes the contacto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto that was removed
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public Contacto remove(long contactoId) throws NoSuchContactoException;

	public Contacto updateImpl(Contacto contacto);

	/**
	 * Returns the contacto with the primary key or throws a <code>NoSuchContactoException</code> if it could not be found.
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto
	 * @throws NoSuchContactoException if a contacto with the primary key could not be found
	 */
	public Contacto findByPrimaryKey(long contactoId)
		throws NoSuchContactoException;

	/**
	 * Returns the contacto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contactoId the primary key of the contacto
	 * @return the contacto, or <code>null</code> if a contacto with the primary key could not be found
	 */
	public Contacto fetchByPrimaryKey(long contactoId);

	/**
	 * Returns all the contactos.
	 *
	 * @return the contactos
	 */
	public java.util.List<Contacto> findAll();

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
	public java.util.List<Contacto> findAll(int start, int end);

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
	public java.util.List<Contacto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator);

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
	public java.util.List<Contacto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the contactos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of contactos.
	 *
	 * @return the number of contactos
	 */
	public int countAll();

}