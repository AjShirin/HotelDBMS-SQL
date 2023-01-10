CREATE DATABASE HotelDBMS;
USE HotelDBMS;

select * FROM Hotels;
select * FROM Room_Type;
select * FROM Rooms;
select * FROM Guests;
select * FROM Employee_Type;
select * FROM Employees;

DELETE FROM Hotels Where id is not null;
WHERE is_Active = 1;

Drop Table Rooms;
Drop Table Guests;
Drop Table Hotels;
Drop Table Employees;
