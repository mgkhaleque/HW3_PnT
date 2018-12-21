package array;
//default value of variables (int, boolean, String
public class Test2 {

	public static void main(String[] args) {
		
		int []a  = new int [5];//int output 0
		for (int aa:a) {//forEachLoop
			System.out.println(aa);
		}
		
		boolean []b = new boolean[5];//boolean output false
		for (boolean bb:b) {//forEachLoop
			System.out.println(bb);
		}
		
		String [] a1 = new  String [5];//String or user type data output null
		for (String a2:a1) {//forEachLoop
			System.out.println(a2);
		}

	}

}
