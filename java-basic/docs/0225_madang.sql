-- 도서
CREATE TABLE book (
    bookid number(2) NOT NULL -- 도서,
    bookname VARCHAR(40) NULL -- 책이름,
    publisher VARCHAR(40) NULL -- 출판사,
    price number NULL -- 가격
);

-- 도서
ALTER TABLE book
  ADD CONSTRAINT PK_book -- 도서 기본키
  PRIMARY KEY (
    bookid -- 도서
  );

-- 고객
CREATE TABLE customer (
    custid number(2) NOT NULL -- 고객번호,
    name VARCHAR(50) NULL -- 이름,
    address VARCHAR(255) NULL -- 주소,
    phone VARCHAR(30) NULL -- 전화번호
);

-- 고객
ALTER TABLE customer
  ADD CONSTRAINT PK_customer -- 고객 기본키
  PRIMARY KEY (
    custid -- 고객번호
  );

-- 주문
CREATE TABLE orders (
    orderid number(2) NOT NULL -- 주문번호,
    custid number(2) NOT NULL -- 고객번호,
    bookid number(2) NOT NULL -- 도서,
    saleprice number NULL -- 가격,
    orderdate DATE NULL -- 주문일
);

-- 주문
ALTER TABLE orders
  ADD CONSTRAINT PK_orders -- 주문 기본키
  PRIMARY KEY (
    orderid, -- 주문번호
    custid,  -- 고객번호
    bookid   -- 도서
  );

-- 주문
ALTER TABLE orders
  ADD CONSTRAINT FK_book_TO_orders -- 도서 -> 주문
  FOREIGN KEY (
    bookid -- 도서
  )
  REFERENCES book ( -- 도서
    bookid -- 도서
  );

-- 주문
ALTER TABLE orders
  ADD CONSTRAINT FK_customer_TO_orders -- 고객 -> 주문
  FOREIGN KEY (
    custid -- 고객번호
  )
  REFERENCES customer ( -- 고객
    custid -- 고객번호
  );