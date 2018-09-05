CREATE DATABASE IF NOT EXISTS characterMaker;

USE characterMaker;

--We may need to reorder these tables again depending on which tables reference each other. -K
DROP TABLE IF EXISTS Pets; 
DROP TABLE IF EXISTS Transportation; -- Keith
DROP TABLE IF EXISTS Weapons; -- Daniel
DROP TABLE IF EXISTS Lore;
DROP TABLE IF EXISTS Abilities;
DROP TABLE IF EXISTS Classes;

-- WHAT'S UP TEAM!  OK - HERE IS WHERE YOU WILL ADD YOUR TABLES FOR YOUR ASSIGNED OBJECTS. -L

CREATE TABLE classes (
	class_Id int(10) NOT NULL auto_increment,
	className nvarchar(25),
	-- Barbarian, Wizard, SpecOps, Monk, Priest
	classDescription nvarchar(250),
	classPerks nvarchar(250),
	classWeakness nvarchar(250),
	PRIMARY KEY(class_Id)
);

CREATE TABLE abilities (
	ability_Id int(50) NOT NULL auto_increment,
	abilityName nvarchar(25),
	abilityType nvarchar(25),
	-- Melee, Projectile, Defensive, Dodge, Psychic, 
	abilityDescription nvarchar(250),
	abilityClass_Id int(10),
	PRIMARY KEY(ability_Id),
	FOREIGN KEY(abilityClass_Id) REFERENCES classes(class_Id)
);

CREATE TABLE weapons (
	weapons_id int(30) NOT NULL aushowto_increment,
    weaponName nvarchar(25),
    weaponType nvarchar(25),
	-- Description of weapons
    PRIMARY KEY(weapons_id)
);

CREATE TABLE pets (
	pet_id int(50) NOT NULL auto_increment,
	pet_name nvarchar(32),
	pet_desc nvarchar(250),
	-- Can add pet_type if additional info needed outside description 
	PRIMARY KEY(pet_id),
	FOREIGN KEY(class_Id) REFERENCES classes(class_Id)
);