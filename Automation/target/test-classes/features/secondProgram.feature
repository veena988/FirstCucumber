Feature: login to payment testing
 
 Background:
 Given Delete the cooikes
 When launch the chrome browser
 And hit the home page
  
@Regression @NetBanking
  Scenario: login to  payment
    Given user is on the login payment page
    When user provide all details "user" and "12345" click on login
    Then Home will appear
    And Card number will be shown
    
# Reusable (one login with admin and another with user)
@Regression @Mortage
  Scenario: Admin to  payment
    Given user is on the login payment page
    When user provide all details "Admin" and "67890" click on login
    Then Home will appear
    And Card number will be shown

#Scenario outline: when we need to run same scenario with different set of data
@Smoke @Regression
	Scenario Outline: Admin to  payment
	  Given user is on the login payment page
    When user provide all details "<Username>" and "<password>" click on login
    Then Home will appear
    And Card number will be shown
    
  Examples:
  		| Username | password |
  		| user     | user123  |
  		| Admin    | Admin123 |    
  		
 #when we have multiple data to be send to one scenarion, then we can use list 
 @Smoke @Regression
   Scenario: signin to  payment
    Given user is on the signin payment page
    When user provide all details 
		|fistname|
		|lastname|
		|testing@gmail.com|
		|password@123|
		|phonenum|
    Then Home will appear
    And Card number will be shown

