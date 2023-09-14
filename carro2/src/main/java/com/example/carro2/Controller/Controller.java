package com.example.carro2.Controller;

import com.example.carro2.Model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Controller {

    private  List<Car> cars =  new ArrayList<>();
  private   int id = 0;
    public Car findCar(String nome){
        for (Car c : cars){
            if (c.getNome().equals(nome)){
                return c;
            }
        }
    return null;
    }


    public  Car addCar(String nome, String marca){
    Car car = new Car();
    car.setNome(nome);
    car.setMarca(marca);
    id++;
    car.setId(id);
    cars.add(car);
        return car;
    }

    public Car deleteCar(String nome){
        Car car = new Car();
        for (Car c : cars){
            if (c.getNome().equals(nome)){
                car = c;
            }
        }
        cars.remove(car);
        return  car;
    }

    public Car updateCar(String nome){

        Car c = new Car();
        for (Car car : cars){
            if (car.getId() == id){
                car.setNome(nome);
                c = car;
            }
        }

        return c;
    }

    public ResponseEntity<String> calcularGasto(double quilometragem, String tipoCombustivel ){

        if ( cars == null) {
            return ResponseEntity.badRequest().body("Carro não cadastrado!");
        }
        double consumo;
        if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            consumo = Car.getConsumoGasolina();
        } else if (tipoCombustivel.equalsIgnoreCase("alcool")) {
            consumo = Car.getConsumoAlcool();
        } else {
            return ResponseEntity.badRequest().body("Tipo de combustível não suportado!");
        }
        double gasto = quilometragem / consumo;
        return ResponseEntity.ok("Gasto de combustível: " + gasto + " litros.");
    }

    }

