package ee.ivkhk.JKTV22WebStore.repository;

import ee.ivkhk.JKTV22WebStore.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
