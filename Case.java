package finalExam;

public class Case extends Product {
	private Ram ram;
	private Cpu cpu;

	public Case(String id, String name, int price, Ram ram, Cpu cpu) {
		super(id, name, price);
		this.ram = ram;
		this.cpu = cpu;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Ram: " + this.ram.toString() + " & " + "CPU: "
				+ this.cpu.toString();
	}

}
