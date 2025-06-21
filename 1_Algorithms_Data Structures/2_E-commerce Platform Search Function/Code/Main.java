import java.util.Arrays;
import java.util.Comparator;

class Product {
    public String productId;
    public String productName;
    public String category;

    public Product(String id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

public class Main {
    public static Product linearSearch(Product[] products, String targetId) {
        for (Product product : products) {
            if (product.productId.equals(targetId)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetId) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (products[mid].productId.equals(targetId))
                return products[mid];
            else if (products[mid].productId.compareTo(targetId) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("A101", "Laptop", "Electronics"),
            new Product("C82B", "Smartphone", "Electronics"),
            new Product("F901", "T-Shirt", "Clothing"),
            new Product("AB12", "Watch", "Accessories"),
            new Product("HJ1X", "Chocolate", "Food"),
            new Product("B2AA", "Table", "Furniture"),
            new Product("PA90", "Toaster", "Kitchen"),
        };

        String productId = "AB12";
        System.out.println("Using linear search for product ID: " + productId);
        Product result = linearSearch(products, productId);
        if (result == null) {
            System.out.println("Product not found");
        } else {
            System.out.println("Results:");
            System.out.println("Product ID: " + result.productId);
            System.out.println("Product Name: " + result.productName);
            System.out.println("Product Category: " + result.category);
        }

        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparing(p -> p.productId));

        productId = "F901";
        System.out.println("\nUsing binary search for product ID: " + productId);
        result = binarySearch(sortedProducts, productId);
        if (result == null) {
            System.out.println("Product not found");
        } else {
            System.out.println("Results:");
            System.out.println("Product ID: " + result.productId);
            System.out.println("Product Name: " + result.productName);
            System.out.println("Product Category: " + result.category);
        }
    }
}
