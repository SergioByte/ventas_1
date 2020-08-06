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
public class proveedor {
    private int idproveedor;
    private String nombre;
    private float pago;
    private String f_entrega;
    private String sugerencia;
    private String estado;
    
    public proveedor(){
    }

    public proveedor(int idproveedor, String nombre, float pago, String f_entrega, String sugerencia, String estado) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.pago = pago;
        this.f_entrega = f_entrega;
        this.sugerencia = sugerencia;
        this.estado = estado;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

    public String getF_entrega() {
        return f_entrega;
    }

    public void setF_entrega(String f_entrega) {
        this.f_entrega = f_entrega;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
