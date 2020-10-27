/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.ArrayList;
import modele.Releve;
import modele.Zone;

/**
 *
 * @author UTI306
 */
public class Bouchon {
    public ArrayList<Releve> mesReleves;
    public ArrayList<Zone> mesZones;

    public Bouchon() {
        this.mesReleves = new ArrayList<>();
        this.mesZones = new ArrayList<>();
        
        
        addZone(new Zone(1, "Angle Sud-Est"));
        addZone(new Zone(2, "Angle Sud-Ouest"));
        addZone(new Zone(3, "Angle Nord-Est"));
        addZone(new Zone(4, "Angle Nord-Ouest"));
    }

    public Bouchon(ArrayList<Releve> mesReleves, ArrayList<Zone> mesZones) {
        this.mesReleves = mesReleves;
        this.mesZones = mesZones;
    }

    public ArrayList<Releve> getMesReleves() {
        return mesReleves;
    }

    public ArrayList<Zone> getMesZones() {
        return mesZones;
    }

    public void setMesReleves(ArrayList<Releve> mesReleves) {
        this.mesReleves = mesReleves;
    }

    public void setMesZones(ArrayList<Zone> mesZones) {
        this.mesZones = mesZones;
    }
    
    public void addZone(Zone A){
        mesZones.add(A);
    }
    
    public void addReleve(Releve A){
        mesReleves.add(A);
    }
    
    
    
    
    
}
