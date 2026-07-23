CREATE TRIGGER before_covid_update
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN
    INSERT INTO covid_audit_log (country, old_confirmed, new_confirmed, old_deaths, new_deaths, changed_at)
    VALUES (OLD.country, OLD.confirmed, NEW.confirmed, OLD.deaths, NEW.deaths, NOW());
END 