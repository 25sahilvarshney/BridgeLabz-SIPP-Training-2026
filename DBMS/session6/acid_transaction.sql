CREATE PROCEDURE InsertVaccineDataAtomic()
BEGIN
    
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        SELECT 'Transaction Failed. Changes rolled back.' AS Status;
    END;

    -- Start multi-statement transaction
    START TRANSACTION;

    INSERT INTO vaccine_distribution (country, distribution_date, doses_administered)
    VALUES ('India', '2026-03-01', 500000);

    INSERT INTO vaccine_distribution (country, distribution_date, doses_administered)
    VALUES ('USA', '2026-03-01', 300000);


    COMMIT;
    SELECT 'Transaction Completed Successfully.' AS Status;
END 