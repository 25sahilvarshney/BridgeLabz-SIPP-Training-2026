USE covid_19_india_db;

CREATE TABLE IF NOT EXISTS states (
    State_Name VARCHAR(100) PRIMARY KEY
);

INSERT IGNORE INTO states (State_Name)
SELECT DISTINCT `State/UnionTerritory`
FROM covid_19_india;

ALTER TABLE covid_19_india
MODIFY Confirmed INT NOT NULL;

ALTER TABLE covid_19_india
MODIFY Cured INT DEFAULT 0;

ALTER TABLE covid_19_india
ADD CONSTRAINT checking_deaths
CHECK (Deaths <= Confirmed);

ALTER TABLE covid_19_india
ADD CONSTRAINT uniques_death
UNIQUE (`State/UnionTerritory`, Date);

ALTER TABLE covid_19_india
ADD CONSTRAINT fkey_state
FOREIGN KEY (`State/UnionTerritory`)
REFERENCES states(State_Name);
