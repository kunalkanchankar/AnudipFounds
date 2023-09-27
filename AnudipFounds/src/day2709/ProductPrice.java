package day2709;

public class ProductPrice {

	public static void main(String[] args) {
		Prodect[] item = new Prodect[5];
        item[0] = new Prodect(1021,"Mobile",12000);
        item[1] = new Prodect(2522,"Headphone",1000);
        item[2] = new Prodect(3214,"Speaker",2000);
        item[3] = new Prodect(4212,"Ipad", 70000);
        item[4] = new Prodect(5100,"Laptop", 75000);

        double minPrice = item[0].getPrice();
        String ename = item[0].getName();
        
        for (int i = 0; i < item.length; i++) {
            double currentSalary = item[i].getPrice();
            if (currentSalary < minPrice) {
                minPrice = currentSalary;
                ename = item[i].getName();
            }
        }

        System.out.println("Minimum Price is : " + minPrice);
        System.out.println("Prodect name : " + ename);
	}
}

class Prodect{
	public
		int id;
		String name;
		double price;
	public Prodect(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
	        return price;
	}
	public String getName() {
        return name;
	}
}


