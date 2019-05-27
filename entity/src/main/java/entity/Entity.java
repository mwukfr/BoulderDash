package entity;

/**
 * The abstract class Entity
 *
 * @author Sacha
 */
public abstract class Entity {
	///**
	// * Variable.
	// */
	//private boolean destructable;
	
	/**
	 * Variable.
	 */
	private boolean mobileEntity;
	
	/**
	 * 
	 * Getter for mobileEntity.
	 */
	public boolean getMobileEntity() {
		return mobileEntity;
	}
	
	/**
	 * Setter for mobileEntity.
	 * @param mobileEntity
	 */
	public void setMobileEntity(boolean mobileEntity) {
		this.mobileEntity = mobileEntity;
	}
	
	///**
	// * Getter for destructable.
	// * @return
	// */
	//public boolean getDestructable() {
	//	return destructable;
	//}
	
	///**
	// * Setter for destructable.
	// * @param destructable
	// */
	//public void setDestructable(boolean destructable) {
	//	this.destructable = destructable;
	//}
	
	/**
	 * Constructor of the Entity class.
	 */
	public Entity() {
		
	}
	
	
}
