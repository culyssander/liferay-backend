create index IX_4BC18405 on Contacto_Contacto (groupId);
create index IX_1E7A88F9 on Contacto_Contacto (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_40D2F9BB on Contacto_Contacto (uuid_[$COLUMN_LENGTH:75$], groupId);