package array;

import java.util.Random;
//Class exercise

public class UserArrayList {

	public static void main(String[] args) {
		int [] array;
		array = new int [10];
		
		Random random = new Random();
		
		for (int i=0; i<array.length;i++) {
			//int bound100 = 0;
			//int bound;
			array [i]=random.nextInt(100);
		}
	
		for (int j=0; j<array.length; j++) {
			System.out.println(array [j]);
	}

}
}