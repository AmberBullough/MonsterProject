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
		MarshmallowMonster realMonster = new MarshmallowMonster("Vice", 3, 5, 5, true);
		
		System.out.println(realMonster);
		System.out.println("Vice is so hungry he is going to eat a tentacle!");
		realMonster.setTentacleAmount(4);
		System.out.println(realMonster);
		System.out.println("Vice is so hungry he is going to eat another tentacle and two legs!");
		realMonster.setTentacleAmount(3);
		realMonster.setArmCount(3);
		interactWithTheMonster(realMonster);
	}
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what to eat next.");
		System.out.println(currentMonster.getName() + " suggests arms. They have " + currentMonster.getArmCount());
		System.out.println("How many do you want to eat?");
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
	
		if(consumed < 0)
		{
			System.out.println("You cannot eat a negative amount silly human!");
			consumed = 0;
		}
		else if(consumed == 0)
		{
			System.out.println("Not that hungry are you?");
		}
		else if(consumed > currentMonster.getArmCount())
		{
			System.out.println("That is impossible! I only gave " + currentMonster.getArmCount() + " arms!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("Thank you so much! I only have this many arms now: " + currentMonster.getArmCount());
		}

		System.out.println(currentMonster.getName() + " wants to know what to eat next.");
		System.out.println(currentMonster.getName() + " suggests his chocolately red eyes. He has " + currentMonster.getEyeCount());
		System.out.println("How many do you want to eat?");
		int eyeConsumed = myScanner.nextInt();
	
		if(eyeConsumed < 0)
		{
			System.out.println("You cannot eat a negative amount silly human!");
			consumed = 0;
		}
		else if(eyeConsumed > currentMonster.getEyeCount())
		{
			System.out.println("That is impossible! I only gave " + currentMonster.getEyeCount() + " eyes!");
		}
		else if(eyeConsumed == 0)
		{
			System.out.println("Not that hungry are you?");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - eyeConsumed);
			System.out.println("Thank you so much! I only have this many eyes now: " + currentMonster.getEyeCount());
		}
		// This is showing why double doesn't work with ==
//		if (tentacle == currentMonster.getTentacleAmount())
//		{
//			System.out.println("Exact matches of double values are not guaranteed");
//			System.out.println("Only the sepcicified values are known, one digit beyond is not known, only");
//			System.out.println("Two digitsfurther and beyond is completely unknown each could be any number");
//		}
//		else
//		{
//			System.out.println("Sweet");
//		}
	}	
		{	
			popup.displayText("Hey! Look at me!");
			String answer = popup.getResponse("How many meals are you eating today?");
			System.out.println(answer);
			popup.displayText(answer);
		}		
	
}
