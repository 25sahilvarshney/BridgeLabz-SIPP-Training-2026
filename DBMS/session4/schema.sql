

CREATE TABLE covid_deaths (
    id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100),
    deaths INT,
    record_date DATE
);

CREATE TABLE covid_cases (
    id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100),
    state VARCHAR(100),
    confirmed_cases INT,
    date DATE
);

CREATE TABLE covid_vaccinations (
    id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100),
    vaccinated_count INT,
    unvaccinated_count INT,
    record_date DATE
);