/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;

/**
 *
 * @author UTI306
 */
public class Releve {
    
    private String id_releve;
    private Date Date_releve;
    private String heure_releve;
    private int temperature_releve;

    public Releve(String id_releve, Date Date_releve, String heure_releve, int temperature_releve) {
        this.id_releve = id_releve;
        this.Date_releve = Date_releve;
        this.heure_releve = heure_releve;
        this.temperature_releve = temperature_releve;
    }

    public String getId_releve() {
        return id_releve;
    }

    public Date getDate_releve() {
        return Date_releve;
    }

    public String getHeure_releve() {
        return heure_releve;
    }

    public int getTemperature_releve() {
        return temperature_releve;
    }

    public void setId_releve(String id_releve) {
        this.id_releve = id_releve;
    }

    public void setDate_releve(Date Date_releve) {
        this.Date_releve = Date_releve;
    }

    public void setHeure_releve(String heure_releve) {
        this.heure_releve = heure_releve;
    }

    public void setTemperature_releve(int temperature_releve) {
        this.temperature_releve = temperature_releve;
    }

    @Override
    public String toString() {
        return "Releve{" + "id_releve=" + id_releve + ", Date_releve=" + Date_releve + ", heure_releve=" + heure_releve + ", temperature_releve=" + temperature_releve + '}';
    }
    
    
    
}
