package com.basic;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		int num=113;
		int temp=num;
		int len=0;
		
		while(temp!=0)
		{
			len=len+1;
			temp=temp/10;
		}
		
		int temp2=num;
		int arm=0;
		int rem;
		while(temp2!=0)
		{
			int mult=1;
			rem=temp2%10;
			for(int i=1;i<=len;i++)
			{
				mult=mult*rem;
			}
			arm=arm+mult;
			temp2=temp2/10;
		}
		if(arm==num)
		{
			System.out.println(num+" is armstrog");
		}
		else {
			System.out.println(num+" is not armstrog");
		}

	}

}
