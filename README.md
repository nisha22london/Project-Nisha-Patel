# Project-Nisha-Patel
Project Title
The individual project completed by me was to build an application that an end user can interact with via a CLI (Command Line Interface). The application is an inventory management system which is able to add/view/update/delete customer to the system. Same with items in the systems. In addition, it also has features such as calculates cost of an order, update the quality of an item in a order and the total cost of order that exceed 10000 bulk get 10% discount is applied to the order. 
1)	To completed this project I used Kanban board with all the task that I had and had too complete in the project. Including in the issues that I faced. 
2)	I created my SQL statements a relational database used to store data persistently for the project, this database had my customer, order, item to demonstrate the relationship between them 
3)	I used eclipse’s to compete to write all my code out.
4)	Completed unit testing and integration tests for validation using unit and sonacube to get the best test coverage.

Getting Started
The project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
Prerequisites
What things you need to install the software and how to install them
In my project I had to install maven, eclipse, Visual Studio, violet editor,Jenkins,my SQL work beach Git

I had install all of them using the Local Disk(C:) under folder local install clicked installed them and run them all. 
 






Installing
A step by step series of examples that tell you how to get a development env running
Say what the step will be
Installing tools
Two tools you will need are the Java Development Kit (JDK) and Eclipse - an Integrated Development Environment (IDE).
•	The JDK can be found in: This PC > Local Disk (C:) > LocalInstall > SDK
•	The Eclipse IDE can be found in: This PC > Local Disk (C:) > LocalInstall > Editors
You’ll need to extract the folder here. You can then run the Eclipse.exe from the new folder.
Configuring Environment Variables
To get started with Java, you will need 1 thing: The Java Development Kit (JDK). This has everything you need to develop Java applications.
We will be using Eclipse mainly, but feel free to use another IDE if you prefer. 
Once you have the JDK there are a few steps you need to follow:
•	Install the JDK
•	Prepend C:\Program Files\Java\jdk…\bin (your path that you installed it too) to the beginning of the PATH variable
•	Enter java –version into command prompt to check that this has worked.
•	Install the IDE (Eclipse)
A couple of errors that are commonplace that you could encounter:
Error 1 / virtual box not found – either your paths or environment variables are wrong, or the JDK/JRE have not been installed.
Error 13 – you will need to edit the .ini file. Find the javaw.exe file in the JRE folder. In the .ini file,  add a new line before vmargs  –vm NEWLINE JAVAWPATH






Unit Tests
he primary goal of unit testing is to take the smallest piece of testable software in the application, isolate it from the remainder of the code, and determine whether it behaves exactly as you expect. Essentially, you are writing small bits of code to test the individual bits of your code.

Unit testing improves the quality of the code. It identifies every defect that may have come up before code is sent further for integration testing. Writing tests before actual coding makes you think harder about the problem. It exposes the edge cases and makes you write better code

Example of unit test is when I was testing my eclipse project and I used u unit to test my CustomerController class class and all anothers. 
You have to open a junit dependencies and copy it over to the pom.xml final and turn the test code for example a test code for CustomerController  :

@Test
	public void readAllTest() {
		CustomerController customerController = new CustomerController(customerServices);
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("fristname", "Address"));
		customers.add(new Customer("Rhys", "T"));
		Mockito.when(customerServices.readAll()).thenReturn(customers);
		assertEquals(customers, customerController.readAll());
	}
 
Integration Tests
Intergation Test is a level of software testing where individual units are combined and tested as a group. The purpose of this level of testing is to expose faults in the interaction between integrated units. Test drivers and test stubs are used to assist in Integration Testing.
Example of integration testing is when you test one class over and over again to check the quality of the code. 
Deployment
Deployment is a process through which the code/build is moved from one environment to another. Most of the organization these days follows a proper channel for the deployment, and maintains a separate team who takes care of all these. 

Built With
What things you need to install the software and how to install them.To use my code you will need to install:Git Bash
How to install: https://www.sitereq.com/post/easiest-way-to-install-git-bash-commands-on-windowsEclipse
How to install: https://www3.ntu.edu.sg/home/ehchua/programming/howto/EclipseJava_HowTo.htmlJava
How to install: https://java.com/en/download/help/download_options.xmlMaven
How to install: https://howtodoinjava.com/maven/how-to-install-maven-on-windows/mySQL
How to install: https://dev.mysql.com/doc/mysql-installation-excerpt/8.0/en/windows-install-archive.htmlGoogle Cloud Platform
How to install: https://cloud.google.com/sql/docs/sqlserver/quickstart

Maven
How to install: https://howtodoinjava.com/maven/how-to-install-maven-on-windows/
Versioning
We use SemVer for versioning.
Authors
Nisha Patel - Initial work - nishapatel
License
This project is licensed under the MIT license - see the LICENSE.md file for details
For help in Choosing a license
MIT License
Copyright (c) [2020] [Christopher Perrins]
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Acknowledgment
I would like to express my special thanks of gratitude to my trainer chris who gave me the golden opportunity to do this wonderful project on The application is an inventory management system 
 which also helped me in doing a lot of Research and I came to know about so many new things I am really thankful to them. I am really happy that I am learning coding and would like to be amazing programmer. 
Secondly, I would also like to thank my parents for guiding me after completing my master to join QA academy and build my career in to programming. 
I would like to express my special thanks to team who have helped me to attempt a level to satisfactorily project. 







