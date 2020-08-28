package main;

/**
 * @author Daniel Beard
 *
 */
public class Builder {

	String mLocation, mFirst, mLast;
	int mAge;
	
	public Builder() {
		mAge = -1;
		mLocation = mFirst = mLast = "";
	}
	
	/**
	 * @return the mLocation
	 */
	public String getLocation() {
		return mLocation;
	}
	/**
	 * @param loc the mLocation to set
	 * @return this
	 */
	public Builder Location(String loc) {
		this.mLocation = loc;
		return this;
	}
	/**
	 * @return the mFirst
	 */
	public String getFirst() {
		return mFirst;
	}
	/**
	 * @param firstName the mFirst to set
	 * @return this
	 */
	public Builder First(String firstName) {
		this.mFirst = firstName;
		return this;
	}
	/**
	 * @return the mLast
	 */
	public String getLast() {
		return mLast;
	}
	/**
	 * @param lastName the mLast to set
	 * @return this
	 */
	public Builder Last(String lastName) {
		this.mLast = lastName;
		return this;
	}
	/**
	 * @return the mAge
	 */
	public int getAge() {
		return mAge;
	}
	/**
	 * @param epoc the mAge to set
	 * @return this
	 */
	public Builder Age(int epoc) {
		this.mAge = epoc;
		return this;
	}
	
}

