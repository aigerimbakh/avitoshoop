package kz.narxoz.avitoshoop.services;

import kz.narxoz.avitoshoop.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products=new ArrayList<>();
    private long ID=0;
    {
        products.add(new Product(++ID,"Play Station","descrip",12566,"Aktau","Aigerim"));
        products.add(new Product(++ID,"Iphone","descrip",2400,"Almaty","Aisulu"));

    }
    public List<Product>listProducts(){
        return products;
    }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }

}
