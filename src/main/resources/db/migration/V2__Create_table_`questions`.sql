create table if not exists questions (
    id serial primary key,
    word varchar(255) not null,
    correct_letters_sequence varchar(255) not null
);