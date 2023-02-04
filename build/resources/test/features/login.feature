@login
Feature:login into SawgLab Website

  @ok
  Scenario Outline: Successful login

    Given Andres Enters of the SawgLab website
    When he sends the following credentials <user> and <password>
    Then he should see the <tittle> products at Home page
    Examples:
      | user                    | password     | tittle   |
      | standard_user           | secret_sauce | Products |
      | performance_glitch_user | secret_sauce | Products |

  @failed
  Scenario Outline: Failed login

    Given Andres Enters of the SawgLab website
    When he sends the following credentials <user> and <password>
    Then he should see the alert message <alert> at Login page
    Examples:
      | user            | password     | alert                                                                     |
      | Andres          | Andres098    | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
