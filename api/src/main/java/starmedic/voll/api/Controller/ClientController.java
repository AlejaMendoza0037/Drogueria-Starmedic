package starmedic.voll.api.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import starmedic.voll.api.DTO.CreateProductDTO;


@RestController
@RequestMapping("/client")
public class ClientController {


    @PostMapping
    public void createClient(@RequestBody CreateProductDTO productoDto){
        System.out.println( productoDto);




    }
}
