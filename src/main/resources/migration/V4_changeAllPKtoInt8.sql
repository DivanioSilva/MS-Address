ALTER TABLE cities ALTER COLUMN id TYPE int8 USING id::int8;
ALTER TABLE states ALTER COLUMN id TYPE int8 USING id::int8;
ALTER TABLE countries ALTER COLUMN id TYPE int8 USING id::int8;
ALTER TABLE cities
    ADD CONSTRAINT cities_state_fk FOREIGN KEY (state_id) REFERENCES states (id);
