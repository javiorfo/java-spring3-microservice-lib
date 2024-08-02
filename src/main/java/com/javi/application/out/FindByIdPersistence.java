package com.javi.application.out;

import java.util.Optional;

public interface FindByIdPersistence<T> {
    public Optional<T> findById(int id);
}
