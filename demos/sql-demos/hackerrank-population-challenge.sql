DROP TABLE IF EXISTS city;

CREATE TABLE city (
	name VARCHAR(20),
	countrycode VARCHAR(3),
	population INTEGER
);

DROP TABLE IF EXISTS country;

CREATE TABLE country (
	code VARCHAR(3),
	name VARCHAR(50),
	continent VARCHAR(13)
);

INSERT INTO city 
VALUES 
('Tokyo', 'JPN', 38000000),
('Shanghai', 'CHN', 34000000),
('Harbin', 'CHN', 5000000),
('New York City', 'USA', 20000000),
('Toronto', 'CAN', 6000000),
('London', 'GBR', 14000000),
('Paris', 'FRA', 13000000);

INSERT INTO country 
VALUES
('JPN', 'Japan', 'Asia'),
('CHN', 'China', 'Asia'),
('USA', 'United States', 'North America'),
('CAN', 'Canada', 'North America'),
('GBR', 'Great Britain and Northern Ireland', 'Europe'),
('FRA', 'France', 'Europe');

SELECT con.continent, con.name, (COUNT(*))
FROM city c
INNER JOIN country con
ON c.countrycode = con.code
WHERE c.population > 4000000
GROUP BY con.continent, con.name
HAVING COUNT(*) > 1; -- aggregate functions can go inside HAVING, or SELECT, but not inside WHERE

DROP TABLE IF EXISTS songs;
CREATE TABLE songs 
(
	track_id INTEGER, -- candidate key
	album_id INTEGER, -- candidate key
	songdescription VARCHAR(255),
	PRIMARY KEY(track_id, album_id) -- composite key made up of the candidate keys
);

