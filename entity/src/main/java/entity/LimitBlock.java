package entity;

/**
 * LimitBlock class inherits of Static.
 * @author Sacha
 *
 */
public class LimitBlock extends Static {

	/**
	 * Variable.
	 */
	private LimitBlock limitBlock;
	
	/**
	 * Getter of limitBlock.
	 * @return
	 */
	public LimitBlock getLimitBlock() {
		return limitBlock;
	}
	
	/**
	 * Setter of limitBlock.
	 * @param limitBlock
	 */
	public void setLimitBlock(LimitBlock limitBlock) {
		this.limitBlock = limitBlock;
	}
	
	/**
	 * Constructor of LimitBlock.
	 */
	public LimitBlock() {
		super();
		this.setBreakable(false);
	}
	
}