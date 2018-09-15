CREATE DATABASE IF NOT EXISTS characterMaker;

USE characterMaker;

DROP TABLE IF EXISTS pets; 
DROP TABLE IF EXISTS vehicles; 
DROP TABLE IF EXISTS weapons; 
DROP TABLE IF EXISTS lore;
DROP TABLE IF EXISTS abilities;
DROP TABLE IF EXISTS classes;
DROP TABLE IF EXISTS character;


CREATE TABLE classes (
	class_id int(10) NOT NULL auto_increment,
	class_name nvarchar(25),
	-- Barbarian, Wizard, SpecOps, Monk, Priest
	class_description nvarchar(250),
	class_perks nvarchar(250),
	class_weakness nvarchar(250),
	PRIMARY KEY(class_Id)
);

CREATE TABLE abilities (
	ability_id int(50) NOT NULL auto_increment,
	ability_name nvarchar(25),
	ability_type nvarchar(25),
	-- Melee, Projectile, Defensive, Dodge, Psychic, 
	ability_description nvarchar(250),
	ability_class_id int(10),
	PRIMARY KEY(ability_id),
	FOREIGN KEY(ability_class_id) REFERENCES classes(class_Id)
);

CREATE TABLE weapons (
	weapons_id int(30) NOT NULL auto_increment,
    weapon_name nvarchar(25),
    weapon_type nvarchar(25),
		weapon_strength int(3),
	-- Description of weapons
    PRIMARY KEY(weapons_id)
);

CREATE TABLE pets (
	pet_id int(50) NOT NULL auto_increment,
	pet_name nvarchar(32),
	pet_desc nvarchar(250),
	PRIMARY KEY(pet_id)
	);

	CREATE TABLE vehicles (
	vehicle_id int(10) not null auto_increment,
	name varchar(25),
	type varchar(25),
	-- 2 Wheel Dirtbike, Three Wheeler, Side by Side, Truck, Dune Buggy
	speed int(125),	
	color varchar(25),
	vehicle_class_id int(10),
	PRIMARY KEY(vehicle_id),
	FOREIGN KEY(vehicle_class_id) REFERENCES classes(class_id)
);

CREATE TABLE character (
	character_id int(4) NOT NULL auto_increment,
	character_first_name nvarchar(25),
	character_last_name nvarchar(25),
	PRIMARY KEY(character_id)
);
