package com.java.basics;
import java.util.Random;
public class DeckOfCards 
{
	/*
	 * Method created for Declaring Arrays for Cards & printing Random Cards combinations
	 */
	public static  void cards()
	{
		String suits[] = {"Heart","Diamond","Clove","Spade"};
		String ranks[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String deck[][] = new String[suits.length][ranks.length];
		int N = suits.length * ranks.length;   //Calculation for getting length of two combined Arrays

		int suitIndex = 0,rankIndex = 0;
		Random random = new Random();
		deck[suitIndex][rankIndex]=suits[random.nextInt(suits.length)]+" "+ranks[random.nextInt(ranks.length)];
		System.out.println(deck[suitIndex][rankIndex]); 
	}
	/*
	 * Driver/Main Program calls Cards function
	 */
	public static void main(String[] args)
	{
		for(int i=1 ; i<5; i++)
		{
			System.out.println("Player : " +i);
			System.out.println("------------");
			for(int j=1 ; j<10 ; j++)
			{
				cards();
			}
		}
	}
}
