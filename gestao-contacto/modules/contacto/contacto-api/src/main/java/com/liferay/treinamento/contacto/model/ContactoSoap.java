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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.treinamento.contacto.service.http.ContactoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ContactoSoap implements Serializable {

	public static ContactoSoap toSoapModel(Contacto model) {
		ContactoSoap soapModel = new ContactoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setContactoId(model.getContactoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNome(model.getNome());
		soapModel.setTelefone(model.getTelefone());
		soapModel.setIdade(model.getIdade());
		soapModel.setEmail(model.getEmail());

		return soapModel;
	}

	public static ContactoSoap[] toSoapModels(Contacto[] models) {
		ContactoSoap[] soapModels = new ContactoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContactoSoap[][] toSoapModels(Contacto[][] models) {
		ContactoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContactoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContactoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContactoSoap[] toSoapModels(List<Contacto> models) {
		List<ContactoSoap> soapModels = new ArrayList<ContactoSoap>(
			models.size());

		for (Contacto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContactoSoap[soapModels.size()]);
	}

	public ContactoSoap() {
	}

	public long getPrimaryKey() {
		return _contactoId;
	}

	public void setPrimaryKey(long pk) {
		setContactoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getContactoId() {
		return _contactoId;
	}

	public void setContactoId(long contactoId) {
		_contactoId = contactoId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public String getTelefone() {
		return _telefone;
	}

	public void setTelefone(String telefone) {
		_telefone = telefone;
	}

	public int getIdade() {
		return _idade;
	}

	public void setIdade(int idade) {
		_idade = idade;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	private String _uuid;
	private long _contactoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nome;
	private String _telefone;
	private int _idade;
	private String _email;

}