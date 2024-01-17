create database hospital;
use hospital;
create table admin (
login_id varchar(25),
password varchar(25)
);
create table patients (
  patient_id int primary key,
  patient_name varchar(25),
  fathers_name varchar(15),
  address varchar(250),
  contact_no varchar(10),
  age int
);

create table doctors (
  doctor_id int primary key,
  doctor_name varchar(25),
  father_name varchar(25),
  contact_no varchar(10),
  address varchar(250),
  doj date
);
create table receponist (
  login_id varchar(25),
password varchar(25)
);

insert into admin values
("admin","1234")



insert into receponist values
("rece","123")
admin



