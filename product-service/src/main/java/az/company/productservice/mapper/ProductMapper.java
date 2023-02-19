package az.company.productservice.mapper;

import az.company.productservice.dto.request.CreateProductRequest;
import az.company.productservice.dto.response.ProductResponse;
import az.company.productservice.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product mapRequestToEntity(CreateProductRequest request) {
        return Product.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();
    }

    public ProductResponse mapEntityToResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
