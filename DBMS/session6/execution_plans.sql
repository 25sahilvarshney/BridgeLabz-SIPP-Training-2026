
EXPLAIN 
SELECT c.country, c.confirmed, v.doses_administered
FROM covid_cases c
JOIN vaccine_distribution v ON c.country = v.country AND c.last_updated_date = v.distribution_date
WHERE c.confirmed > 100000;