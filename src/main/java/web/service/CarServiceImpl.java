package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;


    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> getCars(Integer amount) {
        return carDao.getCars(amount);
    }
}
