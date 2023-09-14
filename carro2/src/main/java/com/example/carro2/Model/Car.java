package com.example.carro2.Model;

public class Car {
   private int id;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String marca;

    public static double getConsumoGasolina() {
        return consumoGasolina;
    }

    public void setConsumoGasolina(double consumoGasolina) {
        this.consumoGasolina = consumoGasolina;
    }

    public boolean isFlex() {
        return flex;
    }

    public void setFlex(boolean flex) {
        this.flex = flex;
    }

    public static double getConsumoAlcool() {
        return consumoAlcool;
    }

    public void setConsumoAlcool(double consumoAlcool) {
        this.consumoAlcool = consumoAlcool;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private static double consumoGasolina;
    private static double consumoAlcool;
    private boolean flex;


    public void setId(int id) {
    }
}
