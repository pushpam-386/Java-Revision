import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ecommerce ecommerce=new Ecommerce();
        ecommerce.addProduct(new Product("Shoes",2000,"Adidas",12));
        ecommerce.addProduct(new Product("Ipad",100000,"Apple",2));
        ecommerce.addProduct(new Product("Ipad",100000,"Apple",4));
        ecommerce.addProduct(new Product("Shoes",4000,"Nike",4));
        ecommerce.addProduct(new Product("Shoes",2000,"Adidas",8));
        List<Product> list=ecommerce.showAllProduct();

        for (Product product:list) {
            System.out.println(product.getCompany()+"  "+product.getName()+"  "+product.getPrice()+"  "+product.getCount());
        }
        
    }
}