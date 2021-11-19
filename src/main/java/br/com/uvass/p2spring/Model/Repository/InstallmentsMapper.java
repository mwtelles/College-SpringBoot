package br.com.uvass.p2spring.Model.Repository;

import br.com.uvass.p2spring.Model.Entity.Installments;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InstallmentsMapper implements RowMapper<Installments> {
    @Override
    public Installments mapRow(ResultSet resultSet, int i) throws SQLException {
        Installments installments = new Installments();
        installments.setId(resultSet.getInt("id"));
        installments.setCount(resultSet.getInt("count"));
        installments.setValue(resultSet.getFloat("value"));
        return installments;
    }
}
