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

package com.liferay.treinamento.contacto.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.treinamento.contacto.model.Contacto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Contacto in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ContactoCacheModel
	implements CacheModel<Contacto>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ContactoCacheModel)) {
			return false;
		}

		ContactoCacheModel contactoCacheModel = (ContactoCacheModel)object;

		if (contactoId == contactoCacheModel.contactoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, contactoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", contactoId=");
		sb.append(contactoId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", telefone=");
		sb.append(telefone);
		sb.append(", idade=");
		sb.append(idade);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Contacto toEntityModel() {
		ContactoImpl contactoImpl = new ContactoImpl();

		if (uuid == null) {
			contactoImpl.setUuid("");
		}
		else {
			contactoImpl.setUuid(uuid);
		}

		contactoImpl.setContactoId(contactoId);
		contactoImpl.setGroupId(groupId);
		contactoImpl.setCompanyId(companyId);
		contactoImpl.setUserId(userId);

		if (userName == null) {
			contactoImpl.setUserName("");
		}
		else {
			contactoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			contactoImpl.setCreateDate(null);
		}
		else {
			contactoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			contactoImpl.setModifiedDate(null);
		}
		else {
			contactoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nome == null) {
			contactoImpl.setNome("");
		}
		else {
			contactoImpl.setNome(nome);
		}

		if (telefone == null) {
			contactoImpl.setTelefone("");
		}
		else {
			contactoImpl.setTelefone(telefone);
		}

		contactoImpl.setIdade(idade);

		if (email == null) {
			contactoImpl.setEmail("");
		}
		else {
			contactoImpl.setEmail(email);
		}

		contactoImpl.resetOriginalValues();

		return contactoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		contactoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nome = objectInput.readUTF();
		telefone = objectInput.readUTF();

		idade = objectInput.readInt();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(contactoId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (telefone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telefone);
		}

		objectOutput.writeInt(idade);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public String uuid;
	public long contactoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nome;
	public String telefone;
	public int idade;
	public String email;

}