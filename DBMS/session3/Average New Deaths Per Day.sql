SELECT Date,
       AVG(Deaths) AS Avg_Daily_Deaths
FROM covid_19_india
GROUP BY Date
ORDER BY Date;