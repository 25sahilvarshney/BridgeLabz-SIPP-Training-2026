CREATE VIEW latest_covid_data AS
SELECT country, confirmed, deaths, recovered, last_updated_date
FROM (
    SELECT country, confirmed, deaths, recovered, last_updated_date,
           ROW_NUMBER() OVER (PARTITION BY country ORDER BY last_updated_date DESC) AS rn
    FROM covid_cases
) t
WHERE rn = 1;