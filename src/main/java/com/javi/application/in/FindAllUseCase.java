package com.javi.application.in;

import com.javi.pagination.Page;
import com.javi.pagination.Paginator;

public interface FindAllUseCase<T> {
    public Paginator.Pair<T> findAll(Page page);
}

