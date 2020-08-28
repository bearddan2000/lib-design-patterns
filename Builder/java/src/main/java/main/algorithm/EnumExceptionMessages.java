package main.algorithm;

import jdk.jfr.Description;
/***
 * Custom exception messages
 * @author Daniel Beard
 *
 */
public enum EnumExceptionMessages {
	@Description("object is null")NULL
	, @Description("last name can't be blank")LAST
	, @Description("first name can't be blank")FIRST
	, @Description("location can't be blank")LOCATION
	, @Description("age can't be blank") AGE
}
