package com.almacen.model;
// Generated 27/06/2016 04:27:58 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FormaDePago generated by hbm2java
 */
public class FormaDePago  implements java.io.Serializable {


     private Integer idFormaDePago;
     private Acceso acceso;
     private String formaDePago;
     private Date fechaReg;
     private Set<Factura> facturas = new HashSet<Factura>(0);

    public FormaDePago() {
    }

	
    public FormaDePago(Acceso acceso, String formaDePago, Date fechaReg) {
        this.acceso = acceso;
        this.formaDePago = formaDePago;
        this.fechaReg = fechaReg;
    }
    public FormaDePago(Acceso acceso, String formaDePago, Date fechaReg, Set<Factura> facturas) {
       this.acceso = acceso;
       this.formaDePago = formaDePago;
       this.fechaReg = fechaReg;
       this.facturas = facturas;
    }
   
    public Integer getIdFormaDePago() {
        return this.idFormaDePago;
    }
    
    public void setIdFormaDePago(Integer idFormaDePago) {
        this.idFormaDePago = idFormaDePago;
    }
    public Acceso getAcceso() {
        return this.acceso;
    }
    
    public void setAcceso(Acceso acceso) {
        this.acceso = acceso;
    }
    public String getFormaDePago() {
        return this.formaDePago;
    }
    
    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }
    public Set<Factura> getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }




}

