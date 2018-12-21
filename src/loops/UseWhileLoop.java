package loops;

//WL check condition first, if statement is false, it won't work

public class UseWhileLoop {

	/*
	value //if value is true
	while (condition){
	//do some task
	}
	* whileLoop check the condition first, then do the task>Opposite to DoWhileLoop

	*/
	public static void main(String[] args) {
		
		int value = 10;
		
		/*while (value<0) { //if value statement is false, we're out of whileLoop/ loop will not do any task (nothing will be printed in console)
			System.out.println(value);
			value --;	//increment/decrement block/if no id block, loop will become a 'infinitLoop' & be working/printing forever without stoping
		}*/
		
		while (value>0) {//if value statement is true, loop will work (print in console)
			System.out.println(value);
			value--;
		}

	}

}
