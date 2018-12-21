package exception;

/* An Exception (as distinct from an exception) is an Object
 * a circumstance that a programmer chooses to handle outside the code that handles “normal cases”

 * The five steps in exception processing (in order) at run-time are:
 * recognize an exception, create an Exception, throw the Exception, detect the Exception, handle the exception
 * 
 * Java compiler can't catch arithmetical error during compile time except for runtime
 * Java compiler can catch Syntax error in compile time
 * in order to handle the 'run-time'exception/error, Java offers 'Try-Catch Block'
 * which is called "ExceptionHandling"
 * 
*/

public class ExceptionHandling {
	public static void main(String[] args) {
		int num1 = 10;
		
		//try block starts here
		try {
		int result = num1/0;
		System.out.println(result);
		}catch (Exception ex) {// 'ex' is a Exception-variable and could be described in any other word
			//ex.printStackTrace();instead we use System.out.println
			System.out.println("You are not allowed to divide a number by zero");
		}
		//try block ends here
		System.out.println("where is my result");
	}
}
