create database lab
use lab

/* Creating tables */
CREATE TABLE Branchs(Branchcode int PRIMARY KEY, Location varchar(10) NOT NULL)
INSERT INTO branchs value(101, 'Murbad'),(102, 'Kalyan'),(103, 'Dadar'),(104, 'Bhiwandi'), (105, 'Thane')

CREATE TABLE BankMaster(Acno int PRIMARY KEY, Cname varchar(25) NOT NULL, City varchar(40) DEFAULT 'Hyderabad', Balance int NOT NULL CHECK(balance >= 500), Branchcode int , FOREIGN KEY(Branchcode) REFERENCES Branchs(Branchcode))
INSERT INTO bankmaster value(42311, 'Vikas', 'Kalyan', 120000, 102), (65321, 'Ashutosh', 'Murbad', 240500, 101), (12344, 'Bhagyashree', 'Kalyan', 24000, 102), (32546, 'Rajnish', 'Kurla', 54300, 109), (23452, 'Gyanendra', 'Lonavala', 34000, 203)

CREATE TABLE banktransaction(Acno int, FOREIGN KEY(Acno) REFERENCES BankMaster(Acno), Ttype char(1), Tdate datetime NOT NULL, Amt int NOT NULL)
INSERT INTO banktransaction(42311, 'w', 2022-11-02, 9500),(65321, 'd', 2022-10-12, 15000),(12344, 'd', 2022-06-10, 20000),(10521, 'w', 2021-09-21, 5000),(8934, 'w', 2022-06-10, 10000)


/* 1)List the Bank Master details which customer have at least 30000 and above? */
select * from BankMaster where balance>=30000

/* 2)List the All branchs,Bank Master details which branch have the customers. */
SELECT * FROM  Branchs INNER JOIN BankMaster ON Branchs.Branchcode = BankMaster.Branchcode

/* 3)List the Bank master details which customer maximum no.of times ‘w’ transaction done. */
SELECT * FROM BankMaster Where Acno=(SELECT Acno FROM banktransaction WHERE Ttype = 'w')

/* 4)Find the total bal based on branch code and which branch total bal is above 100000 those branch,customer details. */
SELECT * FROM Branch, BankMaster WHERE BankMaster.Balance>100000 ORDER BY Branch.Branchcode

/* 5)To display all bankmaster details for given acno using ‘procedure’ */
CREATE PROCEDURE BankCustomerInfo
AS 
BEGIN
SELECT * FROM BankMaster WHERE Acno = 42311 OR Acno = 12344;
END

/* 6)To get all transaction details based on date wise. */
SELECT * FROM banktransaction ORDER BY Tdate

/* 7)To list the 3rd maximum balance customer details. */
SELECT * FROM BankMaster WHERE ORDER BY Balance ASC(SELECT * FROM BankMaster WHERE row_number() = 3)