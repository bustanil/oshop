Scenario: Add item to shopping cart

Given a product with id 1, name Test Product 1, price 100000
Given a product with id 2, name Test Product 2, price 200000
Given shopping cart is empty
When user adds product id 1 to the shopping cart
Then shopping cart contain product id 1 with quantity 1
Then shopping cart item size is 1
Then shopping cart total is 100000

