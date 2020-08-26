Feature: Login
  As a user i should be able to log in


  Scenario Outline: Login as Student
    Given User is on the login page
    When Student enters "<StudentUsername>" and "<StudentPassword>" and hits enter
    Then Account holder name should be "<name>"
    Examples:
      | StudentUsername   | StudentPassword |name|
      | student12@library | UC0LC9Hj        |Test Student 12|
      | student13@library | zcVbvUWH        |Test Student 13|
      | student15@library | Tt6UFxnY        |Test Student 15|

  @run
  Scenario Outline: Login as Librarian
    Given User is on the login page
    When Librarian enters "<LibrarianUsername>" and "<LibrarianPassword>" and hits enter
    Then Account holder name should be "<name>"

    Examples:

      | LibrarianUsername   | LibrarianPassword |name|
      | librarian19@library | 6M0J2Wr7          |Test Librarian 19|
      | librarian20@library | XXJTMgzA          |Test Librarian 20|
      | librarian21@library | aZ849tSZ          |Test Librarian 21|
      | librarian22@library | bJRnAAyp          |Test Librarian 22|
      | librarian14@library | 87x8afWY          |Test Librarian 14|