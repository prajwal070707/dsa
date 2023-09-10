package dataStructures;

public class BubbleSort {
	
	public static void bubbleSort() {
		
		int[] array = {12,-2,3,1,6,76,-9};
		
		for(int i=0; i<array.length-1; i++) {
			for(int j = i+1; j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp = array[i]; 
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
		for(int i: array) {
			System.out.print(i+ " ");
		}
	}
	
	public static void main(String[] args) {
		bubbleSort();
		
	}
	
	

}
