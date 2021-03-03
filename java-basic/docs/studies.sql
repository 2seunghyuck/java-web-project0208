

-- 학생
CREATE TABLE student (
    student_id VARCHAR2(9) NOT NULL, -- 학번,
    name VARCHAR2(20) not NULL, -- 이름,
    semester number NULL, -- 등록학기,
    credit number NULL, -- 이수학점,
    average_code number NULL, -- 평균평점,
    dept_code VARCHAR2(20) NULL -- 학과코드
);

-- 학생
ALTER TABLE student
  ADD CONSTRAINT PK_student -- 학생 기본키
  PRIMARY KEY (
    student_id -- 학번
  );

-- 학과
CREATE TABLE department (
    dept_code VARCHAR2(20) NOT NULL, -- 학과코드,
    dept_name VARCHAR2(30) NULL -- 학과명
);

-- 학과
ALTER TABLE department
  ADD CONSTRAINT PK_department -- 학과 기본키
  PRIMARY KEY (
    dept_code -- 학과코드
  );

-- 과목
CREATE TABLE course (
    course_code VARCHAR2(10) NOT NULL, -- 과목코드,
    course_name VARCHAR2(20) NULL, -- 과목명,
    target_semester number NULL, -- 대상학기,
    unit number NULL, -- 학점수,
    dept_code VARCHAR(20) NULL -- 학과코드
);

-- 과목
ALTER TABLE course
  ADD CONSTRAINT PK_course -- 과목 기본키
  PRIMARY KEY (
    course_code -- 과목코드
  );

-- 수강
CREATE TABLE attend (
    attend_semester number NULL, -- 수강학기,
    student_id VARCHAR2(9) NOT NULL, -- 학번,
    course_code VARCHAR2(10) NOT NULL, -- 과목코드,
    grade VARCHAR2(2) NULL -- 성적등급
);

-- 수강
ALTER TABLE attend
  ADD CONSTRAINT PK_attend -- 수강 기본키
  PRIMARY KEY (
    student_id,  -- 학번
    course_code  -- 과목코드
  );

-- 학생
ALTER TABLE student
  ADD CONSTRAINT FK_department_TO_student -- 학과 -> 학생
  FOREIGN KEY (
    dept_code -- 학과코드
  )
  REFERENCES department ( -- 학과
    dept_code -- 학과코드
  );

-- 과목
ALTER TABLE course
  ADD CONSTRAINT FK_department_TO_course -- 학과 -> 과목
  FOREIGN KEY (
    dept_code -- 학과코드
  )
  REFERENCES department ( -- 학과
    dept_code -- 학과코드
  );

-- 수강
ALTER TABLE attend
  ADD CONSTRAINT FK_student_TO_attend -- 학생 -> 수강
  FOREIGN KEY (
    student_id -- 학번
  )
  REFERENCES student ( -- 학생
    student_id -- 학번
  );

-- 수강
ALTER TABLE attend
  ADD CONSTRAINT FK_course_TO_attend -- 과목 -> 수강
  FOREIGN KEY (
    course_code -- 과목코드
  )
  REFERENCES course ( -- 과목
    course_code -- 과목코드
  );