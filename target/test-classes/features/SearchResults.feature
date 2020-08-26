Feature:


  Scenario: Table columns names
    Given User is on the login page
    When Librarian enters username and password and hits enter
    And I click on "Users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |