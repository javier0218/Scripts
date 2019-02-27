package ExecutionFrecuency;

public class TestCaseExecutionFrecuency {

			
		
   String csv= "TC, Execution Time, Status, duration \n"
           + "1, 2017-01-01, FAIL, 35 \n"
           + "1, 2017-01-01, PASS, 40 \n"
           + "2, 2017-01-01, PASS, 45 \n"
           + "3, 2017-01-01, PASS, 20 \n"
           + "4, 2017-01-01, FAIL, 300 \n"
           + "5, 2017-01-01, BLOCK, 350 \n"
           + "1, 2017-01-02, PASS, 10 \n"
           + "2, 2017-01-01, PASS, 15 \n"
           + "1, 2017-01-03, PASS, 25 \n";
   
   
	public void CountExecutions() {

		String[] numberExecution = csv.split("\n");

		int executions = (numberExecution.length - 1);

		System.out.println("Total Executions: " + executions);

	}

	public void CountTestCaseExecuted() {

		String[] numberExecution = csv.split("\n");

		int executions = (numberExecution.length - 1);

		System.out.println("Total TestCase: " + executions);

	}
	
	
	public void CountTestCasePass() {
		String[] numberExecutionPass = csv.split("\n");

		int count = 0;

		for (String pass : numberExecutionPass) {

			if (pass.contains("PASS")) {
				count++;
				
			}

		}

		System.out.println("Total TestCase Pass: " + count);
	}
	
	
	

		
		
	}
	
	
		
	




