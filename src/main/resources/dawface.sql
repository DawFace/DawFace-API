DROP DATABASE IF EXISTS dawface;
CREATE DATABASE dawface;
\c dawface

CREATE TABLE "user" (
    id_user UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    last_name VARCHAR(255) NOT NULL ,
    first_name VARCHAR(255) NOT NULL ,
    email VARCHAR(255) NOT NULL UNIQUE ,
    password VARCHAR(255) NOT NULL ,
    picture VARCHAR(255) NOT NULL
);