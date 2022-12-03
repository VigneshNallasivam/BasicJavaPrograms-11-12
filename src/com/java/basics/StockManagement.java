package com.java.basics;
import java.util.Scanner;
public class StockManagement 
{
	public static int stock(int n)
	{
		int numOfStock = n;
		int numOfShare, sharePrice, valuePerShare;
		int valuation = 0;
		Scanner scanner = new Scanner(System.in);
        /*
         * Getting Share Price,Valuation & number of Share
         */
		for(int i = 0;i < numOfStock;i++) 
		{
			System.out.println("Enter details of stock-"+(i+1));
			System.out.println("How many number of shares you hold of stock-"+(i+1));
			numOfShare = scanner.nextInt();
			System.out.println("Enter the price of stock-"+(i+1));
			sharePrice = scanner.nextInt();
			valuePerShare = numOfShare*sharePrice;
			valuation = valuePerShare + valuation;
		}
		scanner.close();
		return valuation;
	}

	public static void printReport(int n,int stockValuation) 
	{
		System.out.println("Person holds total "+n+"stocks with valuation of "+stockValuation);
	}

	public static void main(String[] args)
	{
		System.out.println("Enter stocks you hold");
		Scanner scanner2 = new Scanner(System.in);
		int n = scanner2.nextInt();
		int stockValuation = stock(n);
	}
}

