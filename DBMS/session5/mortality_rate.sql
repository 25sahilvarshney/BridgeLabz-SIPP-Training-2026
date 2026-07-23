CREATE FUNCTION CalculateMortalityRate(p_country VARCHAR(100), p_date DATE) 
RETURNS DECIMAL(5,2)
DETERMINISTIC
BEGIN
    DECLARE v_confirmed INT;
    DECLARE v_deaths INT;
    DECLARE v_rate DECIMAL(5,2);

    SELECT confirmed, deaths 
    INTO v_confirmed, v_deaths
    FROM covid_cases
    WHERE country = p_country AND last_updated_date = p_date;

    IF v_confirmed IS NULL OR v_confirmed = 0 THEN
        RETURN 0.00;
    END IF;

    SET v_rate = (v_deaths / v_confirmed) * 100;
    RETURN v_rate;
END 