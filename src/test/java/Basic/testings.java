package Basic;

public class testings {
	

	static void status(int age) throws invalidageException {
		
		if(age>20) {
			
			System.out.println("elegible for marriage");
			
			
		}else {
			
			throw new invalidageException("you are not elgible");
		}
	}

	
			
			public static void main (String [] args) throws invalidageException {
				
				testings.status(10);
				
			}
		

	}


