SELECT State_UnionTerritory,
       Confirmed
FROM covid_19_india
WHERE Date = '2020-08-01'
ORDER BY Confirmed DESC
LIMIT 1;