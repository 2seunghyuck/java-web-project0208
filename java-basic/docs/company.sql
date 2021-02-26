-- 부서
CREATE TABLE dept (
    deptid number(2) NOT NULL,
    deptname VARCHAR(50) NULL
);

-- 부서
ALTER TABLE dept
  ADD CONSTRAINT PK_dept -- 부서 기본키
  PRIMARY KEY (
    deptid -- 부서번호
  );

-- 직원
CREATE TABLE emp (
    empid number(2) NOT NULL, -- 직원번호,
    empname VARCHAR(50) NULL, -- 직원이름,
    position VARCHAR(30) NULL, -- 직책,
    deptid number(2) NULL -- 부서번호
);

-- 직원
ALTER TABLE emp
  ADD CONSTRAINT PK_emp -- 직원 기본키
  PRIMARY KEY (
    empid -- 직원번호
  );

ALTER TABLE emp
  MODIFY COLUMN empid number(2) NOT NULL AUTO_INCREMENT;

ALTER TABLE emp
  MODIFY COLUMN empid number(2) NOT NULL AUTO_INCREMENT(1,1);

-- 근무기록
CREATE TABLE history (
    period VARCHAR(30) NULL, -- 기간,
    h_position VARCHAR(30) NULL, -- 직책,
    empid number(2) NULL, -- 직원번호,
    deptid number(2) NULL -- 부서번호
);

-- 가족
CREATE TABLE family (
    name VARCHAR(50) NOT NULL, -- 이름,
    empid number(2) NOT NULL, -- 직원번호,
    relation VARCHAR(30) NULL -- 관계
);

-- 가족
ALTER TABLE family
  ADD CONSTRAINT PK_family -- 가족 기본키
  PRIMARY KEY (
    name,  -- 이름
    empid  -- 직원번호
  );

-- 직원
ALTER TABLE emp
  ADD CONSTRAINT FK_dept_TO_emp -- 부서 -> 직원
  FOREIGN KEY (
    deptid -- 부서번호
  )
  REFERENCES dept ( -- 부서
    deptid -- 부서번호
  );

-- 근무기록
ALTER TABLE history
  ADD CONSTRAINT FK_emp_TO_history -- 직원 -> 근무기록
  FOREIGN KEY (
    empid -- 직원번호
  )
  REFERENCES emp ( -- 직원
    empid -- 직원번호
  );

-- 근무기록
ALTER TABLE history
  ADD CONSTRAINT FK_dept_TO_history -- 부서 -> 근무기록
  FOREIGN KEY (
    deptid -- 부서번호
  )
  REFERENCES dept ( -- 부서
    deptid -- 부서번호
  );

-- 가족
ALTER TABLE family
  ADD CONSTRAINT FK_emp_TO_family -- 직원 -> 가족
  FOREIGN KEY (
    empid -- 직원번호
  )
  REFERENCES emp ( -- 직원
    empid -- 직원번호
  );