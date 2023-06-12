/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uis.ejemploexposicion;

/**
 *
 * @author USUARIO
 */
public class Queso extends DecoradorHamburguesa{
    
    private Hamburguesa hamburguesa;
    
    public Queso(Hamburguesa h){
        this.hamburguesa = h;
    }
    
    @Override
    public String getDescripcion(){
        return hamburguesa.getDescripcion()+" + Queso";
    }
    
}
