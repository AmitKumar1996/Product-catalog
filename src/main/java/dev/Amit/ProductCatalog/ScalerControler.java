package dev.Amit.ProductCatalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScalerControler {
    @GetMapping("/ram")
    public String hello(){
        return "Jay Shri Ram";
    }
}
