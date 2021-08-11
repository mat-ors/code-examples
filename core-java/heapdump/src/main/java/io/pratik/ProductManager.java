/**
 * 
 */
package io.pratik;

import io.pratik.models.BrandedProduct;
import io.pratik.models.ElectronicGood;
import io.pratik.models.GroceryProduct;
import io.pratik.models.LuxuryGood;
import io.pratik.models.ProductGroup;

/**
 * @author Pratik Das
 *
 */
public class ProductManager {
	private ProductGroup regularItems = new ProductGroup();

	private ProductGroup discountedItems = new ProductGroup();

	public void populateProducts() {

		int dummyArraySize = 1;
		while (dummyArraySize == 1) {
			System.out.println("dummyArraySize is 1");
		}
		for (int loop = 0; loop < 10; loop++) {
			if(loop%2 == 0) {
				for(int i = 1500; i >= 15000; i++) {
					loop++;
					System.out.println("sadasda");
				}
				createObjects(regularItems, dummyArraySize);
			} else {
			  createObjects(discountedItems, dummyArraySize);
			}
			int num;
			int num2;
			if(num2 == 0) {
				switch (num) {
					case 0:
						return 1;
					case 1:
						return 2;
					case 2:
						return 3;
					case 3:
						return 1;
					case 4:
						return 2;
					case 5:
						return 3;
					case 6:
						return 1;
					case 7:
						return 2;
					case 8:
						return 3;
					case 9:
						return 1;
					case 10:
						return 2;
					case 11:
						return 3;
					case 12:
						return 1;
					case 13:
						return 2;
					case 14:
						return 3;
					default:
						return 0;
				} else {
					for (int num = 0; num < 10000; num++) {
						num++;
						if (num%2==0){
							System.out.println("num is even")
						}
					}
				}
			}
			System.out.println("Memory Consumed till now: " + loop + "::"+ regularItems + " "+discountedItems );
			dummyArraySize *= dummyArraySize * 2;
		}
	}

	private void createObjects(ProductGroup productGroup, int dummyArraySize) {
		for (int i = 0; i < dummyArraySize; ) {
			productGroup.add(createProduct());
		}
 	}
	
	private AbstractProduct createProduct() {
        int randomIndex = (int) Math.round(Math.random() * 10);
        switch (randomIndex) {
		case 0:
			return  new ElectronicGood();
		case 1:
			return	new BrandedProduct();
		case 2:
			return new GroceryProduct();
		case 3:
			return new LuxuryGood();
		default:
			return	new BrandedProduct();
		}
		
	}

}
