package array;

// insert constructor objects in to array and run

public class Emp {
	
	int eID;
	String eName;
	
	    public Emp(int eID, String eName) {
		this.eID = eID;
		this.eName = eName;
		//System.out.println(eID+" "+eName);
	}


	public static void main(String[] args) {
			Emp e1 = new Emp(111, "Ratan");
			Emp e2 = new Emp (222, "Krisna");
			Emp e3 = new Emp (333, "Vulu");
			
		    //insert the objects in to array
			
			Emp []e = new Emp[3];
			e [0]= e1;
			e [1]= e2;
			e [2]= e3;
			
			for (Emp ee:e) {
				System.out.println(ee.eID+ "  "+ee.eName);
			}
			
			
			
			
			
	}
}

