package org.example.Criacao.FactoryMethod;

public class MySQLConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }
}