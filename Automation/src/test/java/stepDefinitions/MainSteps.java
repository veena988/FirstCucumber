package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	  @Given("user is on the login payment page") public void
	  user_is_on_the_login_payment_page() { 
		  System.out.println("user login page");
	   }
	 
		@Given("user is on the signin payment page")
		public void user_is_on_the_signin_payment_page() {
		}
		@When("user provide all details")
		public void user_provide_all_details(List<String> data) {
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println(data.get(2));
			System.out.println(data.get(3));
			System.out.println(data.get(4));
			
		}
		
		@When("user provide all details {string} and {string} click on login")
		public void user_provide_all_details_and_click_on_login(String name, String password) {
			  System.out.println("user need to give info" + name + " password " + password);
		    
		}
		@Then("Home will appear")
		public void home_will_appear() {
			  System.out.println("Validate home page");
		    
		}
		@Then("Card number will be shown")
		public void card_number_will_be_shown() {
			  System.out.println("verify card number is appearing");
		   
		}
		
		@Given("Delete the cooikes")
		public void delete_the_cooikes() {
			System.out.println("******************************");
		}
		@When("launch the chrome browser")
		public void launch_the_chrome_browser() {
			System.out.println("Launc the broswer");
		}
		@When("hit the home page")
		public void hit_the_home_page() {
			System.out.println("hit to home page");
		}


	}


