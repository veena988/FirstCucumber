Feature: Search the product
 
	@OfferCheck
  Scenario: Search product in home page and offer page and compare it
    Given user is on home page 
    When user type short product name in search feild <Name> and exact the search result  
    Then Same product <Name> search in offer page and check it exist
    And validate both product

Examples:
| Name |
| tom |
| beet |
