ALTER TABLE cities ADD CONSTRAINT cities_fk FOREIGN KEY (state_id) REFERENCES states(id);
