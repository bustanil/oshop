Scenario: Add item to shopping cart

Given a product
When user add it to the shopping cart
Then the shopping cart will contain a line item of that product
