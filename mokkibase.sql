DROP DATABASE IF EXISTS mokkibase;
CREATE database mokkibase;
USE mokkibase;

CREATE TABLE Staff (
Nimi VARCHAR(15),
Salasana VARCHAR(15),
PRIMARY KEY (Nimi)
);

CREATE TABLE Asiakas (
Etunimi varchar(20),
Sukunimi varchar(20),
AsiakasID int NOT NULL,
PRIMARY KEY (AsiakasID)
)
;

CREATE TABLE Mokki (
MokkiID int NOT NULL,
Osoite varchar(50),
HuoneMaara int NOT NULL,
HenkiloMaara int NOT NULL,
Hinta double NOT NULL,
Takka int,
Palju int,
Sauna int,
PRIMARY KEY (MokkiID)
)
;

CREATE TABLE Vuokraus (
VuokrausID int NOT NULL,
SaapumisPVM date NOT NULL,
LahtoPVM date NOT NULL,
HenkiloMaara int NOT NULL,
AsiakasID int NOT NULL,
MokkiID int NOT NULL,
FOREIGN KEY (AsiakasID)
REFERENCES Asiakas(AsiakasID),
FOREIGN KEY (MokkiID)
REFERENCES Mokki(MokkiID),
PRIMARY KEY (VuokrausID)
)
;

CREATE TABLE Lasku (
LaskuID int NOT NULL,
Maksutiedot varchar(10),
PVM date,
VuokrausID int NOT NULL,
FOREIGN KEY (VuokrausID)
REFERENCES Vuokraus(VuokrausID),
PRIMARY KEY (LaskuID)
)
;


INSERT into Staff (Nimi, Salasana)
Values
("nimi", "salasana");

INSERT INTO Mokki (MokkiID, Osoite, HuoneMaara, HenkiloMaara, Hinta, Takka, Palju, Sauna)
Values 
(1, "Mökkitie 1", 3, 3, 80.00, 0, 0, 1),
(2, "Mökkitie 2", 4, 4, 100.00, 1, 1, 1),
(3, "Mökkitie 3", 5, 5, 120.00, 1, 1, 1),
(4, "Mökkitie 4", 6, 6, 140.00, 1, 1, 1);









