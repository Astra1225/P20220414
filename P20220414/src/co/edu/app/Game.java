package co.edu.app;

import java.util.*;

public class Game {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[5];
		int temp;
		
		for(int i=0; i<=5; i++) {
			int num = (int)(Math.random()*5)+1;
			System.out.println(num);
			
			for(int j = 0; j < i; j++)	//중복제거
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			
		}
		for (int i=0; i<arr[i]; i++ ) {
			for (int j=0; j< i; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					

				}
			}
		}
	
	System.out.println(arr);
	}
	
	
}

