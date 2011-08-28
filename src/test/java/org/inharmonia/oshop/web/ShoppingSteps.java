package org.inharmonia.oshop.web;

import org.inharmonia.oshop.core.domain.Products;
import org.inharmonia.oshop.web.controller.ShoppingCartController;
import org.inharmonia.oshop.web.domain.ShoppingCart;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.math.BigDecimal;
import java.util.HashMap;

public class ShoppingSteps {

    private ShoppingCartController shoppingCartController;

    @Given("a product with id #id, name $name, price $price")
    public void givenAProduct(Long productId, String name, BigDecimal price) {
        Products.addProduct(productId, name, name + " description", price);
    }

    @Given("shopping cart is empty")
    public void givenShoppingCartIsEmpty() {
        shoppingCartController = new ShoppingCartController();
        shoppingCartController.setShoppingCart(new ShoppingCart());
    }

    @When("user adds product id $id to the shopping cart")
    public void whenUserAddsProduct(Long id) {
        shoppingCartController.add(id);
    }

    @Then("shopping cart contain product id 1 with quantity 1")
    @Pending
    public void thenShoppingCartContain(Long id, Integer quantity) {
        HashMap<String, Object> modelMap = new HashMap<String, Object>();
        shoppingCartController.get(modelMap);

    }

    @Then("shopping cart item size is 1")
    @Pending
    public void thenShoppingCartItemSizeIs1() {
        // PENDING
    }

    @Then("shopping cart total is 100000")
    @Pending
    public void thenShoppingCartTotalIs100000() {
        // PENDING
    }


}
