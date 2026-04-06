package org.example.Criacao.AbstractFactory;

public class BotaoEscuro implements Botao {
    @Override
    public void desenhar() {
        System.out.println("Desenhando botão escuro");
    }
}