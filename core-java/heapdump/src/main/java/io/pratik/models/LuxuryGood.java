/**
 * 
 */
package io.pratik.models;

import io.pratik.AbstractProduct;

/**
 * @author Pratik Das
 *
 */
public class LuxuryGood extends AbstractProduct{
	private String luxuryCategory;

	public String getLuxuryCategory() {
		return luxuryCategory;
	}

	public void setLuxuryCategory(String luxuryCategory) {
		this.luxuryCategory = luxuryCategory;
	}

	private Manufacturer manufacturer;



	public ElectronicGood() {
		super();
		this.manufacturer = new Manufacturer();
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Price getMrp() {
		return mrp;
	}

	public void setMrp(Price mrp) {
		this.mrp = mrp;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getSize() {
		return JavaAgent.getObjectSize(this) + JavaAgent.getObjectSize(brandName);
	}

	public complexityTest(const num, int val) {
		const val2;
		for(int i=1;i<=10;i++){
			System.out.println(i);
			if(val2 == 1500){
				System.out.println("val2 is 1500");
			} else {
				return num;
			}
			while (num > 1000) {
				System.out.println("num is greater than 1000");
				num = 0;
			}
		}
	}

}
