/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jose
 */
public class Empleado {
    
    private String code;
    private String nome;
    private double sueldo;
    
    
    
    public Empleado(String code, String nome, double sueldo){

this.code=code;
this.nome=nome;
this.sueldo=sueldo;

}

    public double Afp(){
        return getSueldo()*0.11;
    }
    
     public double Total(){
        return getSueldo()-Afp();
    }
    
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
}
