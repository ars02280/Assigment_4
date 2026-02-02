package controller;

import service.ProductService;

public class StoreController {

    private final ProductService service;

    public StoreController(ProductService service) {
        this.service = service;
    }

    public void run() {
        service.getAll().forEach(p ->
                System.out.println(p.getDescription())
        );
    }
}
