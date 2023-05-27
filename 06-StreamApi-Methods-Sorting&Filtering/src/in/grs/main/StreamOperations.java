package in.grs.main;
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

	public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class StreamOperations {
    public static void main(String[] args) {
        // Create a large dataset of products
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 1500.0));
		products.add(new Product("Smartphone", 1800.0));
		products.add(new Product("TV", 1500.0));
		products.add(new Product("Headphones", 1100.0));
		products.add(new Product("Mouse", 1200.0));

        // Filtering the products based on a condition
		List<Product> filteredProducts = products.stream()
				.filter(product -> product.getPrice() > 900.0)
                .toList();
        System.out.println("Filtered Products:");
        filteredProducts.forEach(product -> System.out.println(product.getName()));

        // Sorting the products by price in ascending order
		List<Product> sortedProducts = products.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .toList();
        System.out.println("Sorted Products (Ascending Order):");
        sortedProducts.forEach(product -> System.out.println(product.getName()));
    }
}
