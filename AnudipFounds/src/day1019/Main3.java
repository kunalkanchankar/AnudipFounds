package day1019;


//create Item class with perameters id,name,price with 
//private keyword. set price of item only if price is grater then 30 rs.
//Also generate getter setter methods for same.


class Item{
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price > 30) {
			this.price = price;
		}else {
			System.out.println("Price can't be less than 30/-");
		}
	}
}

public class Main3 {
	public static void main(String[] args) {
	Item obj = new Item();
	obj.setId(102);
	obj.setName("IPhone");
	obj.setPrice(12500); //it will execute in normal flow
//	obj.setPrice(12);  // It will print price is less then 30
	System.out.println("Item ID : "+ obj.getId());
	System.out.println("Item Name : "+ obj.getName());
	System.out.println("Item Price : "+ obj.getPrice());
	}

}
