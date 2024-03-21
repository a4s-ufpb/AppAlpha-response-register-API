create table if not exists responses (
    id serial primary key,
    typed_letters varchar(255) not null,
    response_date timestamp not null,
    correct boolean not null,
    user_id integer not null,
    question_id integer not null,
    foreign key (user_id) references users (id),
    foreign key (question_id) references questions (id)
);