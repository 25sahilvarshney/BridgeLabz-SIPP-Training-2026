SELECT State_UnionTerritory,
       Confirmed,
       Population,
       (Confirmed * 100.0 / Population) AS Infection_Rate
FROM covid_19_india
ORDER BY Infection_Rate DESC;