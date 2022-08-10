-- liquibase formatted sql
-- changeset divanio:batatinha

CREATE TABLE address
(
    id          BIGINT NOT NULL,
    street      VARCHAR(255),
    door_number VARCHAR(255),
    zip_code    VARCHAR(255),
    city_id     BIGINT,
    CONSTRAINT pk_address PRIMARY KEY (id)
);

ALTER TABLE address
    ADD CONSTRAINT FK_ADDRESS_ON_CITY FOREIGN KEY (city_id) REFERENCES cities (id);
