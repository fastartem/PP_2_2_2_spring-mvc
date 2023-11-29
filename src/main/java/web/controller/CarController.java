package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
        List<Car> cars = Arrays.asList(
                new Car("BMW", "red", 150),
                new Car("VW", "blk", 100),
                new Car("NIS", "sil", 110),
                new Car("KIA", "gre", 120),
                new Car("AU", "wht", 170));

        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCars(count > 5 ? 5 : count, cars));
        return "cars";
    }
}
