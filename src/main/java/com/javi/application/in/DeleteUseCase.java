package com.javi.application.in;

public interface DeleteUseCase<T> {
    public T delete(T entity);
}
