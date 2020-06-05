
public class UFOEnemyShip implements EnemyShip {
 
	private String name="" ;
	private Double damageAmt=0.0;
	public UFOEnemyShip(){
		setName("UFO Ship");
		setDamage(20.0);
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
		System.out.println("UFO following hero ship");
		
	}

	
	public void displayEnemyShip() {
		System.out.println("UFO diplaying enemy ship");
		
	}

	
	public void enemyShipShoot() {
		System.out.println("UFO shooting at hero ship");
		
	}
}
