/*
Created: 2021-02-26
Modified: 2021-02-26
Model: Oracle 11g Release 2
Database: Oracle 11g Release 2
*/


-- Create tables section -------------------------------------------------

-- Table dept

CREATE TABLE dept(
  deptid Varchar2(30 ) NOT NULL,
  deptname Varchar2(20 )
)
;

-- Add keys for table dept

ALTER TABLE dept ADD CONSTRAINT PK_dept PRIMARY KEY (deptid)
;

-- Table emp

CREATE TABLE emp(
  empid Varchar2(30 ) NOT NULL,
  empname Varchar2(30 ),
  position Varchar2(30 ),
  deptid Varchar2(30 ) NOT NULL
)
;

-- Create indexes for table emp

CREATE INDEX IX_Relationship1 ON emp (deptid)
;

-- Add keys for table emp

ALTER TABLE emp ADD CONSTRAINT PK_emp PRIMARY KEY (empid)
;

-- Table history

CREATE TABLE history(
  period Varchar2(30 ),
  h_position Varchar2(30 ),
  deptid Varchar2(30 ) NOT NULL,
  empid Varchar2(30 ) NOT NULL
)
;

-- Create indexes for table history

CREATE INDEX IX_Relationship3 ON history (deptid)
;

CREATE INDEX IX_Relationship4 ON history (empid)
;

-- Add keys for table history

ALTER TABLE history ADD CONSTRAINT PK_history PRIMARY KEY (deptid,empid)
;

-- Table family

CREATE TABLE family(
  name Varchar2(30 ) NOT NULL,
  relation Varchar2(30 ),
  empid Varchar2(30 ) NOT NULL
)
;

-- Add keys for table family

ALTER TABLE family ADD CONSTRAINT PK_family PRIMARY KEY (empid,name)
;


-- Create foreign keys (relationships) section ------------------------------------------------- 

ALTER TABLE emp ADD CONSTRAINT dept_emp FOREIGN KEY (deptid) REFERENCES dept (deptid)
;



ALTER TABLE family ADD CONSTRAINT emp_family FOREIGN KEY (empid) REFERENCES emp (empid)
;



ALTER TABLE history ADD CONSTRAINT dept_history FOREIGN KEY (deptid) REFERENCES dept (deptid)
;



ALTER TABLE history ADD CONSTRAINT emp_history FOREIGN KEY (empid) REFERENCES emp (empid)
;





