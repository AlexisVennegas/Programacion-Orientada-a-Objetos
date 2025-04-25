-- Tabla REGIONS
INSERT INTO regions (region_id, region_name) VALUES (1, 'Europe');
INSERT INTO regions (region_id, region_name) VALUES (2, 'Americas');
INSERT INTO regions (region_id, region_name) VALUES (3, 'Asia');
INSERT INTO regions (region_id, region_name) VALUES (4, 'Middle East and Africa');

-- Tabla COUNTRIES
INSERT INTO countries (country_id, country_name, region_id) VALUES ('IT', 'Italy', 1);
INSERT INTO countries (country_id, country_name, region_id) VALUES ('JP', 'Japan', 3);
INSERT INTO countries (country_id, country_name, region_id) VALUES ('US', 'United States', 2);
INSERT INTO countries (country_id, country_name, region_id) VALUES ('CA', 'Canada', 2);
INSERT INTO countries (country_id, country_name, region_id) VALUES ('CN', 'China', 3);
INSERT INTO countries (country_id, country_name, region_id) VALUES ('IN', 'India', 3);

-- Tabla LOCATIONS
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id) 
VALUES (1000, '1297 Via Cola di Rie', '989', 'Roma', 'RM', 'IT');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id) 
VALUES (1100, '93091 Calle della Luna', '10934', 'Venice', 'VE', 'IT');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id) 
VALUES (1200, '2014 Jabberwocky Rd', '26192', 'Southlake', 'Texas', 'US');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id) 
VALUES (1300, '3-2-1 Roppongi', '106-0032', 'Tokyo', 'Tokyo', 'JP');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id) 
VALUES (1400, '1 Zhongguancun St', '100080', 'Beijing', 'Beijing', 'CN');
INSERT INTO locations (location_id, street_address, postal_code, city, state_province, country_id) 
VALUES (1500, '12 MG Road', '560001', 'Bangalore', 'Karnataka', 'IN');
