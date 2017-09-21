package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController 
{
	private MonsterDisplay popup;
		
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	
	

public void start ()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		
		popup.displayText(sample.toString());
		MarshmallowMonster realMonster = new MarshmallowMonster("Vice", 3, 5, 5, true);
		
		System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		popup.displayText("Vice is so hungry he is going to eat a tentacle!");
		//System.out.println("Vice is so hungry he is going to eat a tentacle!");
		realMonster.setTentacleAmount(4);
		System.out.println(realMonster);
		//System.out.println("Vice is so hungry he is going to eat another tentacle and two legs!");
		popup.displayText("Vice is so hungry he is going to eat another tentacle and two legs!");
		realMonster.setTentacleAmount(3);
		realMonster.setArmCount(3);
		interactWithTheMonster(realMonster);
		//line above is giving an error so take a peek at it.
	}
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		//System.out.println(currentMonster.getName() + " wants to know what to eat next.");
		//System.out.println(currentMonster.getName() + " suggests arms. They have " + currentMonster.getArmCount());
		//System.out.println("How many do you want to eat?");
		popup.displayText(currentMonster.getName() + " wants to know what to eat next.");
		popup.displayText(currentMonster.getName() + " suggests arms. They have " + currentMonster.getArmCount());
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
		String unconverted = popup.getResponse("How many do you want to eat?");
		int specialAnswer;
		if(isValidInteger(unconverted))
		
		{
			specialAnswer = Integer.parseInt(unconverted);
		}
		
		if(consumed < 0)
		{
			//System.out.println("You cannot eat a negative amount silly human!");
			popup.displayText("You cannot eat a negative amount silly human!");
			consumed = 0;
		}
		else if(consumed == 0)
		{
			//System.out.println("Not that hungry are you?");
			popup.displayText("Not that hungry are you?");
		}
		else if(consumed > currentMonster.getArmCount())
		{
			//System.out.println("That is impossible! I only gave " + currentMonster.getArmCount() + " arms!");
			popup.displayText("That is impossible! I only gave " + currentMonster.getArmCount() + " arms!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			//System.out.println("Thank you so much! I only have this many arms now: " + currentMonster.getArmCount());
			popup.displayText("Thank you so much! I only have this many arms now: " + currentMonster.getArmCount());
		}

		//System.out.println(currentMonster.getName() + " wants to know what to eat next.");
		popup.displayText(currentMonster.getName() + " wants to know what to eat next.");
		popup.displayText(currentMonster.getName() + " suggests his chocolately red eyes. He has " + currentMonster.getEyeCount());
		//System.out.println(currentMonster.getName() + " suggests his chocolately red eyes. He has " + currentMonster.getEyeCount());
		String unconverted = popup.getResponse("How many do you want to eat?");
		//Don't know why unconverted is underlined
		//System.out.println("How many do you want to eat?");
		int eyeConsumed = myScanner.nextInt();
	
		if(eyeConsumed < 0)
		{
			//System.out.println("You cannot eat a negative amount silly human!");
			consumed = 0;
			popup.displayText("You cannot eat a negative amount silly human!");
		}
		else if(eyeConsumed > currentMonster.getEyeCount())
		{
			//System.out.println("That is impossible! I only gave " + currentMonster.getEyeCount() + " eyes!");
			popup.displayText("That is impossible! I only gave " + currentMonster.getEyeCount() + " eyes!");
		}
		else if(eyeConsumed == 0)
		{
			//System.out.println("Not that hungry are you?");
			popup.displayText("Not that hungry are you?");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - eyeConsumed);
			//System.out.println("Thank you so much! I only have this many eyes now: " + currentMonster.getEyeCount());
			popup.displayText("Thank you so much! I only have this many eyes now: " + currentMonster.getEyeCount());
		}
		
		popup.displayText(currentMonster.getName()+ " wants to eat his arms next. How many do you want him to eat?");
		int armsConsumed = myScanner.nextInt(); 
		// This is showing why double doesn't work with ==
		if (armsConsumed == currentMonster.getArmCount())
		{
			//System.out.println("Exact matches of double values are not guaranteed");
			popup.displayText("Exact matches of double values are not guaranteed");
			//System.out.println("Only the specified values are known, one digit beyond is not known, only");
			popup.displayText("Only the specified values are known, one digit beyond is not known, only");
			//System.out.println("Two digits further and beyond is completely unknown each could be any number");
			popup.displayText("Two digits further and beyond is completely unknown each could be any number");
		}
		else
		{
			//System.out.println("Sweet");
			popup.displayText("Sweet!");
		}
	
	
	
			popup.displayText("Hey! Look at me!");
			String answer = popup.getResponse("How many meals are you eating today?");
			System.out.println(answer);
			popup.displayText(answer);
	}
	


	//Helper Methods
		private boolean isValidInteger(String sample)	
	{
		boolean valid = false;
		
		try
		{ 
			Integer.parseInt(sample);
			valid = true;
	}
	catch(NumberFormatException error)
		{
		 	popup.displayText("Only integers values are valid: " + sample + " is not.");
		}
	return valid;
	}
	private boolean isValidDouble(String sampleDouble)
	//not an error is just telling me about it
	{
		Boolean valid = false;
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only double values are valid: " + sampleDouble + " is not.");
		}
		return valid;
			
		}
}

