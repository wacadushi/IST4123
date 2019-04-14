M03-A04 README

V0.0
M03A04.java has a main method that runs all functions to ensure the rest of classes are working properly.

There are 4 object classes: Doctor, Patient, Pharmacist, and Person.

Doctor, Patient, and Pharmacist extend to Person object with basic attributes (first name, last name, email...)

PersonnelFactory.java is an implementation of Object-Oriented pattern. The class has a create function that determine which object to be initated with a String input.

DashBoardUI.java is an implementation of User Interface pattern. The class utilizes Java GUI library to create a simple dashboad that displays information about the object (Person).

The UI also includes temporary image for user profile. Further development will allow each dashboard to have its own unique image of an object.

V0.1

Added login functionality that has a temporary list of Person objects.

DashBoard UI is now connected to Navigation Menu UI.

MenuUI is added. (Profile and Quit buttons are implemented).