package starmedic.voll.api.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import starmedic.voll.api.DTO.CreateProductDTO;
import starmedic.voll.api.DTO.ListProductDto;
import starmedic.voll.api.DTO.UpdateProductDto;
import starmedic.voll.api.Entity.Product;
import starmedic.voll.api.IService.IProductService;
import starmedic.voll.api.Repository.ProductRepository;


@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private  ProductRepository productRepository;


    @Override
    public void createProduct(CreateProductDTO createProductDTO) {
        Product product = new Product(createProductDTO);
        productRepository.save(product);
    }

    @Override
    public Page<ListProductDto> listProducts(Pageable pageable) {
        return productRepository.findAll(pageable).map(ListProductDto::new);
    }

    @Override
    @Transactional
    public void updateProduct(UpdateProductDto updateProductDto) {
        Product product = productRepository.getReferenceById(updateProductDto.getId());
        product.updateDataProduct(updateProductDto);
    }
}


