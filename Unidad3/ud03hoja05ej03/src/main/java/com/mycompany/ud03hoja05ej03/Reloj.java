package com.mycompany.ud03hoja05ej03;

/**
 *
 * @author Santiago Tamayo
 */
public class Reloj {
    private int hora, minuto, segundo;
    
    public Reloj (int hora, int minuto, int segundo) {
        if (hora<24 && minuto<60 && segundo<60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = (int) Math.random()*24;
            this.minuto = (int) Math.random()*60;
            this.segundo = (int) Math.random()*60;
        }
    }
    public void confighora(int cambio) {
        if (cambio==1) {
            if (this.hora==23) {
                this.hora = 0;
            } else {
                this.hora += 1;
            }
        } else {
            if (this.hora==0) {
                this.hora = 23;
            } else {
                this.hora -= 1;
            }
        }
    }
    public void configminuto(int cambio) {
        if (cambio==1) {
            if (this.minuto==59) {
                this.minuto = 0;
                confighora(1);
            } else {
                this.minuto += 1;
            }
        } else {
            if (this.minuto==0) {
                this.minuto = 59;
            } else {
                this.minuto -= 1;
            }
        }
    }
    public void configsegundo(int cambio) {
        if (cambio==1) {
            if (this.segundo==59) {
                this.segundo = 0;
                configminuto(1);
            } else {
                this.segundo += 1;
            }
        } else {
            if (this.segundo==0) {
                this.segundo = 59;
            } else {
                this.segundo -= 1;
            }
        }
    }
    public String muestrahora() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
    
    public void calculaHora() {
        boolean enpunto = false ;
        while ((this.hora<=23 && this.minuto<=59 && this.segundo<=59) && (!enpunto)) {
            configsegundo(1);
            System.out.println(muestrahora());
            if (this.hora==23 && this.minuto==59 && this.segundo==59) {
                enpunto = true ;
            }
        }
    }
}
