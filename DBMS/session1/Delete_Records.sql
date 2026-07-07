INSERT INTO covid_19_india_db
(date, time, state, confirmed_indian_national,
confirmed_foreign_national, recoveries, deaths, confirmed_cases)
VALUES
('2020-03-18', '10:00:00', 'IN', 100, 10, 60, 2, 110);

DELETE FROM covid_19_india_db
WHERE state = 'IN';

DELETE FROM covid_19_india_db
WHERE id NOT IN
(
    SELECT MIN(id)
    FROM covid_19_india_db
    GROUP BY state, date
);
