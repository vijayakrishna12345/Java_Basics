/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * @author vijaya
 *
 */
public class TV extends Product {
	private String screenType;

	/**
	 * 
	 */
	public TV() {
	}

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param screenType
	 */
	public TV(int id, String name, double price, String screenType) {
		super(id, name, price);
		this.screenType = screenType;
	}

	/**
	 * @return the screenType
	 */
	public String getScreenType() {
		return screenType;
	}

	/**
	 * @param screenType the screenType to set
	 */
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	
	@Override
	public boolean isExpensive() {
		
			return false;
		
	} 
	
	

}
