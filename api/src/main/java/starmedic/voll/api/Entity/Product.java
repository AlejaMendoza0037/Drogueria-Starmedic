package starmedic.voll.api.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import starmedic.voll.api.DTO.CreateProductDTO;
import starmedic.voll.api.DTO.UpdateProductDto;


@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String precio;
    private String stock;

    @Enumerated(EnumType.STRING)
    private Category categoria;

    public Product(CreateProductDTO productoDto) {
        this.nombre=productoDto.getNombre();
        this.descripcion=productoDto.getDescripcion();
        this.precio=productoDto.getPrecio();
        this.stock=productoDto.getStock();
        this.categoria=productoDto.getCategoria();

    }


    public void updateDataProduct(UpdateProductDto updateProductDto) {
        if (updateProductDto.getNombre()!= null){
            this.nombre=updateProductDto.getNombre();
        }

        if (updateProductDto.getDescripcion()!= null){

            this.descripcion=updateProductDto.getDescripcion();
        }

        if (updateProductDto.getPrecio()!= null){

            this.precio=updateProductDto.getPrecio();
        }

        if (updateProductDto.getStock()!= null){
            this.stock=updateProductDto.getStock();
        }




    }
}