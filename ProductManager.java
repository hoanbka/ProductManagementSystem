package finalExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
	private List<Product> listProduct;

	public ProductManager(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public boolean addProduct(Product prd) {
		return listProduct.add(prd);
	}

	public boolean removeProduct(String productId) {

		for (int i = 0; i < listProduct.size(); i++) {
			if (listProduct.get(i).getId().equals(productId)) {
				listProduct.remove(i);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Product> findProduct(String productName) {
		ArrayList<Product> result = new ArrayList<Product>();

		for (int i = 0; i < listProduct.size(); i++) {
			if (listProduct.get(i).getName().equals(productName)) {
				result.add(listProduct.get(i));
			}
		}
		return result;
	}

	public void sortProductByName() {
		Collections.sort(listProduct, ProductByNameComparator);

		for (Product temp : listProduct) {
			System.out.println(temp.toString());
		}
	}

	public void sortProductByPrice() {
		Collections.sort(listProduct, ProductByPriceComparator);

		for (Product listProducts : listProduct) {
			System.out.println(listProducts.toString());
		}
	}

	public void showAllProduct() {
		Collections.sort(listProduct, ProductByNameComparator);

		for (Product listProducts : listProduct) {
			System.out.println(listProducts.toString());
		}
	}

	private Comparator<Product> ProductByNameComparator = new Comparator<Product>() {

		public int compare(Product s1, Product s2) {
			String Product1 = s1.getName().toUpperCase();
			String Product2 = s2.getName().toUpperCase();

			return Product1.compareTo(Product2);

		}
	};
	private Comparator<Product> ProductByPriceComparator = new Comparator<Product>() {

		public int compare(Product s1, Product s2) {
			int Product1 = s1.getPrice();
			int Product2 = s2.getPrice();

			return Product1 - Product2;

		}
	};

}
