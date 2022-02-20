/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

/**
 *
 * @author Bito
 */
public class ObjetoGeografico {
        
    private String nombre;
    private int Id;
    private String municipio;
    private String tipoagua;
    private String tipocuerpo;
    private Double irca;
        
    public ObjetoGeografico (String nombre, int id, String municipio, String tipoagua, String tipocuerpo, Double irca){
        this.nombre = nombre;
        this.Id = Id;
        this.municipio = municipio;
        this.tipoagua = tipoagua;
        this.tipocuerpo = tipocuerpo;
        this.irca = irca;
    }

    public ObjetoGeografico(){
    
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoagua() {
        return tipoagua;
    }

    public void setTipoagua(String tipoagua) {
        this.tipoagua = tipoagua;
    }

    public String getTipocuerpo() {
        return tipocuerpo;
    }

    public void setTipocuerpo(String tipocuerpo) {
        this.tipocuerpo = tipocuerpo;
    }

    public Double getIrca() {
        return irca;
    }

    public void setIrca(Double irca) {
        this.irca = irca;
    }
    
}