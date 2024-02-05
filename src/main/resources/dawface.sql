DROP DATABASE IF EXISTS dawface;
CREATE DATABASE dawface;
\c dawface

CREATE TABLE "user" (
    userId UUID DEFAULT gen_random_uuid(),
    name VARCHAR(255),
    firstname VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    picture VARCHAR(255)
);