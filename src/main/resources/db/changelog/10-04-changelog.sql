-- liquibase formatted sql
-- changeset divanio:setup

ALTER TABLE silva.states ADD CONSTRAINT fkskkdphjml9vjlrqn4m5hi251y FOREIGN KEY (country_id) REFERENCES silva.countries(id);

ALTER TABLE silva.address ADD CONSTRAINT fka6p4hdfq92oyy92gb5ra8xiw7 FOREIGN KEY (city_id) REFERENCES silva.cities(id);

ALTER TABLE silva.cities ADD CONSTRAINT fksu54e1tlhaof4oklvv7uphsli FOREIGN KEY (state_id) REFERENCES silva.states(id);
