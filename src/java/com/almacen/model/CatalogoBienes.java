package com.almacen.model;
// Generated 27/06/2016 04:27:58 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoBienes generated by hbm2java
 */
public class CatalogoBienes  implements java.io.Serializable {


     private Integer idCatalogoBienes;
     private Acceso acceso;
     private String catalogo;
     private String clave;
     private String descripcion;
     private String vigente;
     private Date fechaReg;
     private Set<SubCatalogoBienes> subCatalogoBieneses = new HashSet<SubCatalogoBienes>(0);

    public CatalogoBienes() {
    }

	
    public CatalogoBienes(Acceso acceso, String catalogo, String clave, String vigente, Date fechaReg) {
        this.acceso = acceso;
        this.catalogo = catalogo;
        this.clave = clave;
        this.vigente = vigente;
        this.fechaReg = fechaReg;
    }
    public CatalogoBienes(Acceso acceso, String catalogo, String clave, String descripcion, String vigente, Date fechaReg, Set<SubCatalogoBienes> subCatalogoBieneses) {
       this.acceso = acceso;
       this.catalogo = catalogo;
       this.clave = clave;
       this.descripcion = descripcion;
       this.vigente = vigente;
       this.fechaReg = fechaReg;
       this.subCatalogoBieneses = subCatalogoBieneses;
    }
   
    public Integer getIdCatalogoBienes() {
        return this.idCatalogoBienes;
    }
    
    public void setIdCatalogoBienes(Integer idCatalogoBienes) {
        this.idCatalogoBienes = idCatalogoBienes;
    }
    public Acceso getAcceso() {
        return this.acceso;
    }
    
    public void setAcceso(Acceso acceso) {
        this.acceso = acceso;
    }
    public String getCatalogo() {
        return this.catalogo;
    }
    
    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getVigente() {
        return this.vigente;
    }
    
    public void setVigente(String vigente) {
        this.vigente = vigente;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }
    public Set<SubCatalogoBienes> getSubCatalogoBieneses() {
        return this.subCatalogoBieneses;
    }
    
    public void setSubCatalogoBieneses(Set<SubCatalogoBienes> subCatalogoBieneses) {
        this.subCatalogoBieneses = subCatalogoBieneses;
    }




}


