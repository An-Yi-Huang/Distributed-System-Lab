package com.dsmaster.api3;

import com.alibaba.dubbo.config.annotation.Service;
import com.dsmaster.core.ServiceCategory;
import com.dsmaster.core.ProductInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Service(interfaceClass = ServiceCategory.class)
public class FilterCategory implements ServiceCategory {


    @Override
    public ProductInfo[] getProductCategory(ProductInfo[] products, String category) {
        ArrayList<ProductInfo> list = new ArrayList<>();
        for (ProductInfo product : products){
            if(category.equals(product.getCategory())){
                list.add(product);
            }
        }
        ProductInfo[] result = new ProductInfo[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}