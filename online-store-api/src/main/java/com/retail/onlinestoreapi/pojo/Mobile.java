package com.retail.onlinestoreapi.pojo;

public class Mobile {

	private String brand;
	private String model;
	private int price;
	private String mobileId;
	private int intMemory;
	private int extMemory;
	private float screenSize;
	private int batCapacity;
	private String image;

	
	public Mobile(String brand, String model, int price,String mobileId,String image) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.mobileId = mobileId;
		this.image = image;
	}

	public Mobile() {

	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	public Mobile(String brand, String model, int price, String mobileId, float screenSize, int intMemory, int extMemory,
		int batCapacity, String image) {
		this(brand, model, price,mobileId,image);
		this.intMemory = intMemory;
		this.extMemory = extMemory;
		this.screenSize = screenSize;
		this.batCapacity = batCapacity;
	}

	public int getBatCapacity() {
		return batCapacity;
	}

	public void setBatCapacity(int batCapacity) {
		this.batCapacity = batCapacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public int getIntMemory() {
		return intMemory;
	}

	public void setIntMemory(int intMemory) {
		this.intMemory = intMemory;
	}

	public int getExtMemory() {
		return extMemory;
	}

	public void setExtMemory(int extMemory) {
		this.extMemory = extMemory;
	}

	public float getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return brand + " " + model + " " + price+" "+mobileId+" "+screenSize+" "+intMemory+" "
	+extMemory+" "+batCapacity+" "+image;
	}
}
