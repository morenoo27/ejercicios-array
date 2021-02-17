/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.Random;
import map.EjercicioClase.Decimos;
import map.EjercicioClase.Premio;
import map.EjercicioClase.TiposPremio;

/**
 *
 * @author aleja
 */
public class MainLoteria {

    static Random random = new Random();

    public static void main(String[] args) {

        Loteria loteria = new Loteria();
        int aux;
        int contadroPrimero = 1, contadorSegundo = 1, contadorTercero = 1, contadorCuarto = 1, contadorQuinto = 1;
        TiposPremio premio;

        for (int i = 0; i < 1000; i++) {

            if (i == 978 && contadroPrimero > 1) {

                premio = TiposPremio.PRIMER_PREMIO;
                contadroPrimero++;
            } else if (i < 100 && i > 50 && contadorSegundo > 2) {

                premio = TiposPremio.SEGUNDO_PREMIO;
                contadorSegundo++;
            } else if (i < 300 && i > 200 && contadorTercero > 3) {

                premio = TiposPremio.TERCER_PREMIO;
                contadorTercero++;
            } else if (i < 600 && i > 400 && contadorTercero > 3) {

                premio = TiposPremio.CUARTO_PREMIO;
                contadorCuarto++;
            } else if (i < 900 && i > 700 && contadorTercero > 3) {

                premio = TiposPremio.QUINTO_PREMIO;
                contadorQuinto++;
            } else {

                premio = TiposPremio.NORMAL_PREMIO;
            }

            loteria.addPremio(new Decimos(), premio);
        }

        Decimos decimoABuscar = new Decimos("354651");
        System.out.println("Premio del decimo 354651: " + loteria.consulta(decimoABuscar));

        //Consultamos uno que exista
        Decimos decimoExistente = (Decimos) loteria.getLoteria().keySet().toArray()[0];
        //metodo copiado de alberto que no entiendo que es???

        System.out.println("Premio del " + decimoExistente + ": "
                + loteria.consulta(decimoExistente).getPremio() + "€");

        //loteria.consulta(decimoExistente) devuyleve el enum y ya con el enun
        //recibimos el premio
        
        /**
         * Pregunta: ¿Se podria hacer un filtrado por premio en vez de por
         * decimos y asi mostrar una serie de premios, que serian los rpemios
         * importantes y unos 10 premios normales?
         */
    }
}
