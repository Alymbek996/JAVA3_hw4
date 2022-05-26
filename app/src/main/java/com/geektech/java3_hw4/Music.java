package com.geektech.java3_hw4;

public class Music {
    private String ispolnitel;
    private  String nazvaniy;
    private int numberO;
    private String dlit;

    public Music(String ispolnitel, String nazvaniy, int numberO, String dlit) {
        this.ispolnitel = ispolnitel;
        this.nazvaniy = nazvaniy;
        this.numberO = numberO;
        this.dlit = dlit;
    }


    public String getIspolnitel() {
        return ispolnitel;
    }

    public void setIspolnitel(String ispolnitel) {
        this.ispolnitel = ispolnitel;
    }

    public String getNazvaniy() {
        return nazvaniy;
    }

    public void setNazvaniy(String nazvaniy) {
        this.nazvaniy = nazvaniy;
    }

    public int getNumberO() {
        return numberO;
    }

    public void setNumberO(int numberO) {
        this.numberO = numberO;
    }

    public String getDlit() {
        return dlit;
    }

    public void setDlit(String dlit) {
        this.dlit = dlit;
    }
}
