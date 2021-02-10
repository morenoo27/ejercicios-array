/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioRepaso;

/**
 *
 * @author aleja
 */
public class MiIP {

    //vamos a declarar los atributos que tendra la clase
    private short octeto1, octeto2, octeto3, octeto4;

    //constructor por defecto
    public MiIP() {

        this.octeto1 = 0;
        this.octeto2 = 0;
        this.octeto3 = 0;
        this.octeto4 = 0;
    }

    //construnctor que reciba los parametros y cree el objeto parametrizado con short
    public MiIP(short octeto1, short octeto2, short octeto3, short octeto4) {

        if (octeto1 >= 0 && octeto1 < 255) {
            this.octeto1 = octeto1;
        } else {
            this.octeto1 = 255;
        }

        if (octeto2 >= 0 && octeto2 < 255) {
            this.octeto2 = octeto2;
        } else {
            this.octeto2 = 255;
        }

        if (octeto3 >= 0 && octeto3 < 255) {
            this.octeto3 = octeto3;
        } else {
            this.octeto3 = 255;
        }

        if (octeto4 >= 0 && octeto4 < 255) {
            this.octeto4 = octeto4;
        } else {
            this.octeto4 = 255;
        }
    }

    //construnctor que reciba los parametros y cree el objeto parametrizado con short
    public MiIP(String octeto1, String octeto2, String octeto3, String octeto4) {

        //objetos para almacenar el shor de Strings
        short octeto1S, octeto2S, octeto3S, octeto4S;

        //conversiones
        octeto1S = Short.parseShort(octeto1);
        octeto2S = Short.parseShort(octeto2);
        octeto3S = Short.parseShort(octeto3);
        octeto4S = Short.parseShort(octeto4);

        //mismo procedimiento que en el parametrizado de short
        if (octeto1S >= 0 && octeto1S < 255) {
            this.octeto1 = octeto1S;
        } else {
            this.octeto1 = 255;
        }

        if (octeto2S >= 0 && octeto2S < 255) {
            this.octeto2 = octeto2S;
        } else {
            this.octeto2 = 255;
        }

        if (octeto3S >= 0 && octeto3S < 255) {
            this.octeto3 = octeto3S;
        } else {
            this.octeto3 = 255;
        }

        if (octeto4S >= 0 && octeto4S < 255) {
            this.octeto4 = octeto4S;
        } else {
            this.octeto4 = 255;
        }
    }

    public short getOcteto1() {
        return octeto1;
    }

    public short getOcteto2() {
        return octeto2;
    }

    public short getOcteto3() {
        return octeto3;
    }

    public short getOcteto4() {
        return octeto4;
    }

    public void setOcteto1(int octeto1) {

        if (octeto1 >= 0 && octeto1 < 255) {
            this.octeto1 = (short) octeto1;
        } else {
            this.octeto1 = 255;
        }
    }

    public void setOcteto2(int octeto2) {

        if (octeto2 >= 0 && octeto2 < 255) {
            this.octeto2 = (short) octeto2;
        } else {
            this.octeto2 = 255;
        }
    }

    public void setOcteto3(int octeto3) {

        if (octeto3 >= 0 && octeto3 < 255) {
            this.octeto3 = (short) octeto3;
        } else {
            this.octeto3 = 255;
        }
    }

    public void setOcteto4(int octeto4) {

        if (octeto4 >= 0 && octeto4 < 255) {
            this.octeto4 = (short) octeto4;
        } else {
            this.octeto4 = 255;
        }
    }

    public String getOct1Binary() {

        //creamos una variable donde alacenaremos la cadena binaria
        int cadena = (int) this.octeto1;

        //almacenamos el string del short pasado a int, y formateamos el string
        String binario = String.format(Integer.toBinaryString(cadena), "########");

        //si sale 0, solo saldra 0, asiq ue filtraremos ese caso
        if (binario.equals("0")) {
            
            binario = "00000000";
            
            return binario;
        } else {
            
            return binario;
        }
    }

    public String getOct2Binary() {

        int cadena = (int) this.octeto2;

        String binario = String.format(Integer.toBinaryString(cadena), "########");

        if (binario.equals("0")) {
            
            binario = "00000000";
            
            return binario;
        } else {
            
            return binario;
        }
    }

    public String getOct3Binary() {

        int cadena = (int) this.octeto3;

        String binario = String.format(Integer.toBinaryString(cadena), "########");

        if (binario.equals("0")) {
            
            binario = "00000000";
            
            return binario;
        } else {
            
            return binario;
        }
    }

    public String getOct4Binary() {

        int cadena = (int) this.octeto4;

        String binario = String.format(Integer.toBinaryString(cadena), "########");

        if (binario.equals("0")) {
            
            binario = "00000000";
            
            return binario;
        } else {
            
            return binario;
        }
    }
    
    public String getOct1Hex() {

        int cadena = (int) this.octeto1;

        String binario = String.format(Integer.toHexString(cadena), "########");

        if (binario.equals("0")) {
            
            binario = "00000000";
            
            return binario;
        } else {
            
            return binario;
        }
    }
    
    public String getOct2Hex() {

        int cadena = (int) this.octeto2;

        String binario = String.format(Integer.toHexString(cadena), "########");

        if (binario.equals("0")) {
            
            binario = "00000000";
            
            return binario;
        } else {
            
            return binario;
        }
    }
    public String getOct3Hex() {

        int cadena = (int) this.octeto3;

        String binario = String.format(Integer.toHexString(cadena), "########");

        if (binario.equals("0")) {
            
            binario = "00000000";
            
            return binario;
        } else {
            
            return binario;
        }
    }
    
    public String getOct4Hex() {

        int cadena = (int) this.octeto4;

        String binario = String.format(Integer.toHexString(cadena), "########");

        if (binario.equals("0")) {
            
            binario = "00000000";
            
            return binario;
        } else {
            
            return binario;
        }
    }
    

    @Override
    public String toString() {
        return "MiIP{" + this.octeto1 + "." + this.octeto2 + "." + this.octeto3 + "." + this.octeto4 + '}';
    }

    public String toStringBinary() {
        return "MiIP{" + this.getOct1Binary() + "." + this.getOct2Binary() + "." + this.getOct3Binary() + "." + this.getOct4Binary() + '}';
    }

    public String toStringHex() {
        return "MiIP{" + this.getOct1Hex() + "." + this.getOct2Hex() + "." + this.getOct3Hex() + "." + this.getOct4Hex() + '}';
    }
}
