package entity;

/**
 * The abstract class Entity
 *
 * @author Sacha
 */
public interface IEntity {
	
	public boolean IsBreakable(boolean isBreakable);
	
	public boolean IsMobile(boolean isCollectable);
	
	public boolean IsUnique(boolean isUnique);
	
	public boolean IsCollectable(boolean isCollectable);
}
