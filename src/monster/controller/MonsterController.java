package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController 
{
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
		System.out.println();
	}
}
