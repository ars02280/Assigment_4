package interfaces;

import model.Product;

public interface Validatable {
    void validate(Product p){
        if (p.price <= 0)
            throw new exception.InvalidInputException("Price must be > 0");


    };
}