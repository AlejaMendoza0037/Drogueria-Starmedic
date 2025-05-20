package starmedic.voll.api.Controller;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import starmedic.voll.api.DTO.ListProductDto;
import starmedic.voll.api.DTO.CreateProductDTO;
import starmedic.voll.api.DTO.UpdateProductDto;
import starmedic.voll.api.Entity.Product;
import starmedic.voll.api.IService.IProductService;
import starmedic.voll.api.Repository.ProductRepository;


import org.springframework.data.domain.Pageable;
//import java.awt.print.Pageable;


@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired

    private IProductService productService;


    @PostMapping
    public void createProduct(@RequestBody CreateProductDTO createProductDTO){
        productService.createProduct(createProductDTO);

    }



    @GetMapping
    public Page<ListProductDto> listProduct(@PageableDefault(size = 10) Pageable paginacion){
        return productService.listProducts(paginacion);

    }


    @PutMapping
    @Transactional
    public void updateProduct(@RequestBody  UpdateProductDto updateProductDto){
        productService.updateProduct(updateProductDto);

    }


}
