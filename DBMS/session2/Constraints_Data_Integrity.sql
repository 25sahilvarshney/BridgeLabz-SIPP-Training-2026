USE covid_19_india_db;

ALTER TABLE covid_19_india
MODIFY Confirmed INT NOT NULL;

ALTER TABLE covid_19_india
MODIFY Cured INT DEFAULT 0;

ALTER TABLE covid_19_india
MODIFY `State/UnionTerritory` VARCHAR(100);

ALTER TABLE covid_19_india
MODIFY Date VARCHAR(20);

ALTER TABLE covid_19_india
ADD CONSTRAINT uq_state_date
UNIQUE (`State/UnionTerritory`, Date);
