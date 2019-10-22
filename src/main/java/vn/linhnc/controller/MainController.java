package vn.linhnc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.linhnc.config.Product;
import vn.linhnc.config.User;
import vn.linhnc.service.CustIF;

@Controller
public class MainController {
    @Autowired
    @Qualifier("CustomerOK")
    private CustIF custService;

    @GetMapping("/test")
    public String getData(@RequestParam String param, Model model){
        String data = custService.getInfo();
        model.addAttribute("_data",data);
        model.addAttribute("_user" ,new User("linh","123"));

        return "home";
    }
    @GetMapping("/getproduct")
    public String getProduct(Model model){
//        String data = custService.getInfo();
        Product product = custService.getProduct();  // lay du lieu dc roi;
        model.addAttribute("_data",product);  // truyen sang view (htll/jsp) de hien thi
        return "trang_product";
    }

}
