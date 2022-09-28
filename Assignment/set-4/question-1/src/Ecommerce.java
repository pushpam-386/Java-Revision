import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
    List<Product> productList=new ArrayList<>();
    public void addProduct(Product product){
        productList.add(product);
       if(productList.contains(product.getName())) {
           product.setCount(product.getCount()+1);

           System.out.println("Count updated Product already exists");
       }
        else {
           productList.add(product);
           System.out.println("Product added Successfully");
       }
    }
    public List<Product> showAllProduct(){
        return productList;
    }
}
