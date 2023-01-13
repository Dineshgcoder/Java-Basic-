package com.basic;

//Fibonacci Series using recursion
public class FibonacciSeriesUsingRec {
     static int a=0,b=1,c;
	public static void main(String[] args) 
	{
		System.out.print(a+" "+b);
		FibonacciSeriesUsingRec obj=new FibonacciSeriesUsingRec();
		obj.Fibo(10);
	}
	public void Fibo(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			Fibo(i-1);
		}
	}

}
