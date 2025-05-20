package starmedic.voll.api.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import starmedic.voll.api.Entity.Category;
import starmedic.voll.api.Entity.Product;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListProductDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private String precio;
    private String stock;
    private Category categoriaNombre;


    public ListProductDto(Product product) {
        this.id=product.getId();
        this.nombre=product.getNombre();
        this.descripcion=product.getDescripcion();
        this.precio=product.getPrecio();
        this.stock=product.getStock();
        this.categoriaNombre = product.getCategoria();
    }
}
