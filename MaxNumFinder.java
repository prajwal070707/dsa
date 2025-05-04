package dsa;

public class MaxNumFinder {
	
	static int maxNum(int[] array) {
		int maxNum = array[0];
		
		for(int i=0; i< array.length; i++) {
			maxNum = (array[i]>maxNum)? array[i]: maxNum;
			
		}
		
		
		return maxNum;
	}
	
	public static void main(String[] args) {
		int [] array  = {3,2,5,7,1,77,8,67,-1,1412};
		
		System.out.println("Maximum Num: "+MaxNumFinder.maxNum(array));
		
		
	}

}
