package loops;

//before checking condition, DWL do the task first for once, but 2nd time it won't work if statement is false
// DowhileLoop do the task first, then check the condition.>Opposite to whileLoop
//before check the condition, we're able to do task ONCE, thats the DoWhileLoop offer
//but upon checking condition (after single task), we're out of the loop and DWL will not work/print 

public class UseDoWhileLoop {

	public static void main(String[] args) {
		int value = 10;
		
		do {
			System.out.println(value);
		} while (value<0);//condition is false but DWL will do the task for once first without checking the condition
		

	}

}
