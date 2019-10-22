package vn.linhnc.service;

import org.springframework.stereotype.Service;
import vn.linhnc.config.Product;

@Service
public class UserAdmin implements CustIF {
    @Override
    public String getInfo() {
        return "User Admin not cust normal";
    }

    @Override
    public Product getProduct() {
        return null;
    }
}
