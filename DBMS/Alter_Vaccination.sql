ALTER TABLE covid_19_india
ADD vaccination_rate FLOAT;

UPDATE covid_19_india
SET vaccination_rate = 76.5
WHERE state = 'India';

UPDATE covid_19_india
SET vaccination_rate = 82.1
WHERE state = 'USA';

UPDATE covid_19_india
SET vaccination_rate = 79.4
WHERE state = 'UK';
