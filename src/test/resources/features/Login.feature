

  Feature: Login
    As a user i should be able to log in


    Scenario: Login as Student
      Given User is on the login page
      When Student enters username and password and hits enter
      Then User should see Borrowing books


    Scenario: Login as Librarian
     Given User is on the login page
      When Librarian enters username and password and hits enter
      Then User should be on the homepage
