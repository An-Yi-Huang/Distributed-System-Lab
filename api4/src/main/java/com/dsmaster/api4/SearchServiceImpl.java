package com.dsmaster.api4;

import com.dsmaster.core.ProductInfo;
import com.dsmaster.core.ProductList;
import com.dsmaster.core.SearchService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
@Service(interfaceClass = SearchService.class)
public class SearchServiceImpl implements SearchService {
    @Override
    public List<ProductInfo> search(String msg) {
    	List<ProductInfo> res = new ArrayList<>();
    	// get all product
    	List<ProductInfo> collec = ProductList.PRODUCTS;
    	for (ProductInfo pro : collec) {
    		if (msg.equals(pro.getCategory())) {
    			// find the category
    			res.add(pro);
    		}else if (msg.equals(pro.getName())) {
    			// if find the only one product
    			res.add(pro);
    		}
    	}
    	return res;
    }
}