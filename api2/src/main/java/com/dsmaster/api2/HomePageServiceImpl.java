package com.dsmaster.api2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

import com.alibaba.dubbo.config.annotation.Service;
import com.dsmaster.core.HomePageService;
import com.dsmaster.core.ProductInfo;
import com.dsmaster.core.ProductList;

import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = HomePageService.class)
public class HomePageServiceImpl implements HomePageService {
    private int k = 10;

    @Override
    public List<ProductInfo> getRecommendationProducts() {
        //get the top k best sellers
        
        //Build a min heap and keep its size k, iteratively add the product into it, 
        //the remaining elements in it will be the top k best sellers
        Queue<ProductInfo> topSellers = new PriorityQueue<ProductInfo>(new Comparator<ProductInfo>(){
            public int compare(ProductInfo a, ProductInfo b){
                return a.getSales() - b.getSales();
            }
        });

        for(ProductInfo product : ProductList.PRODUCTS){
            topSellers.add(product);
            if(topSellers.size() > k){
                topSellers.poll();
            }
        }

        List<ProductInfo> res = new ArrayList<>();
        
        while(topSellers.size() > 0){
            res.add(topSellers.poll());
        }

        return res;        
    }

}