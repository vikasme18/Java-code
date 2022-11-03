/* Database */
use anudip

/* Empolyee table */
CREATE TABLE emp(ENO int, ENAME varchar(25), SALARY int)
INSERT INTO emp VALUES(1, 'VIKAS', 30000),(2, 'ASHUTOSH', 80000),(3, 'BHAGYASHREE', 40000),(4, 'RAJNISH', 35000),(5,'RAVI', 50000)
select * from emp


/* Department table */
CREATE TABLE dept(DeptNo int, DeptName varchar(25), LOC varchar(30))
INSERT INTO dept VALUES(1, 'ACCOUNTING', 'NEW YORK'),(2, 'RESEARCH', 'DALLAS'),(3, 'SALES', 'CHICAGO'),(4, 'OPERATIONS', 'BOSTON'), (4, 'OPERATIONS', 'BOSTON')
SELECT * FROM dept
drop table dept


/* 1)Write A Queries For Given Below ‘String’ - ‘Hyderabad’ */ 
/* To Convert Upper Case */
SELECT UPPER('Hyderabad') AS City

/* To Display Only First 3 Letters */
SELECT SUBSTR('Hyderabad', 1, 3)

/* To Replace ‘Hyd’ With ‘Secun’ */
SELECT REPLACE('Hyderabad', 'Hyd', 'Secun')

/* To Find Position Of First ‘e’ Letter */
SELECT INSTR('Hyderabad', 'e')


/* 2)Write A Queries For Given Below ‘Date’ - ’15-Sep-20’ */
/* To Display Week Name For Above Date */
SELECT DAYNAME('20/09/15')

/* To Display Only Year In 4 Digits */
SELECT YEAR('20/09/15')

/* To Add 3 Months For Above Date */
SELECT DATE_ADD('20/09/15', INTERVAL 3 MONTH)

/* To Find Days Difference The Given Above Date To Today Date */
SELECT DATEDIFF(sysdate(),'20/09/15') 


/* 3)Write A Queries For Given Below ‘Number’ - 27.456 */
/* To Display Only Integer Part */
SELECT FLOOR(27.456)

/* To Get Sign Of That Number */
SELECT SIGN(27.456) -- If number > 0, it returns 1 and if the number < 0, it will returns -1

/* To Roundup Number With First Precision */ 
SELECT ROUND(27.456)

/* To Display Ceiled Number */
SELECT CEIL(27.456)


/* 4) Write A Query To Get Todays Date In ‘Dd-Mon-Yyyy’ */
SELECT DATE_FORMAT(sysdate(), '%d-%m-%Y') AS DATE

/* 5) Write A Query To Perform All Column Functions On ‘Salary’ Column In ‘Emp’ Table */
SELECT COUNT(SALARY) from emp
SELECT MAX(SALARY) from emp
SELECT MIN(SALARY) from emp
SELECT SUM(SALARY) from emp
SELECT AVG(SALARY) from emp

/* 6)Write A Query To Calc Deptno Wise Max,Min Salaries */
SELECT DeptNo, Max(SALARY), MIN(SALARY) FROM Dept GROUP BY DeptNo

/* 7)Write A Query To Get All Emp Details Order Wise Based On Salary Desc */
SELECT * FROM emp ORDER BY SALARY DESC

/* 8)Write A Query To Get Deptno WithOut Duplicates */
SELECT DISTINCT DeptNo FROM dept 

