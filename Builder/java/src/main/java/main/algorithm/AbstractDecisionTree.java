package main.algorithm;

/***
 * Decision tree that uses chain of responsibility
 * @author DonGu
 *
 */
public abstract class AbstractDecisionTree implements LeafImpl{

	/***
	 * So we don't accedently run out of leaves to iterate
	 */
	protected LeafImpl mNextLeaf = new NullLeaf();
	
	// Use custom exception messages
	protected EnumExceptionMessages mException = EnumExceptionMessages.NULL; 
	
	protected void throwNullObjectException() throws Exception {
		this.mException = EnumExceptionMessages.NULL;
		this.throwSpecificException();
	}
	
	protected void throwSpecificException() throws Exception {
		// TODO Auto-generated method stub

		String msg = this.getDescription();
		throw new Exception(msg);
	}
	
	private String getDescription() {
		
		// use this to get the enum name
		Object obj = this.mException;
		String fieldName = ((Enum<EnumExceptionMessages>) obj).name();
		
		return main.EnumHelper.getDescAnnotationValue(EnumExceptionMessages.class, fieldName);
	}
	
	/***
	 * Set next condition to check
	 * @param obj some leaf
	 */
	public void setNextLeaf(AbstractDecisionTree obj) {
		this.mNextLeaf = obj;
	}
}
