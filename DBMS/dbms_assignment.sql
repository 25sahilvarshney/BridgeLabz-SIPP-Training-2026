CREATE DATABASE covid_db;
USE covid_db;

CREATE TABLE covid_cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE,
    time VARCHAR(20),
    state VARCHAR(100),
    confirmed_indian_national INT,
    confirmed_foreign_national INT,
    recoveries INT,
    deaths INT,
    confirmed_cases INT
);

INSERT INTO covid_cases
(date, time, state, confirmed_indian_national,
confirmed_foreign_national, recoveries, deaths, confirmed_cases)
VALUES
('2020-03-15', '10 AM', 'India', 0, 0, 50, 2, 100);

UPDATE covid_cases
SET confirmed_cases = 120
WHERE state = 'India'
AND date = '2020-03-15';

DELETE FROM covid_cases
WHERE state = 'IN';

ALTER TABLE covid_cases
ADD vaccination_rate FLOAT;

DESC covid_cases;

SELECT * FROM covid_cases;
