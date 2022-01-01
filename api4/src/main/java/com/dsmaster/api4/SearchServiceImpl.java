package com.dsmaster.api1;


import com.dsmaster.core.SearchService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = SearchService.class)
public class SearchServiceImpl implements SearchService {
    @Override
    public List<ProductInfo> search(String msg) {
    	List<ProductInfo> res = new ArrayList<>();
    	// get all product
    	List<ProductInfo> collec = ProductList.PRODUCTS;
    	for (ProductInfo pro : collec) {
    		if (msg.equals(pro.category)) {
    			// find the category
    			res.add(pro);
    		}else if (msg.equals(pro.name)) {
    			// if find the only one product
    			res.add(pro);
    		}
    	}
    	return res;
    }
}