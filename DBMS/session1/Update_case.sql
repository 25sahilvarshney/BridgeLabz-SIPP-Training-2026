SET SQL_SAFE_UPDATES = 0;

UPDATE covid_19_india
SET Confirmed = 1200000
WHERE `State/UnionTerritory` = 'Delhi';

SELECT * 
FROM covid_19_india
WHERE `State/UnionTerritory` = 'Delhi';
