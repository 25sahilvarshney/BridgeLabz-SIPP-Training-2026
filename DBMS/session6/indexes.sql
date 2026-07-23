CREATE INDEX idx_country_date 
ON covid_cases (country, last_updated_date);


CREATE INDEX idx_last_updated_date 
ON covid_cases (last_updated_date);