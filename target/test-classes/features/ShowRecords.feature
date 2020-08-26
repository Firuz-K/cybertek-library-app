Feature: Show record functionality



  Scenario: verify default valuxes in Users page
    When Librarian enters username and password and hits enter
    When I click on "Users" link
    Then show records default value should be 10
    And show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |

