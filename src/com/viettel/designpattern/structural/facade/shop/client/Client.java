package com.viettel.designpattern.structural.facade.shop.client;

import com.viettel.designpattern.structural.facade.shop.facade.ShopFacade;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("contact@gpcoder.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("gpcodervn@gmail.com", "0988.999.999");
    }
}
