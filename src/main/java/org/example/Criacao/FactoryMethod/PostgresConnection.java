package org.example.Criacao.FactoryMethod;

public class PostgresConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Conectando ao PostgreSQL...");
    }
}