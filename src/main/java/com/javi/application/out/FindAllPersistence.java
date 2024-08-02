package com.javi.application.out;

import com.javi.pagination.Paginator;
import com.javi.pagination.Page;

public interface FindAllPersistence<T> {
    public Paginator.Pair<T> findAll(Page page);
}
