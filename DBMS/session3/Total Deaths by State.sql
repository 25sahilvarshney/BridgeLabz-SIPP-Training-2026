SELECT State_UnionTerritory,
       SUM(Deaths) AS Total_Deaths
FROM covid_19_india
GROUP BY State_UnionTerritory
ORDER BY Total_Deaths DESC;