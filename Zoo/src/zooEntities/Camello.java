/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooEntities;

/**
 *
 * @author 54117
 */
public class Camello {
    
    public Camello(){
    
    }
    
    public Camello(String nombre){
    
        setNombre(nombre);
    }
    
    public Camello(String nombre, double peso){
        
        setNombre(nombre);
        setPeso(peso);
    }
    
    public Camello(String nombre, double peso, char sexo ){
        
        setNombre(nombre);
        setPeso(peso);
        setSexo(sexo);
    }
    
    private static String nombre;
    private static String familia = "Felino";
    private String especie = "Animal";
    private int jorobas =(int) Math.random()*3;
    private int edad;
    private double peso;
    private char sexo;
    
        
    public int getEdad(){
        return this.edad;
    }

    public String getFamilia(){
        return familia;
    }
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getJorobas() {
        return jorobas;
    }

    public double getPeso() {
        return peso;
    }

    public char getSexo() {
        return sexo;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
