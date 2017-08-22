1.Tutorial: https://www.tutorialspoint.com/spring/spring_jdbc_example.htm

Why use Spring Jdbc over just Jdbc APi:
    a. A lot of code is needed before and after executing the query, such as creatin connection, statement, closing statemnt
    b. We need exception handling
    c. Overall faster performance


Steps	Description
1	Create a project with a name SpringExample and create a package com.tutorialspoint under the src folder in the created project.
2	Add required Spring libraries using Add External JARs option as explained in the Spring Hello World Example chapter.
3	Add Spring JDBC specific latest libraries mysql-connector-java.jar, org.springframework.jdbc.jar and org.springframework.transaction.jar in the project. You can download required libraries if you do not have them already.
4	Create DAO interface StudentDAO and list down all the required methods. Though it is not required and you can directly write StudentJDBCTemplate class, but as a good practice, let's do it.
5	Create other required Java classes Student, StudentMapper, StudentJDBCTemplate and MainApp under the com.tutorialspoint package.
6	Make sure you already created Student table in TEST database. Also make sure your MySQL server is working fine and you have read/write access on the database using the give username and password.
7	Create Beans configuration file Beans.xml under the src folder.
8	The final step is to create the content of all the Java files and Bean Configuration file and run the application as explained below.


NOTE: only use mysql:mysql-connector-java:5.1.39 as there seems to be an issue with timezone for the jdbc driver in newer versions