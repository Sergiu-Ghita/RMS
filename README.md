# RMS
Runway Management System 

Requirements: 

==============

Phase 1



Informal Description

================



Design a Java class for modeling a runway: it keeps a queue of the airplanes waiting to take off and a queue of airplanes waiting to land. Each airplane is assume to have a unique integer (denoting the flightnumber). There are methods to add planes to each queue, named waitToLand and waitToTakeOff. The runway may be empty or occupied.

There is a method that clears an occupied runway and makes it empty. 

There are also methods that allow for an airplane which is at the head of the queue for airplanes waiting to land and let it land on the runway, if it is not currently occupied. 

Similarly, there is a method that allows an airplane which is at the head of the queue for airplanes waiting to takeoff to taxi to the runway and occupy it, if it is not currently occupied. 





Deliverables

=============



There are two main deliverables for this phase: a single pdf file documenting the outcome of each and every of the following steps and a .zip file containing the source code of the software implemented as the final outcome of this phase.



Part 1: Interface and Test Design



Before starting any implementation, think of the data structures you need for this unit and a short description of the methods you need and what they should do.



The next part of this deliverable concerns the interface and the test design of the above-specified module. For the interface, you need to specify the signature of the methods: name, input argument types, and output return type. For each interface method, you need to give its specification in the following form:



/**



 Description



 Pre-condition:



 Post-condition:

 

 Test-cases:



*/





To design your tests, first use one of the functional testing methods (preferably: classification tree or decision table) to partition the domain of different inputs (or output) using the above-given requirements. Then define a test suite (a set of test-case) with concrete input values and expected outputs.



Your deliverables will be judged based on:



soundness: whether the interfaces have been correctly specified (according to the requirements), the test technique has been correctly exploited to design test cases, and



completeness: whether all requirements have been considered and all test-cases necessary to cover them have been given.



Part 2: Test Driven Development



For each and every method, apply the principles of test-driven development to implement the interfaces in order to satisfy each and every test-case. Each line of code should be augmented with the reason why it has been added (which test case it is supposed to satisfy). Before you start each step in the implementation, implement a test-case as a jUnit test, observe how it fails, add the line(s) of code necessary to satisfy it, observe that all tests pass afterwards and comment the line(s) of code to specify why they have been added. In your report, describe in a step-wise manner how each piece of implementation has been added to fulfil a test-case.



==============

Phase 2



Assume that the runway class keeps two queues of airplanes that wait for landing and take off. The runway class also keeps a reference to the airplane that is currently on the runway. 

Design and specify the interface of the airplane class so that it could be singled to land and takeoff and can be queried whether it is currently on the runway or not (if landed). 

Mock the airplane class so that each call to any airplane method is logged into the file. 



Perform the integration testing of the combination of runway and 3 airplanes in 2 different scenarios. 



There are two main deliverables for this phase:

a single pdf file documenting the mocked interfaces, the scenarios,  and the outcome of the integration testing.
a .zip file containing the source code of the software implemented. 

================

Phase 3

The idea is to model a system that can control the use of a runways for both departing and landing airplanes. 
The system consists of a runway management system and 3 airplanes that can be in landed,  departing, flying and approaching states.
A landed airplane requires a runway to go to the departing state and it can take at most 10 units of time to fly from a departing state. 
Likewise, a flying airplane requires a runway to become approaching and then has to move to the landed state within 10 units of time. 

Model this system as an automata, describe 3 scenarios in English and simulate them in UPPAAL and describe 3 properties of such a system, describe them as a logical formula and verify them using UPPAAL. 

You need to hand in a .zip file containing a report in the pdf format, UPPAAL models, simulation traces, and verification queries.  
   
============
