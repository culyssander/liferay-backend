create table Contacto_Contacto (
	uuid_ VARCHAR(75) null,
	contactoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nome VARCHAR(75) null,
	telefone VARCHAR(75) null,
	idade INTEGER,
	email VARCHAR(75) null
);