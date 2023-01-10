-------Create a new Database-------
CREATE DATABASE HotelDBMS;
-------Use The database Created-------
USE HotelDBMS;
------- Show Tables-------
select * FROM Hotels;
select * FROM Room_Type;
select * FROM Rooms;
select * FROM Guests;
select * FROM Employee_Type;
select * FROM Employees;
--------------
-------Delete Records-------
DELETE FROM Rooms Where id is not null;

--------------
-------Drop Tables-------
Drop Table Rooms;
Drop Table Guests;
Drop Table Hotels;
Drop Table Employees;
--------------
--------------Insert Values in the Table--------------
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-09','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-08','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-07','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-06','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-05','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-04','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-03','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-02','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-01','2023-01-01',1 );
INSERT INTO Rooms
VALUES ( 1, 13,'2020-01-11','2023-01-01',1 );

SELECT * FROM Guests WHERE guest_name Like '%E';
SELECT * FROM Guests WHERE guest_payment_amount > 1000;