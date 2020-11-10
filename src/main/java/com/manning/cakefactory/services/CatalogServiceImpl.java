package com.manning.cakefactory.services;

import java.util.ArrayList;
import java.util.List;
import com.manning.cakefactory.models.Catalog;
import com.manning.cakefactory.repositories.CatalogJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final CatalogJpaRepository catalogJpaRepository;

    @Autowired
    public CatalogServiceImpl(CatalogJpaRepository catalogJpaRepository) {
        this.catalogJpaRepository = catalogJpaRepository;
    }

    @Override
    public List<Catalog> listCatalog() {
        List<Catalog> catalog = new ArrayList<>();
        this.catalogJpaRepository.findAll().forEach(i -> catalog.add(i));
        return catalog;
    }

}
