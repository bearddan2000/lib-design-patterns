package main.algorithm;

import main.Builder;
/***
 * Checks last name is not null in builder class
 * @author Daniel Beard
 *
 */
public class LastNameLeaf extends AbstractDecisionTree {

	public LastNameLeaf() {
		// TODO Auto-generated constructor stub
		super.mException = EnumExceptionMessages.LAST;
		super.mNextLeaf = new AgeLeaf();
	}
	/***
	 * Test for null object
	 * Test for last name
	 * Iterate next leaf
	 */
	public void test(Builder obj) throws Exception {
		// TODO Auto-generated method stub
		if(obj == null)
			super.throwNullObjectException();
		else if(obj.getLast() .isBlank())
			super.throwSpecificException();
		super.mNextLeaf.test(obj);
	}

}
