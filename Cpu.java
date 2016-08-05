package finalExam;

public class Cpu extends Product {
	private float freq;

	public Cpu(String id, String name, int price, float freq) {
		super(id, name, price);
		this.freq = freq;
	}

	public float getFreq() {
		return freq;
	}

	public void setFreq(float freq) {
		this.freq = freq;
	}

	@Override
	public String toString() {
		return "id: " + this.id + ",Name: " + this.name + ",price: "
				+ this.price + ",freq: " + this.freq;
	}

}
