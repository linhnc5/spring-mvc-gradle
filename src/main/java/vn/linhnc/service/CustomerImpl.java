package vn.linhnc.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import vn.linhnc.config.Product;

@Service
@Qualifier("CustomerOK")
public class CustomerImpl implements CustIF {

    @Override
    public String getInfo() {
        return "Customer Normal";
    }

    @Override
    public Product getProduct() {
        return new Product(2,"Dien thoai");
    }
}
