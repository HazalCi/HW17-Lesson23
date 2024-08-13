Feature: It will be checked that records can be added and changed in the table.

  Scenario Outline: Add and Edit Record Test
    Given Open the WebTables page
    When Add a new record with '<firstname>', '<lastname>', '<email>', '<age>', '<salary>' and '<department>'
    When Change the age of the record to 27
    Then See the age of the record as "27"
    Examples:
      | firstname | lastname | email 			      | age | salary | department |
      | Hazal     | Cigerim  | hazalcigerim@gmail.com | 25  | 1000   | R&D        |



