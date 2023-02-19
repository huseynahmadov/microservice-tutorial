package az.company.productservice.service;

import az.company.productservice.dto.request.CreateProductRequest;
import az.company.productservice.dto.response.ProductResponse;
import az.company.productservice.mapper.ProductMapper;
import az.company.productservice.model.Product;
import az.company.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public void createProduct(CreateProductRequest request) {
        Product product = productRepository.save(productMapper.mapRequestToEntity(request));
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::mapEntityToResponse)
                .collect(Collectors.toList());
    }
}
