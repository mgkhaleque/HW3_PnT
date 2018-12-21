package loops;

public class UseForLoop {
	
/* walk up to 10 blocks>  walk<10;
 * walk 10 blocks> walk<=10;
 * walk incremental like> walk=walk++
 * walk faster pace> walk=walk+2 or walk+3
 * we can use System.out.println statement in order to print result but it would be repetitive task, see below examples 
 * in order to avoid REPETITIVE task, we use ForLoop
 * 
 * ForLoop structure:
 * for (initialize block;conditional or terminator block;incremental/decremental block){ 
 * }
 * 
 */
	public static void main(String[] args) {
		
		/*
		System.out.println(1);//repetitive task
		System.out.println(2);
		System.out.println(3);
		*/
		
		
		for (int walk=0; walk<10;walk = walk+1 ) {//starting point;end point;rate or frequency of the task
			System.out.println(walk);
		}

	}

}	
