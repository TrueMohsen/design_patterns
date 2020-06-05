

public class RocketEnemyShip implements EnemyShip {
 
	private String name="" ;
	private Double damageAmt=0.0;
	public RocketEnemyShip(){
		setName("Rocket Ship");
		setDamage(10.0);
	}
	

	
	public String getName() {
		return name;
	}

	
	public void setName(String newName) {
		name = newName;
		
	}

	
	public Double getDamage() {
		return damageAmt;
	}

	
	public void setDamage(Double newDamage) {
		damageAmt=newDamage;
		
	}

	
	public void followHeroShip() {
		System.out.println("Rocket following hero ship");
		
	}

	
	public void displayEnemyShip() {
		System.out.println("Rocket diplaying enemy ship");
		
	}

	
	public void enemyShipShoot() {
		System.out.println("Rocket shooting at hero ship");
		
	}
}