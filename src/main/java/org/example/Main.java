package org.example;

public class Main {
    public static void teste() {
        System.out.println("teste");
    }

    public static void main(String[] args) {
        carro meucarro = new Uno();
        carro meucarro2 = new RAM();
        servivo meuser = new humano();

        meuser.respirar();
        for(int i = 0; i < 30; i++){
            meucarro.acelerar();
        }
    }
}

