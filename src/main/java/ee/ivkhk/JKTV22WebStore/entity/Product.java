package ee.ivkhk.JKTV22WebStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Objects;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
//    @Lob
//    private byte[] photo;
    private int price;
    private int quantity;//количество товара
    private String brand;
    private String Model;

    public Product() {

    }

    public Product(String type, int price, int quantity, String brand, String model) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        Model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && quantity == product.quantity && Objects.equals(id, product.id) && Objects.equals(type, product.type) && Objects.equals(brand, product.brand) && Objects.equals(Model, product.Model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, price, quantity, brand, Model);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
