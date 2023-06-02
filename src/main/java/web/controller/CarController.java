package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarServiceImpl;



@Controller
public class CarController {

    private final CarServiceImpl carService;
    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count",defaultValue = "5")int index, Model model){
        model.addAttribute("cars",carService.getCars(index));
        return "cars";
    }

}
