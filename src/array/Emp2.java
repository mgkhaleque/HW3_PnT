package array;

//nullPointerException
//Print assign values only
//Print assign+ null value in a one go


public class Emp2 {
	
	int eID;
	String eName;
	
	public Emp2(int eID, String eName) {
		this.eID = eID;
		this.eName = eName;	
	}
	public static void main(String[] args) {
		Emp2 e1 = new Emp2 (111, "Hector");
		Emp2 e2 = new Emp2 (222, "Achillis");
		Emp2 e3 = new Emp2 (333,"Afrodite");
		
		Emp2 [] e = new Emp2 [5];
		e [0] = e1;
		e [2] = e2;
		e [4] = e3;
		
		/*for(Emp2 ee :e) {
			System.out.println (ee.eID+ " ----"+ee.eName);
		} //printed only 111-----Hector or e1
		nullPointerException ends here
		*/
		
	//to avoid nullPointerException_(using forEachLoop)
		//created object class 'o' to print data ONLY	
		for(Object o :e) {
			if (o instanceof Emp2) {//instanceof operator check the object
				Emp2 ee = (Emp2)o;
			System.out.println(ee.eID+ " "+ee.eName);	
		}	
			//print null value too 
			if (o==null) {
				System.out.println(o);
			}
}

	}


}


	




			



