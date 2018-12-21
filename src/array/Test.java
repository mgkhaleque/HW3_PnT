package array;

public class Test {

	public static void main(String[] args) {
		/*array use to store group of elements
		 * those must be homogeneous and fixed numbers
		 * index based, index starts with 0
		 * 3 steps: declare, instantiation or object creation & initialization or assign value
		 * OR, all 3 steps can be done in one go
		 */
          
		//1st approach:3 steps:
		
		/*declaring array:
		int[]a;
		//instantiation array:
		a = new int [5];
		// initialization or assign value:
		a [0]= 10;
		a [1] = 20;
		a [2] = 30;
		
		//2nd approach: 3steps in one go:
		int []a = {10, 20, 30, 50,60};//declaring, instantiation & initialization
		*/
		
		int []a = {10, 20, 30, 40};//declaring, instantiation & initialization
		
		//there are 3 approaches to print array data:
		
		System.out.println(a[0]);//1st approach
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		for (int i=0; i<a.length;i++);//2nd approach using for loop
		int i = 0;
		System.out.println(a[i]);
		
		for (int aa:a) {//3rd approach using forEachLoop
			System.out.println(aa);
			
			
			
		}
		
		
	
		
	}

}
