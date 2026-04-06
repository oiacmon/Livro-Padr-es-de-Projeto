package org.example.Criacao.FactoryMethod;

public abstract class ConnectionFactory {

    public abstract Connection createConnection();

    public void openConnection() {
        Connection conn = createConnection();
        conn.connect();
    }
}