package org.inharmonia.oshop.controller;

import org.inharmonia.oshop.domain.ShoppingCart;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BaseController implements ApplicationContextAware {

    protected ApplicationContext applicationContext;

    protected ShoppingCart getShoppingCart() {
        return applicationContext.getBean(ShoppingCart.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
