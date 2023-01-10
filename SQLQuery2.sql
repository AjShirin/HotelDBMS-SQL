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
DELETE FROM Employees Where id is not null;

--------------
-------Drop Tables-------
Drop Table Rooms;
Drop Table Guests;
Drop Table Hotels;
Drop Table Employees;
--------------