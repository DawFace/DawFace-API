create table "user" (
    id_user integer primary key autoincrement,
    last_name varchar(255) not null,
    first_name varchar(255) not null,
    email varchar(255) not null unique,
    password varchar(255) not null,
    picture varchar(255) not null
);