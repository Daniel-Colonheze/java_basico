package org.example;

public class Uno implements carro {

    final int limitedevelocidade = 150;

    public int velocidadeatual = 0;

    @Override
    public void acelerar() {
        if(this.velocidadeatual < this.limitedevelocidade) {
            this.velocidadeatual += 10;
            System.out.println("Acelerando");
        }
        System.out.println("Velocidade atual ="+ this.velocidadeatual);

    }

    @Override
    public void freiar() {

    }

    @Override
    public void ligar() {

    }
}
