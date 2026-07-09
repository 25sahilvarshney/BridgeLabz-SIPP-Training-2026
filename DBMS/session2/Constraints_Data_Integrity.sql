CREATE TABLE countries (
    Country VARCHAR(100) PRIMARY KEY,
    Country_Code VARCHAR(10)
);

CREATE TABLE covid_cases (
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Deaths INT DEFAULT 0,
    Recoveries INT DEFAULT 0,
    Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (Country, Date),

    CONSTRAINT fk_country
    FOREIGN KEY (Country)
    REFERENCES countries(Country),

    CONSTRAINT chk_deaths
    CHECK (Deaths <= Confirmed_Cases)
);