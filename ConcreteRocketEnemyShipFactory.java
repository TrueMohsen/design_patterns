
public class ConcreteRocketEnemyShipFactory extends EnemyShipFactoryTop{

	
	public EnemyShip createEnemyShip() {
		return new RocketEnemyShip();
	}

}
