INSERT INTO tanks (name, type, weight_tons, armor_thickness_mm, main_gun_caliber_mm, manufacturer_id, country_id, production_year_start, production_year_end)
VALUES
('Tiger I', 'Heavy', 54.0, 120.0, 88.0, 1, 1, 1942, 1944),
('Sherman M4', 'Medium', 30.3, 75.0, 75.0, 2, 2, 1942, 1945),
('T-34', 'Medium', 26.0, 60.0, 76.2, 3, 3, 1940, 1945),
('Panther', 'Medium', 45.0, 100.0, 75.0, 4, 1, 1943, 1945),
('Churchill VII', 'Heavy', 40.0, 152.0, 75.0, 5, 4, 1943, 1945),
('IS-2', 'Heavy', 46.0, 120.0, 122.0, 6, 3, 1943, 1945),
('Cromwell', 'Medium', 27.6, 76.0, 75.0, 7, 4, 1943, 1945),
('Panzer IV', 'Medium', 25.0, 80.0, 75.0, 8, 1, 1937, 1945),
('M26 Pershing', 'Heavy', 41.7, 102.0, 90.0, 2, 2, 1944, 1945),
('KV-1', 'Heavy', 47.5, 90.0, 76.2, 9, 3, 1939, 1943);

INSERT INTO manufacturers (manufacturer_id, name, country_id)
VALUES
(1, 'Henschel & Son', 1),       -- Manufacturer of Tiger I
(2, 'Detroit Arsenal', 2),      -- Manufacturer of Sherman M4 and M26 Pershing
(3, 'Kharkiv Factory', 3),      -- Manufacturer of T-34
(4, 'MAN', 1),                  -- Manufacturer of Panther
(5, 'Vauxhall Motors', 4),      -- Manufacturer of Churchill VII
(6, 'Kirov Factory', 3),        -- Manufacturer of IS-2
(7, 'Leyland Motors', 4),       -- Manufacturer of Cromwell
(8, 'Krupp', 1),                -- Manufacturer of Panzer IV
(9, 'LKZ', 3);                  -- Manufacturer of KV-1

INSERT INTO countries (country_id, name)
VALUES
(1, 'Germany'),
(2, 'USA'),
(3, 'USSR'),
(4, 'UK');
