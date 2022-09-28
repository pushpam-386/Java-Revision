import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String name;
    private double price;
    private String company;
    private int count;

    public Product() {
    }

    public Product(String name, double price, String company, int count) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && company.equals(product.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
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
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
