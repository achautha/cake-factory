package com.manning.cakefactory.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.manning.cakefactory.models.Catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCatalogRepository implements CatalogRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcCatalogRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Catalog> findAll() {
        return this.jdbc.query("select id, name, price from catalog", this::mapRowToCatalog);
    }

    @Override
    public Catalog findOne(Long id) {
        return this.jdbc.queryForObject("select id, name, price from catalog where id=?", this::mapRowToCatalog, id);
    }

    @Override
    public Catalog save(Catalog catalog) {
        jdbc.update("insert into catalog (id, name, price) values (?,?,?,?)", catalog.getId(), catalog.getName(),
                catalog.getPrice());
        return catalog;
    }

    private Catalog mapRowToCatalog(ResultSet rs, int rowNum) throws SQLException {
        return new Catalog(rs.getString("id"), rs.getString("name"), rs.getBigDecimal("price"));
    }
}
