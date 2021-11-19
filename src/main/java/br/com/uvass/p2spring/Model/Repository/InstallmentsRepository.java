package br.com.uvass.p2spring.Model.Repository;

import br.com.uvass.p2spring.Model.Entity.Installments;
import org.springframework.jdbc.core.JdbcTemplate;

public class InstallmentsRepository {

    private JdbcTemplate jdbcTemplate;

    public InstallmentsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Installments searchInstallment(int id) {
        String sql = "SELECT * FROM installments WHERE id = ?";

        return jdbcTemplate.queryForObject(sql, new InstallmentsMapper(), id);
    }
}
