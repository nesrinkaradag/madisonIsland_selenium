Feature: Filtering functionality
  @filter @test
  Scenario Outline: Choose menu and filter result than validate result
    Given the user is on the home page
    When user should click "<Menu>" from main menu and "<Submenu>" from submenu
    Then user should filter products according to price range between <minValue> and <maxValue>
    And prices should be betwwen <minValue> and <maxValue>
    Examples:
      | Menu    |  Submenu       |  minValue    | maxValue     |
      | Sale    | View All Sale  |      100     | 200          |
      | Sale    | View All Sale  |      200     | 1000         |
