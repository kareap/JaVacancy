CREATE TABLE VACANCY(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  job_id VARCHAR (8) NOT NULL,
  job_title VARCHAR(40) NOT NULL,
  company_name VARCHAR(40) NOT NULL,
  location ENUM ('Oslo', 'Trondheim', 'Bergen', 'Stavanger') NOT NULL,
  experience ENUM ('Entry', 'Mid', 'Senior') NOT NULL,
  salary BIGINT NOT NULL,
  job_description VARCHAR(5000) NOT NULL,
  search_relevance BIGINT
);

CREATE TABLE APPLICATION (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR (25),
last_name VARCHAR (25),
email VARCHAR (40),
phone_number BIGINT,
application_text VARCHAR (5000),
vacancy_id BIGINT,
FOREIGN KEY (vacancy_id) REFERENCES VACANCY(id)
);



