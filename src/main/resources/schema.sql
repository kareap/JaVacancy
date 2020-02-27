CREATE TABLE VACANCY(
  ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  jobId VARCHAR (8), NOT NULL,
  jobTitle VARCHAR(40) NOT NULL,
  companyName VARCHAR(40) NOT NULL,
  location ENUM ('Oslo', 'Trondheim', 'Bergen', 'Stavanger') NOT NULL,
  experience ENUM ('Entry', 'Mid', 'Senior') NOT NULL,
  salary ENUM ('Level1', 'Level2', 'Level3', 'Level4') NOT NULL,
  jobDescription VARCHAR(5000) NOT NULL,
  searchRelevance BIGINT
);


CREATE TABLE APPLICATION (
ID BIGINT AUTO_INCREMENT PRIMARY KEY,
firstName VARCHAR (25),
lastName VARCHAR (25),
email VARCHAR (40),
phoneNumber BIGINT,
applicationText VARCHAR (5000),
vacancyId BIGING FOREIGN KEY
);



