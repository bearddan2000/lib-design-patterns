package main.algorithm;

import main.Builder;
/***
 * Checks age is not null in builder class
 * @author Daniel Beard
 *
 */
public class AgeLeaf extends AbstractDecisionTree {

	public AgeLeaf() {
		// TODO Auto-generated constructor stub
		super.mException = EnumExceptionMessages.AGE;
		super.mNextLeaf = new LocationLeaf();
	}
/***
 * Test for null object
 * Test for age
 * Iterate next leaf
 */
	public void test(Builder obj) throws Exception {
		// TODO Auto-generated method stub
		if(obj == null)
			super.throwNullObjectException();
		else if(obj.getAge() < 0)
			super.throwSpecificException();
		super.mNextLeaf.test(obj);
	}

}
