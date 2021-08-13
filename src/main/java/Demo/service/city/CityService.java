package Demo.service.city;

import Demo.model.City;
import Demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService{
    @Autowired
    private CityRepository cityRepository;

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(long id) {
        return cityRepository.findById(id);
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public Iterable<City> findByName(String name) {
        return cityRepository.findAllByNameContaining(name);
    }

    @Override
    public Iterable<City> findByGdp(double gdp) {
        return cityRepository.findAllByGdpIsGreaterThan(gdp);
    }
}
