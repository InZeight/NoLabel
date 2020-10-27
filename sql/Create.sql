CREATE TABLE ZONE
(
    id_zone integer not null,
    lib_zone varchar(30),
constraint PK_ZONE PRIMARY KEY (id_zone)
);

CREATE TABLE RELEVE
(
	id_releve varchar(30) not null,
	date_releve date,
	heure_releve time,
	temperature_releve varchar(3),
	id_zone integer not null,
	constraint PK_RELEVE PRIMARY KEY (id_releve),
	constraint FK_RELEVE_ZONE FOREIGN KEY (id_zone) REFERENCES zone(id_zone)
	);