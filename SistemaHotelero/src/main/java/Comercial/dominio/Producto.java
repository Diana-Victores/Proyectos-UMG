/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.dominio;

/**
 *
 * @author familia Sipaque
 */
public class Producto {
int PK_id_producto;
String nombre_producto;
String precio_producto; 
String descripcion_producto; 
String estatus_producto;

    public int getPK_id_producto() {
        return PK_id_producto;
    }

    public void setPK_id_producto(int PK_id_producto) {
        this.PK_id_producto = PK_id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(String precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getEstatus_producto() {
        return estatus_producto;
    }

    public void setEstatus_producto(String estatus_producto) {
        this.estatus_producto = estatus_producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "PK_id_producto=" + PK_id_producto + ", nombre_producto=" + nombre_producto + ", precio_producto=" + precio_producto + ", descripcion_producto=" + descripcion_producto + ", estatus_producto=" + estatus_producto + '}';
    }


}