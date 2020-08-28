package main.algorithm;

import main.Builder;
/***
 * Checks first name is not null in builder class
 * @author Daniel Beard
 *
 */
public class FirstNameLeaf extends AbstractDecisionTree {

	public FirstNameLeaf() {
		// TODO Auto-generated constructor stub
		super.mException = EnumExceptionMessages.FIRST;
		super.mNextLeaf = new LastNameLeaf();
	}
	/***
	 * Test for null object
	 * Test for first name
	 * Iterate next leaf
	 */
	public void test(Builder obj) throws Exception {
		// TODO Auto-generated method stub
		if(obj == null)
			super.throwNullObjectException();
		else if(obj.getFirst().isBlank())
			super.throwSpecificException();
		super.mNextLeaf.test(obj);
	}
}
