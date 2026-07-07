covid_deaths
covid_vaccines

CREATE TABLE covid_deaths (
    State_UnionTerritory VARCHAR(100),
    Deaths INT
);

SELECT d.State_UnionTerritory,
       d.Deaths,
       v.Vaccinated
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.State_UnionTerritory = v.State_UnionTerritory;