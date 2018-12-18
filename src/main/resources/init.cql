create keyspace "employee_keyspace" with replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

use employee_keyspace;

CREATE TABLE employee_keyspace.employee (
	id int,
	firstName varchar,
	lastName varchar,
	department varchar,
 	PRIMARY KEY(id)
);

insert into employee (id, firstname , lastname , department ) values (17, 'Virat', 'Kohli', 'Sports');