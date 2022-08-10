-- liquibase formatted sql
-- changeset divanio:all-entities

ALTER TABLE states
    ADD CONSTRAINT FK_STATES_ON_COUNTRY FOREIGN KEY (country_id) REFERENCES countries (id);

ALTER TABLE cities
    ADD CONSTRAINT FK_CITIES_ON_STATE FOREIGN KEY (state_id) REFERENCES states (id);

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
