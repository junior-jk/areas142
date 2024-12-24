package com.iterasys;

public class AreaCalcular {

    // Função para calcular a área de um quadrado
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Função para calcular a área de um retângulo
    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    // Função para calcular a área de um círculo
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    // Função para calcular a área de um triângulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
