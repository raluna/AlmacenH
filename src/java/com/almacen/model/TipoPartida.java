package com.almacen.model;
// Generated 27/06/2016 04:27:58 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TipoPartida generated by hbm2java
 */
public class TipoPartida  implements java.io.Serializable {


     private Integer idTipoPartida;
     private Acceso acceso;
     private String tipoPartida;
     private String vigente;
     private String cvePartida;
     private Date fechaReg;

    public TipoPartida() {
    }

    public TipoPartida(Acceso acceso, String tipoPartida, String vigente, String cvePartida, Date fechaReg) {
       this.acceso = acceso;
       this.tipoPartida = tipoPartida;
       this.vigente = vigente;
       this.cvePartida = cvePartida;
       this.fechaReg = fechaReg;
    }
   
    public Integer getIdTipoPartida() {
        return this.idTipoPartida;
    }
    
    public void setIdTipoPartida(Integer idTipoPartida) {
        this.idTipoPartida = idTipoPartida;
    }
    public Acceso getAcceso() {
        return this.acceso;
    }
    
    public void setAcceso(Acceso acceso) {
        this.acceso = acceso;
    }
    public String getTipoPartida() {
        return this.tipoPartida;
    }
    
    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }
    public String getVigente() {
        return this.vigente;
    }
    
    public void setVigente(String vigente) {
        this.vigente = vigente;
    }
    public String getCvePartida() {
        return this.cvePartida;
    }
    
    public void setCvePartida(String cvePartida) {
        this.cvePartida = cvePartida;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }




}

