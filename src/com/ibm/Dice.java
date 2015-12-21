package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] dice;
		int i;
		boolean allSix = false;
		int sum=0;
		int count =0;
		dice = new int[4];
		while(!allSix) {
			sum = 0;
			count++;
			for (i = 0; i < 4; i++) {
				dice[i] = r.nextInt(6) + 1;
				System.out.print(dice[i] + ",");
				sum = sum + dice[i];
			}
			System.out.println("");
			if(sum==24)
			{
				allSix = true;
				System.out.println(count);
			}


		}

	}

}
