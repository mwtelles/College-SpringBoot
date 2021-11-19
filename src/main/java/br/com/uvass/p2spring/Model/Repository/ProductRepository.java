package br.com.uvass.p2spring.Model.Repository;

import br.com.uvass.p2spring.Model.Entity.Installments;
import br.com.uvass.p2spring.Model.Entity.Product;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class ProductRepository {

    private JdbcTemplate jdbcTemplate;
    private InstallmentsRepository installmentsRepository;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.installmentsRepository = new InstallmentsRepository(jdbcTemplate);
    }

    public ArrayList<Product> searchAllProducts() throws Exception {
        String sql = "SELECT * FROM product";
        ArrayList<Product> search = (ArrayList<Product>) jdbcTemplate.query(sql, new ProductMapper());

        search.forEach(product -> {
            Installments installment = installmentsRepository.searchInstallment(product.getInstallments_id());
            product.setInstallments(installment);
        });

        if (search.size() > 0) {
            return search;
        }

        throw new Exception("Nenhum produto encontrado");
    }

}
