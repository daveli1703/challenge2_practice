# SEPT_Challenge2_Preparation - Tasks

# COSC2299 - Process & Tools Challenge 2 (90 minutes)

Time allowed: 90 minutes

Total marks: 25

Submission: Source code + written answers in provided files

Open resources: Lecture notes only

Scenario: Online Vehicle Management System

# Scenario

You are working on a simple Vehicle Management System for an online vehicle sales platform.
The system allows users to add and view vehicles.

The application is written in Java and follows a layered architecture.

Each vehicle contains:

brand (String)

model (String)

year (int)

description (String)

---



**Question 1: Requirements & Planning (7.5 marks)**
*Q1.1 User Story (3 marks)*

- Write ONE (1) user story for the Add Vehicle feature.

- Use the format:
  As a (role), I want (goal) so that (benefit).

*Q1.2 Acceptance Criteria (4.5 marks)*

- Write TWO (2) acceptance criteria for your user story.

- Each acceptance criterion must:

  - Be clear
  
  - Be testable

- Describe observable system behaviour

Note: You may write your answers in a REQUIREMENTS.md file or as comments.


---


**Question 2: Implementation & Design Reasoning (6 marks)**

You are given a partially implemented codebase.

*Q2.1 Implement Add Vehicle (4 marks)*

- Implement the method below in VehicleService.java:

      public Vehicle addVehicle(Vehicle vehicle)

- The method must:

  - Reject vehicles with a year less than 1900
  
  - Reject vehicles where make or model is null or empty
  
  - Store the vehicle in memory (no database required)



*Q2.2 Design Reasoning (2 marks)*

- In 2–3 sentences, explain: Why validation belongs in the service layer rather than the controller

Note: Write your answer in DESIGN.md or as a comment.



---


**Question 3: Testing & Verification (11.5 marks)**



*Q3.1 Unit Testing (8 marks)*

- Write TWO (2) unit tests for the addVehicle() method using JUnit.

- Your tests must include:

  - One happy-path test
  
  - One failure case test

- Each test must:

  - Use meaningful assertions
  
  - Clearly describe what it is testing




*Q3.2 Test Reasoning (3.5 marks)*

- Briefly explain:

  - Why you chose these test cases
  
  - What kind of defect they help prevent

Note: Write your answer in TESTING.md or as comments.
