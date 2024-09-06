CREATE TABLE Venue_Master(
       Venue_Id VARCHAR(10) PRIMARY KEY,
       Event_Id VARCHAR(10),
       Venue_name VARCHAR(30),
       Location VARCHAR(50),
       Venue_Cost INT,
       Food VARCHAR(10),
       Capacity INT,
       Wifi VARCHAR(10),
	   Description VARCHAR(20),
       FOREIGN KEY(Event_Id) REFERENCES Event_Master(Event_Id)
);