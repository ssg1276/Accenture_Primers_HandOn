ALTER TABLE Booking_Master
ADD FOREIGN KEY (Enquiry_Id)
REFERENCES Enquiry_Master(Enquiry_Id);