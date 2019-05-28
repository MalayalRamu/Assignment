To Start this project Below are the requirements

Setup MySql and configure the credentails in src/main/resources/application.properties like

spring.datasource.url=jdbc:mysql://localhost:3306/electiondb?useSSL=false
spring.datasource.username=root
spring.datasource.password=reddy

Create the databasse and tables in mysql by following below commands in mysql cli

create database electiondb;
use electiondb;
CREATE TABLE constituencies(constituency_id INT PRIMARY KEY AUTO_INCREMENT,constituencyname VARCHAR(255));
CREATE TABLE parties(party_id INT PRIMARY KEY AUTO_INCREMENT,partyname VARCHAR(255));
CREATE TABLE voters(voter_id INT PRIMARY KEY AUTO_INCREMENT,votername VARCHAR(255),constituency_id INT, is_voted BOOLEAN DEFAULT FLASE);
CREATE TABLE votes(vote_id INT PRIMARY KEY AUTO_INCREMENT,voter_id INT,constituency_id INT,party_id INT);

You can generate the sample data by src/main/resources/create-data.sh 