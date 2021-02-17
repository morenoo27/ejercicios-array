/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.EjercicioClase;

/**
 *
 * @author alejandro
 */
public enum TiposPremio {
    
    PRIMER_PREMIO(25000000),
    SEGUNDO_PREMIO(750000),
    TERCER_PREMIO(250000),
    CUARTO_PREMIO(100000),
    QUINTO_PREMIO(25000),
    NORMAL_PREMIO(1000);
    
    private double premio;

    private TiposPremio(double premio) {
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }
    
}
