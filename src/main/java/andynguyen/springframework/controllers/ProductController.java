package andynguyen.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Phuoc Nguyen Huu on 05-10-2023.
 */
@Controller
public class ProductController {

    @RequestMapping("/product")
    public String getProduct(){
        return "product";
    }
}
