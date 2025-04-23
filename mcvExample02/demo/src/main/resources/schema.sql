CREATE TABLE regions (
  region_id INT NOT NULL,
  region_name VARCHAR(25),
  PRIMARY KEY (region_id)
);

CREATE TABLE countries (
  country_id CHAR(2) NOT NULL,
  country_name VARCHAR(40),
  region_id INT NOT NULL,
  PRIMARY KEY (country_id),
  FOREIGN KEY (region_id) REFERENCES regions(region_id)
);

CREATE TABLE locations (
  location_id INT NOT NULL,
  street_address VARCHAR(40),
  postal_code VARCHAR(12),
  city VARCHAR(30) NOT NULL,
  state_province VARCHAR(25),
  country_id CHAR(2) NOT NULL,
  PRIMARY KEY (location_id),
  FOREIGN KEY (country_id) REFERENCES countries(country_id)
);
