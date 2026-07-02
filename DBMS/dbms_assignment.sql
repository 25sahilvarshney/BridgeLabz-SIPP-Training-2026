
CREATE DATABASE CovidDB;


USE CovidDB;


CREATE TABLE covid_cases (
    Country VARCHAR(50),
    Report_Date DATE,
    Confirmed_Cases BIGINT,
    Deaths BIGINT,
    Recoveries BIGINT,
    Population BIGINT
);


CREATE TABLE covid_deaths (
    Country VARCHAR(50),
    Report_Date DATE,
    Total_Deaths BIGINT,
    Death_Rate DECIMAL(5,2)
);


CREATE TABLE covid_vaccines (
    Country VARCHAR(50),
    Report_Date DATE,
    Vaccinated_People BIGINT,
    Total_Doses_Administered BIGINT
);
