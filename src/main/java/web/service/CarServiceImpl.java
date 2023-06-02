package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Electric", 1));
        cars.add(new Car("BMW", "V6", 1));
        cars.add(new Car("BMW", "V8", 3));
        cars.add(new Car("Micro", "Electric", 2));
        cars.add(new Car("Micro", "V4", 1));
    }

    @Override
    public List<Car> getCars(int index) {
        if (index >= 5) {
            return cars;
        } else {
            return cars.subList(0, index);
        }
    }
}
