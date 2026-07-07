
CREATE DATABASE covid_19_india_db;
USE covid_19_india_db;

CREATE TABLE covid_19_india (
    Sno INT PRIMARY KEY AUTO_INCREMENT,
    RecordDate DATE,
    RecordTime TIME,
    State_UnionTerritory VARCHAR(100),
    ConfirmedIndianNational INT DEFAULT 0,
    ConfirmedForeignNational INT DEFAULT 0,
    Cured INT DEFAULT 0,
    Deaths INT DEFAULT 0,
    Confirmed INT DEFAULT 0
);

CREATE TABLE covid_vaccine_statewise (
    State VARCHAR(100),
    TotalDosesAdministered BIGINT,
    SessionsConducted BIGINT,
    FirstDoseAdministered BIGINT,
    SecondDoseAdministered BIGINT
);

CREATE TABLE statewisetestingdetails (
    Date VARCHAR(20),
    State VARCHAR(100),
    TotalSamples BIGINT,
    Negative BIGINT,
    Positive BIGINT
);
