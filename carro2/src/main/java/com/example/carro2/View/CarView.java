package com.example.carro2.View;

import com.example.carro2.Controller.Controller;
import com.example.carro2.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CarView {
@Autowired
  Controller controller;
    @GetMapping("/car")
            public Car findCar(@PathParam("nome") String nome){
      return controller.findCar(nome);


    }

    @DeleteMapping("/car")
    public String deleteCar(@PathParam("marca") String marca){
      controller.deleteCar(marca);
        return  "carro da " + marca + "foi removido";
    }

@PostMapping("/car")
    public Car addCar(@PathParam("name") String name, @PathParam("marca") String marca){
  return controller.addCar(name, marca);
    }
@PutMapping("/car")
    public Car updateCar(@PathParam("id") int id, @PathParam("nome") String nome){
 return controller.updateCar(nome);
    }
@GetMapping("/carro")
    public ResponseEntity<String> calcularGasto(@PathVariable double quilometragem, @PathVariable String tipoCombustivel) {

return  controller.calcularGasto(quilometragem, tipoCombustivel);
}
}




