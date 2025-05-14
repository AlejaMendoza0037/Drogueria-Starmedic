package starmedic.voll.api.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import starmedic.voll.api.Entity.Category;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

     String nombre;
     String descripcion;
     String precio;
     String stock;
     Category categoria;

}



//importante recordar
//@JsonProperty("nombre")