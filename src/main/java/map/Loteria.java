/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.HashMap;
import java.util.Map;
import map.EjercicioClase.Decimos;
import map.EjercicioClase.Premio;
import map.EjercicioClase.TiposPremio;

/**
 *
 * @author alejandro
 */
public class Loteria {

    private Map<Decimos, TiposPremio> loteria;

    public Loteria() {

        this.loteria = new HashMap<>();
    }

    public void addPremio(Decimos decimo, TiposPremio premio) {
        this.loteria.put(decimo, premio);
    }

    public TiposPremio consulta(Decimos decimo) {
        return this.loteria.get(decimo);
    }

    public Map<Decimos, TiposPremio> getLoteria() {
        return this.loteria;
    }
}
