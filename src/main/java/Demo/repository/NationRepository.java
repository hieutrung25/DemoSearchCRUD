package Demo.repository;

import Demo.model.Nation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationRepository extends PagingAndSortingRepository<Nation, Long> {
}