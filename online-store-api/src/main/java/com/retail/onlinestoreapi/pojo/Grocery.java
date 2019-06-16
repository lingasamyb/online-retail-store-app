package com.retail.onlinestoreapi.pojo;

public class Grocery {
	
	private String name;
	private int quality;
	private int weight;
	private int price;
	private String image;
	
	
	public Grocery(String name,int quality,int weight,int price, String image) {
		this.name = name;
		this.quality = quality;
		this.weight = weight;
		this.price = price;
		this.image = image;
	}
/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
public Grocery() {
	// TODO Auto-generated constructor stub
}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the quality
	 */
	public int getQuality() {
		return quality;
	}


	/**
	 * @param quality the quality to set
	 */
	public void setQuality(int quality) {
		this.quality = quality;
	}


	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
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

}
