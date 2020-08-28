package main.algorithm;

import main.Builder;
/***
 * Checks location is not null in builder class
 * @author Daniel Beard
 *
 */
public class LocationLeaf extends AbstractDecisionTree {

	public LocationLeaf() {
		// TODO Auto-generated constructor stub
		super.mException = EnumExceptionMessages.LAST;
	}
	/***
	 * Test for null object
	 * Test for location
	 * Iterate next leaf
	 */
	public void test(Builder obj) throws Exception {
		// TODO Auto-generated method stub
		if(obj == null)
			super.throwNullObjectException();
		else if(obj.getLocation() .isBlank())
			super.throwSpecificException();
		super.mNextLeaf.test(obj);
	}

}
