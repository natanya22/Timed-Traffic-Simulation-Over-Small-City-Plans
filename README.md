# Traffic-Signaling-Optimisation-Project
 Inspired by the Google Hash Code Problem on Traffic Signaling (help as many cars as possible reach their destination before a given deadline, and display this simulation as a graph). This is a Java Project that uses Java Swing and Graph Stream Library.
 

 **Important** - 

 Project uses JAR files , kindly include them in *Referenced Libraries* to import correctly 

 Preferably use IntelliJ. In case using VS Code , enter following commands in terminal for MAC -

 javac -cp .:path of project folder/ gs-algo-2.0.jar:path of project folder /gs-core-2.0.jar:path of project folder /gs-ui-swing-2.0.jar main1.java Output.java

 Hit Enter 

 java -cp .:path of project folder/gs-algo-2.0.jar:path of project folder/gs-core-2.0.jar:path of project folder/gs-ui-swing-2.0.jar main1



 **Objective of the project** :- 

 Creating effecient traffic schedules from given city plans 

 Given input test file , reading inputs for:
 
 
Simulation Time , No. of Intersections , No. of Streets, No. of Cars, Bonus Points 

(Intersection Start, Intersection End, Street Name, Street Time ) x no. of streets 

(No. of streets in a car path , Street1, Street2 , ....... ) x no. of cars 


**Example Input - **

6 4 5 2 1000

2 0 rue-de-londres 1

0 1 rue-d-amsterdam 1

3 1 rue-d-athenes 1

2 3 rue-de-rome 2

1 2 rue-de-moscou 3

4 rue-de-londres rue-d-amsterdam rue-de-moscou rue-de-rome

4 rue-d-athenes rue-de-moscou rue-de-londres rue-d-amsterdam



**Through these inputs ,there are following outcomes** : - 

1) *Car Path vs Time matrix* which denotes the street on which the car is at a particular time (manages *delay* which is occuring due to another car encountered in it's path).

2)  *Street vs Time matrix* which denotes the status of traffic light at every intersection at a given time (1 for Green and 0 for red).

3) Visual Simulation formed on the basis of above 2 matrices last for Simulation Time.

4) The relevant output is printed on the console . 



**Input Interface** :- 

1) It manages multiple test cases accessible through the use of buttons. 

Note - Press the button for testcases within 20 secs of compilation otherwise it will throw nullPointerException 

2) After pressing the button for test case the input file preview for that test case is shown on the interface and the corresponding visual simulation opens within a few seconds.  



**Concepts and tools used** :- 

1) Inheritance 
2) Abstraction
3) Interfaces (Comparator)
4) Collections Framework (Hashmap, Comparable)
5) Exception Handling 
6) Java Swing 
7) GraphStream Dynamic Library
