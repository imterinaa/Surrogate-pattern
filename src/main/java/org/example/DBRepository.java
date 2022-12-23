package org.example;

public interface DBRepository {
    void read();
    void beginTransaction();
    void endTransaction();
}