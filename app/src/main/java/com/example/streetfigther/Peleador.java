package com.example.streetfigther;

import android.widget.ImageView;

public class Peleador {
    public Peleador(String nombre, String nacionalidad, int edad, double estatura, int peso, int potencia,
                    int velocidad, int fisico, String descripcion, String ataque, int bounA1, int bounA2, int bounA3,
                    int bounA4, String defensa, int bounD1, int bounD2, int bounD3, int bounD4, String descanso, int boundE1,
                    int boundE2, int boundE3, int boundE4, String caida, int boundC1, int boundC2, int boundC3, int boundC4,
                    String pose, int bounP1, int bounP2, int bounP3, int bounP4, String escenario, String bso,
                    ImageView boton) {
        super();
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.fisico = fisico;
        this.descripcion = descripcion;
        this.ataque = ataque;
        this.bounA1 = bounA1;
        this.bounA2 = bounA2;
        this.bounA3 = bounA3;
        this.bounA4 = bounA4;
        this.defensa = defensa;
        this.bounD1 = bounD1;
        this.bounD2 = bounD2;
        this.bounD3 = bounD3;
        this.bounD4 = bounD4;
        this.descanso = descanso;
        this.boundE1 = boundE1;
        this.boundE2 = boundE2;
        this.boundE3 = boundE3;
        this.boundE4 = boundE4;
        this.caida = caida;
        this.boundC1 = boundC1;
        this.boundC2 = boundC2;
        this.boundC3 = boundC3;
        this.boundC4 = boundC4;
        this.pose = pose;
        this.bounP1 = bounP1;
        this.bounP2 = bounP2;
        this.bounP3 = bounP3;
        this.bounP4 = bounP4;
        this.escenario = escenario;
        this.bso = bso;
        this.boton = boton;
    }
    public Peleador() {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.fisico = fisico;
        this.descripcion = descripcion;
        this.ataque = ataque;
        this.bounA1 = bounA1;
        this.bounA2 = bounA2;
        this.bounA3 = bounA3;
        this.bounA4 = bounA4;
        this.defensa = defensa;
        this.bounD1 = bounD1;
        this.bounD2 = bounD2;
        this.bounD3 = bounD3;
        this.bounD4 = bounD4;
        this.descanso = descanso;
        this.boundE1 = boundE1;
        this.boundE2 = boundE2;
        this.boundE3 = boundE3;
        this.boundE4 = boundE4;
        this.caida = caida;
        this.boundC1 = boundC1;
        this.boundC2 = boundC2;
        this.boundC3 = boundC3;
        this.boundC4 = boundC4;
        this.pose = pose;
        this.bounP1 = bounP1;
        this.bounP2 = bounP2;
        this.bounP3 = bounP3;
        this.bounP4 = bounP4;
        this.escenario = escenario;
        this.bso = bso;
        this.boton = boton;
    }
    public String nombre;
    public String nacionalidad;
    public int edad;
    public double estatura;
    public int peso;
    public int potencia;
    public int velocidad;
    public int fisico;
    public String descripcion;

    public String ataque;
    public int bounA1;
    public int bounA2;
    public int bounA3;
    public int bounA4;
    public String defensa;
    public int bounD1;
    public int bounD2;
    public int bounD3;
    public int bounD4;
    public String descanso;
    public int boundE1;
    public int boundE2;
    public int boundE3;
    public int boundE4;
    public String caida;
    public int boundC1;
    public int boundC2;
    public int boundC3;
    public int boundC4;
    public String pose;
    public int bounP1;
    public int bounP2;
    public int bounP3;
    public int bounP4;

    public String escenario;
    public String bso;
    public ImageView boton;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getFisico() {
        return fisico;
    }
    public void setFisico(int fisico) {
        this.fisico = fisico;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getAtaque() {
        return ataque;
    }
    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }
    public int getBounA1() {
        return bounA1;
    }
    public void setBounA1(int bounA1) {
        this.bounA1 = bounA1;
    }
    public int getBounA2() {
        return bounA2;
    }
    public void setBounA2(int bounA2) {
        this.bounA2 = bounA2;
    }
    public int getBounA3() {
        return bounA3;
    }
    public void setBounA3(int bounA3) {
        this.bounA3 = bounA3;
    }
    public int getBounA4() {
        return bounA4;
    }
    public void setBounA4(int bounA4) {
        this.bounA4 = bounA4;
    }
    public String getDefensa() {
        return defensa;
    }
    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }
    public int getBounD1() {
        return bounD1;
    }
    public void setBounD1(int bounD1) {
        this.bounD1 = bounD1;
    }
    public int getBounD2() {
        return bounD2;
    }
    public void setBounD2(int bounD2) {
        this.bounD2 = bounD2;
    }
    public int getBounD3() {
        return bounD3;
    }
    public void setBounD3(int bounD3) {
        this.bounD3 = bounD3;
    }
    public int getBounD4() {
        return bounD4;
    }
    public void setBounD4(int bounD4) {
        this.bounD4 = bounD4;
    }
    public String getDescanso() {
        return descanso;
    }
    public void setDescanso(String descanso) {
        this.descanso = descanso;
    }
    public int getBoundE1() {
        return boundE1;
    }
    public void setBoundE1(int boundE1) {
        this.boundE1 = boundE1;
    }
    public int getBoundE2() {
        return boundE2;
    }
    public void setBoundE2(int boundE2) {
        this.boundE2 = boundE2;
    }
    public int getBoundE3() {
        return boundE3;
    }
    public void setBoundE3(int boundE3) {
        this.boundE3 = boundE3;
    }
    public int getBoundE4() {
        return boundE4;
    }
    public void setBoundE4(int boundE4) {
        this.boundE4 = boundE4;
    }
    public String getCaida() {
        return caida;
    }
    public void setCaida(String caida) {
        this.caida = caida;
    }
    public int getBoundC1() {
        return boundC1;
    }
    public void setBoundC1(int boundC1) {
        this.boundC1 = boundC1;
    }
    public int getBoundC2() {
        return boundC2;
    }
    public void setBoundC2(int boundC2) {
        this.boundC2 = boundC2;
    }
    public int getBoundC3() {
        return boundC3;
    }
    public void setBoundC3(int boundC3) {
        this.boundC3 = boundC3;
    }
    public int getBoundC4() {
        return boundC4;
    }
    public void setBoundC4(int boundC4) {
        this.boundC4 = boundC4;
    }
    public String getPose() {
        return pose;
    }
    public void setPose(String pose) {
        this.pose = pose;
    }
    public int getBounP1() {
        return bounP1;
    }
    public void setBounP1(int bounP1) {
        this.bounP1 = bounP1;
    }
    public int getBounP2() {
        return bounP2;
    }
    public void setBounP2(int bounP2) {
        this.bounP2 = bounP2;
    }
    public int getBounP3() {
        return bounP3;
    }
    public void setBounP3(int bounP3) {
        this.bounP3 = bounP3;
    }
    public int getBounP4() {
        return bounP4;
    }
    public void setBounP4(int bounP4) {
        this.bounP4 = bounP4;
    }
    public String getEscenario() {
        return escenario;
    }
    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }
    public String getBso() {
        return bso;
    }
    public void setBso(String bso) {
        this.bso = bso;
    }
    public ImageView getboton() {
        return boton;
    }
    public void setboton(ImageView boton) {
        this.boton = boton;
    }
    @Override
    public String toString() {
        return "Peleador [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", estatura="
                + estatura + ", peso=" + peso + ", potencia=" + potencia + ", velocidad=" + velocidad + ", fisico="
                + fisico + ", descripcion=" + descripcion + ", ataque=" + ataque + ", bounA1=" + bounA1 + ", bounA2="
                + bounA2 + ", bounA3=" + bounA3 + ", bounA4=" + bounA4 + ", defensa=" + defensa + ", bounD1=" + bounD1
                + ", bounD2=" + bounD2 + ", bounD3=" + bounD3 + ", bounD4=" + bounD4 + ", descanso=" + descanso
                + ", boundE1=" + boundE1 + ", boundE2=" + boundE2 + ", boundE3=" + boundE3 + ", boundE4=" + boundE4
                + ", caida=" + caida + ", boundC1=" + boundC1 + ", boundC2=" + boundC2 + ", boundC3=" + boundC3
                + ", boundC4=" + boundC4 + ", pose=" + pose + ", bounP1=" + bounP1 + ", bounP2=" + bounP2 + ", bounP3="
                + bounP3 + ", bounP4=" + bounP4 + ", escenario=" + escenario + ", bso=" + bso + ", numeroPersonaje="
                + boton + "]";
    }
}
