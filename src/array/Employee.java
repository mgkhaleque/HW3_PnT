package array;

//practice

	public class Employee {
		
		int eID;
		String eName;
		
		public Employee(int eID, String eName) {
			this.eID = eID;
			this.eName = eName;
		}
		
		public static void main(String []args) {
			
			Employee emp1 = new Employee(111, "Afrodite");
			Employee emp2 = new Employee(222, "Jews");
			Employee emp3 = new Employee(333, "Agamemnon");
			
			Employee []e = new Employee [5];
			e [0]= emp1;
			e [2]= emp2;
			e [4]= emp3;
			
			for (int i=0; i<e.length; i++) {
				if (e[i]==null) {
					System.out.println(i);
				}
			}
			
				
			
			
		}
	
		}
		
		    
			
		
		
		
		
			
			
		
		
		
		
	
	
	
	
	
	
	
	
	
	

