
Feature: Add product to card
  
	@PlaceOrder
  Scenario: In home page search item and increase quanity to 3 and addit to card and verify same in checkout page and check apply and proceed button is appearing 
    Given user is on home page 
    When user type short product name in search feild <item> and exact the search result 
    And Increase quanity to 3 by click on + and click on add to cart button
    And click on cart and click on proceed to checkout
    Then verify same item <item> is available in cart page
    And check Apply and proceed button in cart page

Examples:
|item|
|tom|