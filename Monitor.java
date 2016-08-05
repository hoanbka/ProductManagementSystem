package finalExam;

public class Monitor extends Product {
	private String resolution;

	public Monitor(String id, String name, int price, String resolution) {
		super(id, name, price);
		this.resolution = resolution;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "id: " + this.id + ",Name: " + this.name + ",price: "
				+ this.price + ",resolution: " + this.resolution;
	}

}
