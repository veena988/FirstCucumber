package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public static void netbanking()
	{
		System.out.println("***Before net banking set up***");
	}

	@Before ("@Mortage")
	public static void Mortage()
	{
		System.out.println("*****Before  Mortage set up*****");
	}
	
	public static void clear()
	{
		System.out.println("Before  Mortage set up");
	}
}
