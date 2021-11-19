package br.com.uvass.p2spring.Controller;

import br.com.uvass.p2spring.Model.Entity.Product;
import br.com.uvass.p2spring.Model.Repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(JdbcTemplate jdbcTemplate) {
        productRepository = new ProductRepository(jdbcTemplate);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/")
    public ArrayList<Product> searchProducts() throws Exception {
        return productRepository.searchAllProducts();
    }
}
