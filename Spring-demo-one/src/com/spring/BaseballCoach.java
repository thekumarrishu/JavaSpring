package com.spring;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection 
	
	public BaseballCoach(FortuneService fs)
	{
		fortuneService = fs;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my Fortune service to get a fortune
		return fortuneService.getFortune();
	}

}
