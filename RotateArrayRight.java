package hackerRank;

public class RotateArrayRight {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<array.length-1; j++) {
				int temp = array[j+1];
				array[j+1] = array[j];
				array[j] = temp;
				
			}
			
			
		}
		System.out.println("This is left rotation:");
		for(int i: array) {
			System.out.print(i+" ");
		}
	}

}
