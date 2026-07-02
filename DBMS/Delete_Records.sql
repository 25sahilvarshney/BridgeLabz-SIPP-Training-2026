INSERT INTO covid_cases
(date, time, state, confirmed_indian_national,
confirmed_foreign_national, recoveries, deaths, confirmed_cases)
VALUES
('2020-03-18', '10:00:00', 'IN', 100, 10, 60, 2, 110);

DELETE FROM covid_cases
WHERE state = 'IN';

DELETE FROM covid_cases
WHERE id NOT IN
(
    SELECT MIN(id)
    FROM covid_cases
    GROUP BY state, date
);
