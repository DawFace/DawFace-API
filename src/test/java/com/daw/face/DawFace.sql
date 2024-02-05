CREATE TABLE User (
    id_user uuid DEFAULT gen_random_uuid(),
    name varchar(255),
    firstname varchar(255),
    email varchar(255),
    password varchar(255),
    picture_url varchar(255)
);