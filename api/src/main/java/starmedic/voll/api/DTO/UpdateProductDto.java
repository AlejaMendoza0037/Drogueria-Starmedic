package starmedic.voll.api.DTO;

import lombok.*;
import starmedic.voll.api.Entity.Category;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateProductDto {

    @NonNull
    private Long id;
    String nombre;
    String descripcion;
    String precio;
    String stock;

}
