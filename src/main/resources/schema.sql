-- Initialize DB
-- Please specify DDL here

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id INTEGER PRIMARY KEY,
    login VARCHAR(100),
    name VARCHAR(100)
);
