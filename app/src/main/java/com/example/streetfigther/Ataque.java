package com.example.streetfigther;

public class Ataque {
    public String movimiento;
    public int decision;

    public int boun1;
    public int boun2;
    public int boun3;
    public int boun4;

    public int ataque;
    public int defensa;
    public int descanso;

    public Ataque() {
        this.movimiento = movimiento;
        this.decision = decision;
        this.boun1 = boun1;
        this.boun2 = boun2;
        this.boun3 = boun3;
        this.boun4 = boun4;
        this.ataque = ataque;
        this.defensa = defensa;
        this.descanso = descanso;
    }

    public String getMovimiento() {
        return movimiento;
    }
    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }
    public int getDecision() {
        return decision;
    }
    public void setDecision(int decision) {
        this.decision = decision;
    }
    public int getBoun1() {
        return boun1;
    }
    public void setBoun1(int boun1) {
        this.boun1 = boun1;
    }
    public int getBoun2() {
        return boun2;
    }
    public void setBoun2(int boun2) {
        this.boun2 = boun2;
    }
    public int getBoun3() {
        return boun3;
    }
    public void setBoun3(int boun3) {
        this.boun3 = boun3;
    }
    public int getBoun4() {
        return boun4;
    }
    public void setBoun4(int boun4) {
        this.boun4 = boun4;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getDescanso() {
        return descanso;
    }
    public void setDescanso(int descanso) {
        this.descanso = descanso;
    }
    @Override
    public String toString() {
        return "Ataque [movimiento=" + movimiento + ", decision=" + decision + ", boun1=" + boun1 + ", boun2=" + boun2
                + ", boun3=" + boun3 + ", boun4=" + boun4 + ", ataque=" + ataque + ", defensa=" + defensa
                + ", descanso=" + descanso + "]";
    }
}
