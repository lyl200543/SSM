CREATE DATABASE mybatis;
USE mybatis;

CREATE TABLE t_car(
id BIGINT PRIMARY KEY,
car_num VARCHAR(255),
brand VARCHAR(255),
guide_price DECIMAL(10,2),
produce_time CHAR(10),
car_type VARCHAR(255)
);

INSERT INTO t_car 
VALUES(1,100,'宝马520Li',41.00,'2022-09-01','燃油车')

INSERT INTO t_car 
VALUES(2,101,'奔驰E300L',54.00,'2022-08-01','电车')

SELECT * FROM t_car


