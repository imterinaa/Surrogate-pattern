package org.example;

public class Main {
    public static void main(String[] args) {
        DBRepository db = new PostgresRepository();
        DBRepository proxy = new Proxy(db);
        proxy.read();
    }
}