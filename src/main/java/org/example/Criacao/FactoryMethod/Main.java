package org.example.Criacao.FactoryMethod;

public class Main {
    public static void main(String[] args) {

        ConnectionFactory factory;

        factory = new MySQLConnectionFactory();
        factory.openConnection();

        factory = new PostgresConnectionFactory();
        factory.openConnection();
    }
}