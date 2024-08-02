package com.javi.application.out;

public interface SavePersistence<T> {
    public T save(T entity);
}
