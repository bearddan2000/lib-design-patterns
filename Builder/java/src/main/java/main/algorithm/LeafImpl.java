package main.algorithm;

import main.Builder;
/***
 * Interface for chain of responsibility pattern
 * @author Daniel Beard
 *
 */
public interface LeafImpl {
	/***
	 * Test builder object is null
	 * Test builder property is nuil
	 * @param obj builder
	 * @throws Exception class based
	 */
	public void test(Builder obj) throws Exception;
}
