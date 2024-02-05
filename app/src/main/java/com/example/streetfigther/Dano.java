package com.example.streetfigther;

public class Dano {

    public Dano() {
        super();
        this.vida1 = vida1;
        this.vida2 = vida2;
        this.estamina1 = estamina1;
        this.estamina2 = estamina2;
        this.resis1 = resis1;
        this.resis2 = resis2;
    }
    public int vida1;
    public int vida2;
    public int estamina1;
    public int estamina2;
    public boolean resis1;
    public boolean resis2;
    public int getVida1() {
        return vida1;
    }
    public void setVida1(int vida1) {
        this.vida1 = vida1;
    }
    public int getVida2() {
        return vida2;
    }
    public void setVida2(int vida2) {
        this.vida2 = vida2;
    }
    public int getEstamina1() {
        return estamina1;
    }
    public void setEstamina1(int estamina1) {
        this.estamina1 = estamina1;
    }
    public int getEstamina2() {
        return estamina2;
    }
    public void setEstamina2(int estamina2) {
        this.estamina2 = estamina2;
    }
    public boolean isResis1() {
        return resis1;
    }
    public void setResis1(boolean resis1) {
        this.resis1 = resis1;
    }
    public boolean isResis2() {
        return resis2;
    }
    public void setResis2(boolean resis2) {
        this.resis2 = resis2;
    }
    @Override
    public String toString() {
        return "Dano [vida1=" + vida1 + ", vida2=" + vida2 + ", estamina1=" + estamina1 + ", estamina2=" + estamina2
                + ", resis1=" + resis1 + ", resis2=" + resis2 + "]";
    }

}
