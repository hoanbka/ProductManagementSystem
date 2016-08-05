package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Product> listProducts = new ArrayList<>();
		ProductManager prdMng = new ProductManager(listProducts);

		boolean check = true;
		while (check) {

			System.out
					.println("========= Product Management System ============");
			System.out.println("1. Add product");
			System.out.println("2. Remove product");
			System.out.println("3. Find product");
			System.out.println("4. Display products");
			System.out.println("5. Exit");
			System.out.println("Enter your option please:");
			int key = input.nextInt();
			switch (key) {
			case 1:
				input.nextLine();

				System.out.println("1. Add Ram");
				System.out.println("2. Add CPU");
				System.out.println("3. Add Keyboard");
				System.out.println("4. Add Case");
				System.out.println("5. Add mouse");
				System.out.println("6. Add monitor");
				System.out.println("Which item do you want to add?");
				int option = input.nextInt();

				input.nextLine();
				System.out.println("ID:");
				String id = input.nextLine();
				System.out.println("name:");
				String name = input.nextLine();
				System.out.println("Price:");
				int price = input.nextInt();
				switch (option) {
				case 1:
					input.nextLine();
					System.out.println("Capacity:");
					int cap = input.nextInt();
					Product prd1 = new Ram(id, name, price, cap);
					if (prdMng.addProduct(prd1)) {
						System.out.println("Add item successfully");
					} else {
						System.out.println("Add item NOT successfully");
					}

					break;

				case 2:
					input.nextLine();
					System.out.println("Freq:");
					float frq = input.nextFloat();
					Product prd2 = new Cpu(id, name, price, frq);
					if (prdMng.addProduct(prd2)) {
						System.out.println("Add item successfully");
					} else {
						System.out.println("Add item NOT successfully");
					}
					break;

				case 3:
					input.nextLine();
					System.out.println("Type:");
					String type = input.nextLine();
					Product prd3 = new Keyboard(id, name, price, type);
					if (prdMng.addProduct(prd3)) {
						System.out.println("Add item successfully");
					} else {
						System.out.println("Add item NOT successfully");
					}

					break;

				case 4:
					input.nextLine();
					System.out.println("Enter Ram:");
					System.out.println("ID:");
					String ramID = input.nextLine();
					System.out.println("name:");
					String ramName = input.nextLine();
					System.out.println("Price:");
					int ramPrice = input.nextInt();
					System.out.println("Capacity:");
					int ramCap = input.nextInt();

					input.nextLine();
					System.out.println("Enter CPU:");
					System.out.println("ID:");
					String cpuID = input.nextLine();
					System.out.println("name:");
					String cpuName = input.nextLine();
					System.out.println("Price:");
					int cpuPrice = input.nextInt();
					System.out.println("Freq:");
					float cpuFrq = input.nextFloat();
					Ram ram = new Ram(ramID, ramName, ramPrice, ramCap);
					Cpu cpu = new Cpu(cpuID, cpuName, cpuPrice, cpuFrq);

					Product casePrd = new Case(id, name, price, ram, cpu);
					if (prdMng.addProduct(casePrd)) {
						System.out.println("Add item successfully");
					} else {
						System.out.println("Add item NOT successfully");
					}

					break;

				case 5:
					input.nextLine();
					System.out.println("Type:");
					String mouseType = input.nextLine();
					Product prd4 = new Keyboard(id, name, price, mouseType);
					if (prdMng.addProduct(prd4)) {
						System.out.println("Add item successfully");
					} else {
						System.out.println("Add item NOT successfully");
					}

					break;

				case 6:
					input.nextLine();
					System.out.println("resolution:");
					String resolution = input.nextLine();
					Product prd5 = new Monitor(id, name, price, resolution);
					if (prdMng.addProduct(prd5)) {
						System.out.println("Add item successfully");
					} else {
						System.out.println("Add item NOT successfully");
					}

					break;

				default:
					break;
				}

				break;

			case 2:
				input.nextLine();
				System.out.println("Enter Product's ID to remove:");
				String removeID = input.next();
				if (prdMng.removeProduct(removeID)) {
					System.out.println("Remove item successfully");
				} else {
					System.out.println("Remove item NOT successfully");
				}
				break;

			case 3:
				input.nextLine();
				System.out.println("Name of product to find:");
				String findName = input.next();
				ArrayList<Product> result = prdMng.findProduct(findName);
				if (!result.isEmpty()) {
					System.out.println(result.toString());
				} else {
					System.out.println("Can not find the item");
				}
				break;

			case 4:
				prdMng.showAllProduct();
				break;

			case 5:
				System.out.println("Exit");
				check = false;
				break;

			default:
				System.out.println("Wrong option!");
				break;
			}

		}

	}
}
