Feature: Placing a bet


  Scenario Outline: The one where I place a bet and I have a credit balance
    Given I login with username: "<username>" and password: "<password>" and I have a credit balance on my account
    When I select a sport: "<sport>"
    And I enter a bet: "<bet>" for the first active bet
    Then I should get an indication of a return value
    And I should get an indication of the total bet: "<bet>" amount
    And my balance is reduced by the bet: "<bet>" amount

    Examples:
    |username   |password   |sport    |bet    |
    |WHATA_FOG2 |F0gUaTtest |football |0.05   |
    |WHATA_FOG2 |F0gUaTtest |tennis   |0.05   |

