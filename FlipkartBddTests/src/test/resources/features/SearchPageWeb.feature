@FullSuite
Feature: As a traveller I want to know the Axa quotes for my travel insurance
  so that I choose the best plan

  @Smoke
  Scenario Outline: Verify quote generation for travel insurance
    Given I launch the app '<App>'
    Then I should see the search results page with '<pageTitle>'
    When I submit the quote to check various travel plans
    Then I should find various insurance plans as "Budget" "Economy" "Superior"
    Examples:
      | App                     | pageTitle                                                              |
      | Axa HK Travel Insurance | Travel Insurance \| Buy online \| SmartTraveller Plus \| AXA Hong Kong |




















  #@Demo
  Scenario Outline: Verify google page title
    Given I launch the app '<App>'
    Then I should see the default '<pageTitle>'

    Examples:
      | App    | pageTitle |
      | Google | Google    |

  #@Smoke
  Scenario Outline: Verify google search page launch
    Given I launch the app '<App>'
    When I search for a given '<keyword>'
    Then I should see the search results page with '<pageTitle>'

    Examples:
      | App    | keyword         | pageTitle                       |
      | Google | IMDB top movies | IMDB top movies - Google Search |

#  @Regression
#  Scenario Outline: Verify signup for insurance for a new user
#    Given I launch the app '<App>'
#    And I launch the register form for new user
#    When I fill all the user details
#    And I complete the registration
#    Then I should be able to login into  insurance dashboard
#
#    Examples:
#      | App         |
#      | Insurance |
#      | Insurance |