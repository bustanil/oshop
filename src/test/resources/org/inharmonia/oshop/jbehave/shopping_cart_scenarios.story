Scenario: Add item to shopping cart

Given a product with id 100
Given shopping cart is empty
When user adds a product with id 100 to the shopping cart
Then the shopping cart should contain an item with product id 100 and quantity 1

Scenario: Update item quantity in shopping cart

Given a product with id 100
Given shopping cart is empty
Given shopping cart contains an item with product id 100 and quantity 1
When user updates an item (product id 100) quantity to 3
Then the shopping cart should contain an item with product id 100 and quantity 3

Scenario: Delete item in shopping cart

Given a product with id 100
Given shopping cart is empty
Given shopping cart contains an item with product id 100 and quantity 1
When user deletes item with product id 100
Then the shopping cart should contain no products

Scenario: Add existing item in shopping cart

Given a product with id 100
Given shopping cart is empty
Given shopping cart contains an item with product id 100 and quantity 1
When user adds a product with id 100 to the shopping cart
Then the shopping cart should contain an item with product id 100 and quantity 2