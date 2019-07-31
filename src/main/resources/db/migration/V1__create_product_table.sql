CREATE TABLE product (
  id CHARACTER VARYING(255) PRIMARY KEY,
  name CHARACTER VARYING(255) NOT NULL
);

INSERT INTO product (id, name) VALUES ('1', 'ice peak');
INSERT INTO product (id, name) VALUES ('2', 'ice peak again');