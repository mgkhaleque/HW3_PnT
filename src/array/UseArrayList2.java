package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*Class exercise
array stores a collection of sequential collection of elements
They're homogeneous and fixed numbers.
The array elements are accessed through the index. Array indices are 0-based; that is, 
they start from 0 to arrayRefVar.length-1.

When processing array elements, we often use either for loop or foreach loop.
because all of the elements in an array are of the same type and the size of the array is known.



*/

public class UseArrayList2 {

	public static void main(String[] args) {
		int limit = 10;
		
		List<Integer> list = new ArrayList<Integer>();
	    Random random = new Random();
	    for (int i=0; i<limit; i++) {
	    	list.add(random.nextInt(100));
	    }
	    
	    for (int j=0; j<list.size(); j++) {
	    	System.out.println(list.get(j));
	    }
	
	}

}
