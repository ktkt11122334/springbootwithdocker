CREATE DATABASE IF NOT EXISTS bootdb;

CREATE TABLE IF NOT EXISTS test(
  id int(11) PRIMARY KEY,
  data varchar(255) NOT NULL
);

INSERT INTO test (id, data) VALUES (1, 'welcome to spring boot with docker');
