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

package com.liferay.treinamento.contacto.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Contacto}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contacto
 * @generated
 */
public class ContactoWrapper
	extends BaseModelWrapper<Contacto>
	implements Contacto, ModelWrapper<Contacto> {

	public ContactoWrapper(Contacto contacto) {
		super(contacto);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("contactoId", getContactoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nome", getNome());
		attributes.put("telefone", getTelefone());
		attributes.put("idade", getIdade());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long contactoId = (Long)attributes.get("contactoId");

		if (contactoId != null) {
			setContactoId(contactoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String telefone = (String)attributes.get("telefone");

		if (telefone != null) {
			setTelefone(telefone);
		}

		Integer idade = (Integer)attributes.get("idade");

		if (idade != null) {
			setIdade(idade);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	/**
	 * Returns the company ID of this contacto.
	 *
	 * @return the company ID of this contacto
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contacto ID of this contacto.
	 *
	 * @return the contacto ID of this contacto
	 */
	@Override
	public long getContactoId() {
		return model.getContactoId();
	}

	/**
	 * Returns the create date of this contacto.
	 *
	 * @return the create date of this contacto
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this contacto.
	 *
	 * @return the email of this contacto
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this contacto.
	 *
	 * @return the group ID of this contacto
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the idade of this contacto.
	 *
	 * @return the idade of this contacto
	 */
	@Override
	public int getIdade() {
		return model.getIdade();
	}

	/**
	 * Returns the modified date of this contacto.
	 *
	 * @return the modified date of this contacto
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nome of this contacto.
	 *
	 * @return the nome of this contacto
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the primary key of this contacto.
	 *
	 * @return the primary key of this contacto
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telefone of this contacto.
	 *
	 * @return the telefone of this contacto
	 */
	@Override
	public String getTelefone() {
		return model.getTelefone();
	}

	/**
	 * Returns the user ID of this contacto.
	 *
	 * @return the user ID of this contacto
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this contacto.
	 *
	 * @return the user name of this contacto
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this contacto.
	 *
	 * @return the user uuid of this contacto
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this contacto.
	 *
	 * @return the uuid of this contacto
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this contacto.
	 *
	 * @param companyId the company ID of this contacto
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contacto ID of this contacto.
	 *
	 * @param contactoId the contacto ID of this contacto
	 */
	@Override
	public void setContactoId(long contactoId) {
		model.setContactoId(contactoId);
	}

	/**
	 * Sets the create date of this contacto.
	 *
	 * @param createDate the create date of this contacto
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this contacto.
	 *
	 * @param email the email of this contacto
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this contacto.
	 *
	 * @param groupId the group ID of this contacto
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the idade of this contacto.
	 *
	 * @param idade the idade of this contacto
	 */
	@Override
	public void setIdade(int idade) {
		model.setIdade(idade);
	}

	/**
	 * Sets the modified date of this contacto.
	 *
	 * @param modifiedDate the modified date of this contacto
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nome of this contacto.
	 *
	 * @param nome the nome of this contacto
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the primary key of this contacto.
	 *
	 * @param primaryKey the primary key of this contacto
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telefone of this contacto.
	 *
	 * @param telefone the telefone of this contacto
	 */
	@Override
	public void setTelefone(String telefone) {
		model.setTelefone(telefone);
	}

	/**
	 * Sets the user ID of this contacto.
	 *
	 * @param userId the user ID of this contacto
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this contacto.
	 *
	 * @param userName the user name of this contacto
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this contacto.
	 *
	 * @param userUuid the user uuid of this contacto
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this contacto.
	 *
	 * @param uuid the uuid of this contacto
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ContactoWrapper wrap(Contacto contacto) {
		return new ContactoWrapper(contacto);
	}

}