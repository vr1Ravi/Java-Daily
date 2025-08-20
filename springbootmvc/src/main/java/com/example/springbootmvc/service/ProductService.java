package com.example.springbootmvc.service;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.springbootmvc.model.Product;
import com.example.springbootmvc.repo.ProductRepo;

@Service
public class ProductService {
    
   @Autowired ProductRepo productRepo;
   
   public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    public Product getProductById(int id){
        return productRepo.findById(id).orElse(null);
    }
    public Product addOrUpdateProduct(Product product, MultipartFile image)throws IOException {
     product.setImageName(image.getOriginalFilename());
     product.setImageType(image.getContentType());
     product.setImageData(image.getBytes());
     return productRepo.save(product);
    }
    public void deleteProduct(int id){
      productRepo.deleteById(id);
    }
    public List<Product> getProductsBySearch(String search){
     return productRepo.searchProducts(search);
    }
}
