package mendoza.salud.hvt.openshifttest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mendoza.salud.hvt.openshifttest.data.Item;

@RepositoryRestResource( path = "item")
public interface ItemRestRepo extends PagingAndSortingRepository<Item, Long>{
    
}