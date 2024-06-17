CREATE TABLE tanks (
    tank_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    type VARCHAR(50),
    weight_tons DECIMAL(5, 2),
    armor_thickness_mm DECIMAL(5, 2),
    main_gun_caliber_mm DECIMAL(5, 2),
    manufacturer_id INT,
    country_id INT,
    production_year_start INT,
    production_year_end INT,
    FOREIGN KEY (manufacturer_id) REFERENCES manufacturers(manufacturer_id),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

CREATE TABLE countries (
    country_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE manufacturers (
    manufacturer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    country_id INT,
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);