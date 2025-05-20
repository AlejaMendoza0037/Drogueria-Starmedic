package starmedic.voll.api.DTO;


import lombok.*;
import starmedic.voll.api.Entity.Category;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductDTO {

     String nombre;
     String descripcion;
     String precio;
     String stock;
     Category categoria;

}



//importante recordar
//@JsonProperty("nombre")