package basics;

public class primeNumbers {

	public static void main(String[] args) {
		
		
				// Check whether number is passed 
		
		if(args.length ==0) {
			System.out.println("Number Is Missing !");
			return;
		}
			
				// Convert args[0] to int
				int n = Integer.parseInt(args[0]);
				boolean Prime = true;
		 
				for(int i = 2; i <= n/2; i++) {
					if( n % i == 0){
						
						Prime = false;
						break;
						
					}
				}
				// End of for
				
				if(Prime)
					System.out.println("Prime Number:");
				else
					System.out.println("Not A Prime: ");
				
			} // End of main

		

	}


