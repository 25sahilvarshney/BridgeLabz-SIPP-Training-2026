SELECT 
    country, 
    'Vaccinated' AS population_type, 
    SUM(vaccinated_count) AS population_count
FROM covid_vaccinations
GROUP BY country

UNION

SELECT 
    country, 
    'Unvaccinated' AS population_type, 
    SUM(unvaccinated_count) AS population_count
FROM covid_vaccinations
GROUP BY country;