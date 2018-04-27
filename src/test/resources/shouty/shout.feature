Feature: Shout
  Scenario: Listener is within range
    Given Lucy is 15 meters from Sean
    When Sean shouts "Free bagels"
    Then Lucy hears Sean’s message

  Scenario: Listener hears a different message
    Given Lucy is 15 meters from Sean
    When Sean shouts "Free coffee"
    Then Lucy hears Sean’s message


   Scenario: Lesson 3 2.1
    Given Lucy shouts back to Sean

   Scenario: Lesson 3 2.1.2
    Given Lucy shouts back to Sarah


  Scenario: Lesson 3 2.2
    Given Sarah has 5 cucumbers in her bag

  Scenario: Lesson 3 2.2.2
    Given Sarah has 23 cucumbers in her bag
  Scenario: Lesson 3 2.2.3
    Given Sarah has 0 cucumbers in her bag

  Scenario: Lesson 3 2.2.4
    Given Sarah has 100 cucumbers in her bag


    Scenario: Lesson 3 2.3
      Given Sarah buys no cucumbers

    Scenario: Lesson 3 2.3.2
      Given Sarah buys 9999999 cucumbers

    Scenario: Lesson 3 2.3.3
      Given Sarah buys -3 cucumbers

    Scenario: Lesson 3 2.3.4
      Given Sarah buys 0 cucumbers?

    Scenario: Lesson 3 2.3.5
      Given  Sarah buys 1 cucumber

    Scenario: Lesson 3 2.3.6
      Given  He said: Sarah buys 2 cucumbers!




