package ee.ivkhk.JKTV22WebStore.controllers;

import ch.qos.logback.core.model.Model;
import ee.ivkhk.JKTV22WebStore.entity.Product;
import ee.ivkhk.JKTV22WebStore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/")
    public String home(Model model){
        return "addProduct";
    }
    @PostMapping("/book")
    public String addProduct(@RequestParam String caption, Model model){

        Product product = new Product();
        productRepository.save(product);
        return "home";

    }
    @GetMapping("/book")
    public String getProduct(Model model){

        return "home";
    }
}
