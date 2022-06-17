/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.poo_prueba.Model;

/**
 *
 * @author Diego
 */
public class Auto {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private String numeroChasis;

    public Auto(String placa, String modelo, String marca, String color, String numeroChasis) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.numeroChasis = numeroChasis;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", numeroChasis=" + numeroChasis + '}';
    }
    
    
}
