package com.basic;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class GenerateRandomNum {

	public static void main(String[] args) {
		//using Random class
		//Random rd=new Random();
		//System.out.println(rd.nextInt(10));
		
		//using math
		//System.out.println(Math.random());
		
		
		//Using the ThreadLocalRandom Class
		System.out.println(ThreadLocalRandom.current().nextInt());
		
		

	}

}
