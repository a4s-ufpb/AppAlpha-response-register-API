create table if not exists users (
    id serial primary key,
    name varchar(255) not null,
    email varchar(255) not null,
    birth_date date not null
);