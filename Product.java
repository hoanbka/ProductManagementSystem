package finalExam;

public abstract class Product {
	protected String id;
	protected String name;
	protected int price;

	public Product(String id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "id: " + this.id + ",Name: " + this.name + ",price: "
				+ this.price;
	}
	//public abstract String toString();

}
