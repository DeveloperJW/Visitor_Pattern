# Visitor_Pattern
OOP-Project 4-Visitor Pattern


The visitor pattern represents an operation to be performed on the elements of an object structure. The purpose of Visitor
is to lets you define a new operation without changing the classes of the elements on which it operates.


Structure:
- A client that uses the Visitor pattern must create a ConcreteVisitor object and then
traverse the object structure, visiting each element with the visitor.
- When an element is visited, it calls the Visitor operation that corresponds to its class.
The element supplies itself as an argument to this operation to let the visitor access its
state, if necessary. 

In this project,
- Element: Employee.java;
- Concret Element:ManagerEmployee.java; GeneralEmployee.java;
- Visitor: Department.java;
- Concret Visitor: AccountingDept.java; HRDept.java;
- Client: Main.java;
