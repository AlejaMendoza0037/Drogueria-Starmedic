package starmedic.voll.api.IService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import starmedic.voll.api.DTO.CreateProductDTO;
import starmedic.voll.api.DTO.ListProductDto;
import starmedic.voll.api.DTO.UpdateProductDto;

public interface IProductService {

    void createProduct(CreateProductDTO createProductDTO);

    Page<ListProductDto> listProducts(Pageable pageable);

    void updateProduct(UpdateProductDto updateProductDto);
}
