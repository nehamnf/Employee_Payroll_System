Employee Payroll System - Java OOP Concepts
-------------------------------------------
This repository demonstrates an Employee Payroll System built using core Object-Oriented Programming (OOP) principles in Java. The project is designed to help learners understand and apply OOP concepts such as Encapsulation, Abstraction, Inheritance, and Polymorphism through a real-world application.

Features:

Encapsulation: Employee details such as name, salary, and ID are kept private and accessed via getter and setter methods.                                                                                            
Abstraction: Abstract classes and interfaces are used to define common behavior across different types of employees (Full-time, Part-time, Contract-based).                                                          
Inheritance: A base Employee class is inherited by specialized employee types, enabling code reuse and cleaner structure.                                                                                            
Polymorphism: Demonstrates method overriding for calculating salary differently for various types of employees.

PayRollSystem Class:

The PayRollSystem class manages the employee payroll system, allowing you to:																																		
Add employees: Add different types of employees (full-time, part-time, contract) to the payroll.																													
Remove employees: Remove employees from the payroll by name.																																						
Calculate payroll: Iterate over all employees to calculate and display their salaries.																																

Classes:

Employee: Abstract class representing the core attributes and methods all employees share.                                                                                                                           
FullTimeEmployee: Inherits from Employee and calculates salary based on a fixed salary.    																															
PartTimeEmployee: Inherits from Employee and calculates salary based on hourly rates.																																
PayRollSystem: Manages the list of employees, handles adding/removing employees, and calculates payroll.																											

How to Use:

Clone the repository.
Open the project in your favorite Java IDE (IntelliJ, Eclipse, etc.).
Run the main program to see the payroll system in action, adding and removing employees, calculating salaries, and generating payroll reports.

Learning Objectives:

Understand and apply the four pillars of OOP (Encapsulation, Abstraction, Inheritance, Polymorphism).
Learn how to structure and design a Java project with clean, maintainable code.
Get hands-on experience building a real-world application using Java.

