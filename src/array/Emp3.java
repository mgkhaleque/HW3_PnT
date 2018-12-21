package array;

//Find out index values of 'null/default' location

public class Emp3 {
	
	int eID;
	String eName;
	
	public Emp3(int eID, String eName) {
		this.eID = eID;
		this.eName = eName;	
	}

	public static void main(String[] args) {
		Emp3 e1 = new Emp3 (111, "Hector");
		Emp3 e2 = new Emp3 (222, "Achillis");
		Emp3 e3 = new Emp3 (333,"Afrodite");
		
		Emp3 [] e = new Emp3 [5];
		e [0] = e1;
		e [2] = e2;
		e [4] = e3;	
		
		for (int i =0; i<e.length; i++) {
			if (e [i]== null)
				System.out.println(i);
		}

	}

}
