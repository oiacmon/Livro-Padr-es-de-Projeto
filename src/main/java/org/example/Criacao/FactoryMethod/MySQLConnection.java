package org.example.Criacao.FactoryMethod;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao MySQL...");
    }
}