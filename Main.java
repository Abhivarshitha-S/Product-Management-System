import java.util.List;

public class Main {
    public static void main(String[] args){

        ProductService service = new ProductService();

        service.addProduct(new Product("microsoft","laptop","Brown table",2023));
        service.addProduct(new Product("type c","cable","Black table",2026));
        service.addProduct(new Product("blue pen","stationary","Brown table",2023));
        service.addProduct(new Product("lenovo mouse","mouse","Black table",2023));
        service.addProduct(new Product("samsung headset","headset","Brown table",2024));
        service.addProduct(new Product("wd elements","hard disk","Brown table",2023));
        service.addProduct(new Product("microsoft charger","cable","Brown table",2023));
        service.addProduct(new Product("macbook pro","laptop","Black table",2025));
        service.addProduct(new Product("microsoft mouse","mouse","Black table",2024));
        service.addProduct(new Product("apple mouse","mouse","white table table",2023));

       List<Product> products= service.getAllProducts();
        /*
        Enhanced "for loop" is being used
         */
        for(Product p: products){
            System.out.println(p);
        }
        System.out.println("========================");
        //printing specific product
        System.out.println("a particular product: ");
        Product p= service.getProduct("macbook pro");
        System.out.println(p);

        System.out.println("========================");
        //printing specific text
        System.out.println("a particular text: ");

        List<Product>prods=service.getProductsWithText("mouse");
        for(Product product: prods){
            System.out.println(product);
        }
    }
}
