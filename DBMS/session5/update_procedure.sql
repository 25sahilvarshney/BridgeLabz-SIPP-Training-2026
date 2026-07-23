CREATE PROCEDURE UpdateCovidStats(
    IN p_country VARCHAR(100), 
    IN p_date DATE, 
    IN p_new_confirmed INT, 
    IN p_new_deaths INT, 
    IN p_new_recovered INT
)
BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
    END;

    START TRANSACTION;

    UPDATE covid_cases 
    SET confirmed = p_new_confirmed, 
        deaths = p_new_deaths, 
        recovered = p_new_recovered
    WHERE country = p_country AND last_updated_date = p_date;

    COMMIT;
END 