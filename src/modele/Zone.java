/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author UTI306
 */
public class Zone {
    
    private int id_zone;
    private String lib_zone;

    public Zone(int id_zone, String lib_zone) {
        this.id_zone = id_zone;
        this.lib_zone = lib_zone;
    }

    public int getId_zone() {
        return id_zone;
    }

    public String getLib_zone() {
        return lib_zone;
    }

    public void setId_zone(int id_zone) {
        this.id_zone = id_zone;
    }

    public void setLib_zone(String lib_zone) {
        this.lib_zone = lib_zone;
    }

    @Override
    public String toString() {
        return "Zone{" + "id_zone=" + id_zone + ", lib_zone=" + lib_zone + '}';
    }
   
    
    
}
