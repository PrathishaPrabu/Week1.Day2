package week1.Day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(i!=arr[i-1]) {
				int element=i;
				System.out.println("Missing element is "+ element);
				break;
			}
			
			
		}
	}
}