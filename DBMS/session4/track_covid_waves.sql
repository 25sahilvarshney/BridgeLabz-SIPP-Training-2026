SELECT 
    c1.date,
    c1.state,
    c1.confirmed_cases,
    CASE 
        WHEN c1.confirmed_cases = (
            SELECT MAX(c2.confirmed_cases)
            FROM covid_cases c2
            WHERE c2.state = c1.state
              AND c2.date <= c1.date
        ) THEN 'Yes'
        ELSE 'No'
    END AS is_peak_to_date
FROM covid_cases c1
WHERE c1.state = 'Mumbai'
ORDER BY c1.date;