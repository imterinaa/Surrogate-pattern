package org.example;

public class Proxy implements DBRepository {

    private final DBRepository rep;

    public Proxy(DBRepository rep) {
        this.rep = rep;
    }

    @Override
    public void endTransaction() {
        rep.endTransaction();
    }
    @Override
    public void read() {
        rep.beginTransaction();
        rep.read();
        rep.endTransaction();
    }

    @Override
    public void beginTransaction() {
        rep.beginTransaction();
    }

}
