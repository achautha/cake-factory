package com.manning.cakefactory.repositories;

import com.manning.cakefactory.models.Catalog;

public interface CatalogRepository {

    public Iterable<Catalog> findAll();

    public Catalog findOne(Long id);

    public Catalog save(Catalog catalog);
}
