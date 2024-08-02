package com.javi.application.in;

public interface SaveUseCase<T> {
    public T save(T entity);
}
