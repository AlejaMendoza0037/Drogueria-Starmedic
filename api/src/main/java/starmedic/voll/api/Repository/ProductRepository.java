package starmedic.voll.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import starmedic.voll.api.Entity.Product;

//tipo de objeto, entidad--- tipo objeto ID
@Repository
public interface ProductRepository  extends JpaRepository <Product, Long> {
}
