Feature: Login functionality

  Scenario Outline: verify that user navigate to home page when user enter valid credentials
    Given  user in login page
    When user enter "<username>" and "<password>" and enter login
    Then user can access product page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

    Scenario Outline: verify that user can not navigate to home page when user enter invalid credentials

    Given  user in login page
    When user enter invalid "<username>" and "<password>" and enter login
    Then user can not access product page
Examples:
  | username | password    |
  |          |             |
  | username | password    |
  | #$#%^%$$ | 15225&*^&%& |

