create table if not exists employees(
	id serial primary key,
	firstname varchar,
	lastname varchar,
	position varchar,
	office varchar,
	start_date timestamp,
	salary float
);
