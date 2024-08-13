Feature: On the buttons page, the click me button will be checked.

  Background: Elements Page is opened.
    Given Open the Elements page


  Scenario: Click Me Button Test
    When Click on 'Button' button
    When Click on 'Click Me' button
    Then See the message "You have done a dynamic click"