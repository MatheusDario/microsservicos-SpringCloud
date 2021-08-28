package digitalinnovation.experts.productcatlog.repository;

import digitalinnovation.experts.productcatlog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
