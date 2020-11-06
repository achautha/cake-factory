package com.manning.cakefactory.repositories;

import com.manning.cakefactory.models.Catalog;

import org.springframework.data.repository.CrudRepository;

public interface CatalogJpaRepository extends CrudRepository<Catalog, String> {

}
