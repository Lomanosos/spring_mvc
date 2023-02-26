package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImp implements CarDao{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("lastochka", "ferarri", 23));
        cars.add(new Car("wify", "devyatka", 676));
        cars.add(new Car("drandulet", "reno", 34));
        cars.add(new Car("bmw", "reno", 768));
        cars.add(new Car("zaraza", "bmw", 1231));
    }
    @Override
    public List<Car> getCar(int count) {
        if (count > 0 && count < 5) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}
