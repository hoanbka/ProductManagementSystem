package finalExam;

public class Ram extends Product {
	private int capacity;

	public Ram(String id, String name, int price, int capacity) {
		super(id, name, price);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "id: " + this.id + ",Name: " + this.name + ",price: "
				+ this.price + ",capacity: " + this.capacity;
	}

}
