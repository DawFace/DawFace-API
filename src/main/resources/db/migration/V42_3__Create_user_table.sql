create table "user" (
    id_user integer primary key autoincrement,
    last_name varchar(255) not null,
    first_name varchar(255) not null,
    email varchar(255) not null unique,
    password varchar(255) not null,
    picture varchar(255) not null
);

INSERT INTO "user" (last_name, first_name, email, password, picture)
VALUES ('Tendry', 'Rakoto', 'tendry@kim.com', 'uwu', 's3://dawface-image-storage/Tendry.jpg');

INSERT INTO "user" (last_name, first_name, email, password, picture)
VALUES ('Tanjona', 'Niaina', 'tanjona@kim.com', 'mia', 's3://dawface-image-storage/Tanjona.jpg');

INSERT INTO "user" (last_name, first_name, email, password, picture)
VALUES ('Ante', 'Malone', 'Ante@kim.com', 'san', 's3://dawface-image-storage/Ante.jpg');