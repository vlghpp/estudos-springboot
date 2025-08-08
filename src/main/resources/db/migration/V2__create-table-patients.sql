CREATE TABLE patients (
     id BIGINT NOT NULL AUTO_INCREMENT,           -- unique identifier (auto-incrementing)
     name VARCHAR(100) NOT NULL,                  -- doctor's full name
     email VARCHAR(100) NOT NULL UNIQUE,          -- unique email address
     cpf VARCHAR(11) NOT NULL UNIQUE,              -- CRM (medical license number), unique
     fone VARCHAR(15) NOT NULL,
     street VARCHAR(100) NOT NULL,                -- street address
     neighborhood VARCHAR(100) NOT NULL,          -- neighborhood
     zip_code VARCHAR(9) NOT NULL,                -- ZIP/postal code
     complement VARCHAR(100),                     -- address complement (optional)
     number VARCHAR(20),                          -- address number (optional)
     state CHAR(2) NOT NULL,                      -- state abbreviation (e.g., SP, RJ)
     city VARCHAR(100) NOT NULL,                  -- city name
     PRIMARY KEY(id)                              -- primary key for the table

);
