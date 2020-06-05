import java.util.Scanner;


public class EnemyShipTesting {
	
	 private static EnemyShipFactoryTop enemyship;

	    public static void main(String[] args) {
	    	
	    	Scanner userInput = new Scanner(System.in);
		    String enemyShipOption="";
			System.out.println("R or U ");
			
	        if (userInput.hasNextLine()) {
	        	enemyShipOption=userInput.nextLine();
	        	System.out.println("you entered "+enemyShipOption);
	        	if(enemyShipOption.equalsIgnoreCase("R")) {
	        		enemyship = new ConcreteRocketEnemyShipFactory();
				}else if(enemyShipOption.equalsIgnoreCase("U")) {
					enemyship  = new ConcreteUFOEnemyShipFactory();
				}  
	        } 
	        
	        enemyship.newEnemyShip();
	    }

	 

}

 
