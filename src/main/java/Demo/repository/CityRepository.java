package Demo.repository;

import Demo.model.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends PagingAndSortingRepository<City, Long> {
    Iterable<City> findAllByNameContaining(String name);

    Iterable<City>findAllByGdpIsGreaterThan(double gdp);
}
