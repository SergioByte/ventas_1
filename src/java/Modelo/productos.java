/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author TuNombre
 */
public class productos {
    private int idproducto;
    private String nombre;
    private float precio;
    private int cantidad_vendida;
    private int cantidad_almacenada;
    private int idproveedor;
    
        public productos() {
    }
            
    public productos(int idproducto, String nombre, float precio, int cantidad_vendida, int cantidad_almacenada, int idproveedor) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_vendida = cantidad_vendida;
        this.cantidad_almacenada = cantidad_almacenada;
        this.idproveedor = idproveedor;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public int getCantidad_almacenada() {
        return cantidad_almacenada;
    }

    public void setCantidad_almacenada(int cantidad_almacenada) {
        this.cantidad_almacenada = cantidad_almacenada;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    
    
}
