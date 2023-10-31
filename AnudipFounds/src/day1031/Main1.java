package day1031;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,6,7,8,9);
		List<Integer> newlist=numbers.stream().filter(x->x%2==0).collect (Collectors.toList()); 
		newlist.forEach(x->System.out.println(x));
		
		List<Product> products=new ArrayList<>();
		products.add(new Product(1, "Dell laptop", 45000));
		products.add(new Product(2, "Lenovo laptop", 38000));
		products.add(new Product (3, "HP laptop", 48000));
		products.add(new Product (4, "Acer laptop", 29000));
		products.add(new Product (5, "MSI laptop",000));
		List<Integer> newproducts = products.stream().filter(p->p.price>38000).map(p->p.price).collect(Collectors.toList());
		System.out.println(newproducts);
		products.stream().filter(p->p.price==2900).forEach (product->System.out.println(product.name)); 
		Integer totalprice=products.stream().map(p->p.price).reduce(0, (sum, price)->sum+price); 
		System.out.println(totalprice);
		Product pl=products.stream().max((pro1, pro2)->pro1.price>pro2.price?1:-1).get(); 
		System.out.println("id : "+pl.id+" "+"Name : "+pl.name+" "+"price : "+pl.price);
		
		System.out.println(newproducts);
	}
}
class Product {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}



































//public class Main8 {
//	public static void main(String[] args) {
//		List<Integer> numbers=Arrays.asList(20,13,43,11,34);
//		
//		numbers.stream().sorted().forEach(x->System.out.println(x)); 
//		
//		List<String> names=Arrays.asList("Reflection", "collection", "Stream"); 
//		List<String> result= names.stream().filter(s->s.startsWith("s")).collect (Collectors.toList()); 
//		
//		System.out.println(result);
//	}
//}