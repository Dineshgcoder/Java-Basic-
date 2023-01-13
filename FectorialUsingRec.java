package com.basic;

public class FectorialUsingRec {
	 static int fact=1;
	public static void main(String[] args) {
		
		int num=4;
		FectorialUsingRec fur=new FectorialUsingRec();
		fur.callFact(num);
		System.out.println("Fectorial of "+num+" is:"+fact);

	}
     void callFact(int no)
     {
    	 if(no>=1)
    	 {
    		fact=fact*no; 
    		callFact(no-1);
    	 }
    	 
    	
     }
}
