ALTER TABLE public.cities ALTER COLUMN id TYPE int8 USING id::int8;
ALTER TABLE public.states ALTER COLUMN id TYPE int8 USING id::int8;
ALTER TABLE public.countries ALTER COLUMN id TYPE int8 USING id::int8;
