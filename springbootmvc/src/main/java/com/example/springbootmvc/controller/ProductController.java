package com.example.springbootmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.springbootmvc.model.Product;
import com.example.springbootmvc.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;









@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;
    
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
       return  new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }
    
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
       Product fetchedProduct =  service.getProductById(id);
       if(fetchedProduct != null) return   new ResponseEntity<>(fetchedProduct, HttpStatus.OK);
       return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/product/search")
    public ResponseEntity<List<Product>> getMethodName(@RequestParam String param) {
        List<Product> fetchedProducts =  service.getProductsBySearch(param);
        return   new ResponseEntity<>(fetchedProducts, HttpStatus.OK);
    }
    

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getProductImage(@PathVariable int productId) {
        Product fetchedProduct =   service.getProductById(productId);
       if(fetchedProduct != null) return  new ResponseEntity<>(fetchedProduct.getImageData(), HttpStatus.OK);
       return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
   
    }

    @PostMapping("/poduct/add")
    public ResponseEntity<?> addPorduct(@RequestPart Product product, @RequestPart MultipartFile image) {
        try {
            Product savedProduct =   service.addOrUpdateProduct(product, image);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
           
        }
    }

    @PutMapping("/product/update/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable String id, @RequestPart Product product, @RequestPart MultipartFile image) {
            try {
           service.addOrUpdateProduct(product, image);
            return new ResponseEntity<>("Saved successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
           
        }
    }

        @DeleteMapping("/product/delete/{id}")
        public ResponseEntity<String> deleteProduct(@PathVariable int id){
            Product productToDelete = service.getProductById(id);
            if(productToDelete == null) return new ResponseEntity<>("Product Not Found", HttpStatus.NOT_FOUND);

            service.deleteProduct(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        }

    
    
}
