package dataStructures;

public class SelectionSort {
	
	
	public int[] selectionSort(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			int min = array[i];
			for(int j=i+1; j<array.length;j++) {
				
				if(array[i] > array[j]) {
					 min = array[j];
				}
				if(min!=array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
			}			
			
			
			}
		
		}
		
		
		return array;
	}
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int [] array = {1,3,2,6,8,0,9,-13,5-15};
		int [] result = sort.selectionSort(array);
		for(int r: result) {
			System.out.print(r+" ");
		}
	}

}
