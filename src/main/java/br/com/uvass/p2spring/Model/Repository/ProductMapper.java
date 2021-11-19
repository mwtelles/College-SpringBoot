package br.com.uvass.p2spring.Model.Repository;

import br.com.uvass.p2spring.Model.Entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setDescription(resultSet.getString("description"));
        product.setImage(resultSet.getString("imageUrl"));
        product.setOldPrice(resultSet.getFloat("oldPrice"));
        product.setPrice(resultSet.getFloat("price"));
        product.setInstallments_id(resultSet.getInt("installments_id"));

        return product;
    }
}
