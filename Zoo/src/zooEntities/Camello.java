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
    
        setEspecie("Animal");
        setJorobas(2);
        setFamilia("Felino");
    }
    
    public Camello(String nombre){
    
        setNombre(nombre);
        setEspecie("Animal");
        setJorobas(2);
        setFamilia("Felino");
    }
    
    public Camello(String nombre, double peso){
        
        setNombre(nombre);
        setPeso(peso);
        setEspecie("Animal");
        setJorobas(2);
        setFamilia("Felino");
    }
    
    public Camello(String nombre, double peso, char sexo ){
        
        setNombre(nombre);
        setPeso(peso);
        setEspecie("Animal");
        setJorobas(2);
        setFamilia("Felino");
        setSexo(sexo);
    }
    
    private static String nombre;
    private static String familia;
    private String especie;
    private int jorobas;
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
    
    public void setFamilia(String familia){
        this.familia = familia;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setJorobas(int jorobas) {
        this.jorobas = jorobas;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
