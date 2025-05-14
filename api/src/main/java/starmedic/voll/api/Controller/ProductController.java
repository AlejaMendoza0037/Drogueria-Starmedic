package starmedic.voll.api.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import starmedic.voll.api.DTO.ProductDTO;

@RestController
@RequestMapping("/product")
public class ProductController {


    @PostMapping
    public void createProduct(@RequestBody ProductDTO productoDto){
        System.out.println( productoDto);




    }

}
