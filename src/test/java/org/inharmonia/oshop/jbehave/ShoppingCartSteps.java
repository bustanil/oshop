package org.inharmonia.oshop.jbehave;

import org.inharmonia.oshop.domain.Category;
import org.inharmonia.oshop.domain.Product;
import org.inharmonia.oshop.domain.ShoppingCart;
import org.inharmonia.oshop.domain.ShoppingCartItem;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class ShoppingCartSteps {

    private Product aProduct;
    private ShoppingCart shoppingCart;

    @Given("a product with id $id")
    public void aProduct(Long id) {
        aProduct = createProduct(id, "test", "description", new BigDecimal("10000000"));
    }


    @Given("shopping cart is empty")
    public void shoppingCartIsEmpty() {
        shoppingCart = new ShoppingCart();
    }

    @When("user adds a product with id $id to the shopping cart")
    public void addProductToCart(Long id) {
        shoppingCart.addItem(createProduct(id, "test", "description", new BigDecimal("10000000")));
    }

    @Then("the shopping cart should contain an item with product id $id and quantity $quantity")
    public void shoppingCartContainsProducts(Long id, Integer quantity) {
        ShoppingCartItem item = shoppingCart.getItemByProductId(id);
        assertNotNull(item);
        assertThat(item.getQuantity(), equalTo(quantity));
    }

    @Given("shopping cart contains an item with product id $id and quantity $quantity")
    public void shoppingCartContainsAnItem(Long id, Integer quantity) {
        aProduct = createProduct(id, "test", "description", new BigDecimal("10000000"));
        shoppingCart.addItem(aProduct, quantity);
    }

    @When("user updates an item (product id $id) quantity to $quantity")
    public void userUpdatesAnItem(Long id, Integer quantity) {
        shoppingCart.updateQuantity(id, quantity);
    }

    @When("user deletes item with product id $id")
    public void userDeletesItem(Long id) {
        shoppingCart.removeByProductId(id);
    }

    @Then("the shopping cart should contain no products")
    public void theShoppingCartShouldContainNoProducts() {
        shoppingCart.isEmpty();
    }

    private Product createProduct(Long id, String name, String description, BigDecimal price) {
        Category category = new Category();
        category.setId(1L);
        category.setName("root");
        Product product = new Product(id, name, description, price, null);
        category.addProduct(product);
        return product;
    }

}
