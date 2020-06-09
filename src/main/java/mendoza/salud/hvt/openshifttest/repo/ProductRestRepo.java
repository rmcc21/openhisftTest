package mendoza.salud.hvt.openshifttest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mendoza.salud.hvt.openshifttest.data.Product;
@RepositoryRestResource( path = "product")
public interface ProductRestRepo extends PagingAndSortingRepository<Product, Long> {
    
}