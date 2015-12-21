package com.ibm;

import java.util.Random;

public class Lottery539 {
	int[] number = new int[5];
	
	public  Lottery539(){
		generate();
	}
	
	public Lottery539(int n1, int n2,int n3,int n4,int n5){
		number[0] = n1;
		number[1] = n2;
		number[2] = n3;
		number[3] = n4;
		number[4] = n5;
	}
	
	public Lottery539(int [] nums){
			this.number = nums;
	}
	
	protected boolean validate(){
		int[] spots = new int[39];
		for(int i = 0;i<5;i++){
			if(spots[number[i]] == 0){
				spots[number[i]] = 1;
			}
			else{
				return false;
			}
		}
		return true;
	}
	
	public void generate()
	{
		int n;
		Random r = new Random();
		
		int[] spots = new int[39];
		for (int i=0;i<5;i++)
		{
			n = r.nextInt(39)+1;
			if(spots[n]==1)
			{
				i--;
				continue;
			}else{
				number[i] = n;
				spots[n] = 1;
			}
			
			
		}
		
		
		
	}
	
	public void printLot()
	{
		for(int i=0;i<5;i++){
			System.out.print(number[i]+",");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lottery539 lot = new Lottery539(10,22,11,25,11);
		
		System.out.println(lot.validate());
		
	
		
		

	}

}
