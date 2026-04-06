package org.example.Criacao.FactoryMethod;

public class PostgresConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }
}