package com.dailysales.backend.service.product;

import com.dailysales.backend.dto.ProductDto;
import com.dailysales.backend.model.Product;
import com.dailysales.backend.request.AddProductRequest;
import com.dailysales.backend.request.ProductUpdateRequest;

import java.util.List;


public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long prductId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
