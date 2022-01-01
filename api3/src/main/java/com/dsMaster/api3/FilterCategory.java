package com.dsmaster.api3;

import com.alibaba.dubbo.config.annotation.Service;
import com.dsmaster.core.ServiceCategory;
import com.dsmaster.core.ProductInfo;
import com.dsmaster.core.ProductList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Service(interfaceClass = ServiceCategory.class)
public class FilterCategory implements ServiceCategory {

    @Override
    public List<ProductInfo> getProductCategory(String category) {
        List<ProductInfo> res = new ArrayList<>();
        for (ProductInfo product : ProductList.PRODUCTS){
            if(category.equals(product.getCategory())){
                res.add(product);
            }
        }
        return res;
    }
}