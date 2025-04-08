package org.example;

public class servivo {

    protected int idade;

    public servivo(int idade) {
        this.idade = idade;


    }

    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Inalando e exalando CO2 e O2");
    }


    public void dormir() {
        System.out.println("dormindo");
    }

}
