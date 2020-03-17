package com.company;

public class Artifact {
    int nomer;
    String cult;
    int vek;

    static int count = 0;

    public Artifact(int nomer){
        this.nomer = nomer;
        count++;
    }

    public Artifact(int nomer, String cult){
        this.nomer = nomer;
        this.cult = cult;
        count++;
    }
    public Artifact(int nomer, String cult, int vek){
        this.nomer = nomer;
        this.cult = cult;
        this.vek = vek;
        count++;
    }

    public static void main(String[] args) {
        Artifact arti1 = new Artifact(212121);
        Artifact arti2 = new Artifact(456523, "Ацтеки");
        Artifact arti3 = new Artifact(652345, "Azteki", 23);

        System.out.println(arti1.nomer);
        System.out.println(arti2.nomer + arti2.cult);
        System.out.println(arti3.nomer + arti3.cult + arti3.vek);
        System.out.println(count);
    }
}
