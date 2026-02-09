CREATE DATABASE IF NOT EXISTS employee_db;
USE employee_db;

CREATE TABLE IF NOT EXISTS employee_profile (
    emp_id VARCHAR(20) PRIMARY KEY,
    full_name VARCHAR(100),
    gender VARCHAR(10),
    marital_status VARCHAR(20),
    role_type VARCHAR(50),
    primary_skills VARCHAR(100),
    secondary_skills VARCHAR(100),
    certifications VARCHAR(100),
    total_experience INT,
    achala_experience INT,
    skill_rating INT,
    skill_gaps VARCHAR(200),
    resourcing VARCHAR(5),
    night_oncall VARCHAR(5),
    comments VARCHAR(255)
);
