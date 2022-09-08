package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String name;
    private double price;
    private int quantity;


    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString(){
        return this.getName() + ", $ " + String.format("%.2f", this.getPrice()) + ", " + this.getQuantity() + " units, Total: $ " +
                String.format("%.2f", this.totalValueInStock());
    }
    
}
