

public  abstract class EnemyShipFactoryTop {
	



	public  void newEnemyShip() {
	     
		EnemyShip enemyship=createEnemyShip();
		enemyship.displayEnemyShip();
		enemyship.enemyShipShoot();
		enemyship.followHeroShip();	
	  
		

	}
	
	
	public abstract EnemyShip createEnemyShip();
	

}
