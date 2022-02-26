# Traffic-Signaling-Optimisation-Project
 Google Hash Code Problem Traffic Signaling Java Project using Java Swing and Graph Stream Library

 **Important** - 

 Project uses JAR files , kindly include them in *Referenced Libraries* to import correctly 

 Preferably use IntelliJ. In case using VS Code , enter following commands in terminal for MAC -

 javac -cp .:path of project folder/ gs-algo-2.0.jar:path of project folder /gs-core-2.0.jar:path of project folder /gs-ui-swing-2.0.jar main1.java Output.java

 Hit Enter 

 java -cp .:path of project folder/gs-algo-2.0.jar:path of project folder/gs-core-2.0.jar:path of project folder/gs-ui-swing-2.0.jar main1



 **Objective of the project** :- 

 Creating effecient traffic schedules from given city plans 

 Given input test file , reading inputs for 
 
 
Simulation Time , No. of Intersections , No. of Streets, No. of Cars, Bonus Points 

(Intersection Start, Intersection End, Street Name, Street Time ) times no. of streets 

(No. of streets in a car path , Street1, Street2 , ....... ) times no. of cars 

Example Input - 

6 4 5 2 1000
2 0 rue-de-londres 1
0 1 rue-d-amsterdam 1
3 1 rue-d-athenes 1
2 3 rue-de-rome 2
1 2 rue-de-moscou 3
4 rue-de-londres rue-d-amsterdam rue-de-moscou rue-de-rome
4 rue-d-athenes rue-de-moscou rue-de-londres rue-d-amsterdam



**Through these inputs following outcomes** : - 

1) *Car Path vs Time matrix* which denotes the street on which the car is at a particular time (manages *delay* which is occuring due to another car encountered in it's path).

2)  *Street vs Time matrix* which denotes the status of traffic light at every intersection at a given time (1 for Green and 0 for red).

3) Visual Simulation formed on the basis of above 2 matrices last for Simulation Time.

4) The relevant output is printed on the console . 


**Input Interface** :- 

1) It manages multiple test cases accessible through the use of buttons. 

Note - Press the button for testcases within 20 secs of compilation otherwise it will throw nullPointerException 

2) After pressing the button for test case the input file preview for that test case is shown on the interface and the corresponding visual simulation opens .  




**Simulation** :- 

Output 

1) Tc buttons & download constructor , lambda expressions    

2) Download Button method 




**OOPs Concepts** :- 

*Classes*- 

1) Streets 
2) Intersection Schedules 
3) Priority 
4) 2 Pair classes 
5) Download
6) 


Concepts :- 

1) Inheritance 
2) Polymorphism (Overloading , Overriding toString)
3) Abstraction
4) Interfaces (Comparator)
5) Collections Framework ( Hashmap , Comparable)
6) Exception Handling 
7) Encapsulation (Data Hiding)
8) Swing 

9) Packages -  org.graphstream.graph.*,  javax.swing.*, java.lang, awt


**Conclusion and Limitation**

1) This is an *optimisation* based problem so as the no. of intersections, streets and cars are incr. the complexity of the city plan increases and the efficiency of the code decreases that's why it is named as traffic signalling optimisation .

2) The program requires input within 20 secs of compilation . 









javac -cp .:/Users/nat/Desktop/traffic/src/gs-algo-2.0.jar:/Users/nat/Desktop/traffic/src/gs-ui-swing-2.0.jar:/Users/nat/Desktop/traffic/src/gs-core-2.0.jar main1.java Output.java

java -cp .:/Users/nat/Desktop/traffic/src/gs-algo-2.0.jar:/Users/nat/Desktop/traffic/src/gs-ui-swing-2.0.jar:/Users/nat/Desktop/traffic/src/gs-core-2.0.jar main1
Exception in 