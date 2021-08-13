package Demo.service.city;

import Demo.model.City;
import Demo.service.IGeneralService;

public interface ICityService extends IGeneralService<City> {

    Iterable<City> findByName(String name);

    Iterable<City> findByGdp(double gdp);
}
