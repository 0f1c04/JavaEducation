package com.kosta.day06;

//18.
public class ShopService {
    static ShopService shopService;

    private ShopService() {
    }

    static ShopService getInstance() {
        if (shopService == null) shopService = new ShopService();
        return shopService;
    }
}
