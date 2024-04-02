
Feature: verify products page completelly

#@Postive
#Scenario: vierfy search product with valid product name
#Given OpenBrowser and Enter url
#When user enter valid username
#And  User Enter valid Password
#When user click on login button
#Then it should naviagte to Dashboarboard page and Text should be Dashboard
#When user click on cataloglink and  productspage link
#Then product page should be displayed
#When user enter valid product name
#And click on search button
#Then particular product should be displayed
#And Close borwser



#@negative
#Scenario: vierfy search product with Invalid product name
#Given OpenBrowser and Enter url
#When user enter valid username
#And  User Enter valid Password
#When user click on login button
#Then it should naviagte to Dashboarboard page and Text should be Dashboard
#When user click on cataloglink and  productspage link
#Then product page should be displayed
#When user enter invalid product name
#And click on search button
#Then It should throw some error message
#And Close borwser



@Regression
Scenario Outline:  vierfy search product with Mutiple product name
When user enter valid username
And  User Enter valid Password
When user click on login button
Then it should naviagte to Dashboarboard page and Text should be Dashboard
When user click on cataloglink and  productspage link
Then product page should be displayed
When user enter valid<Product Name>
And click on search button
Then particular product should be displayed as<Product Name>


Examples:
|Product Name|
|"Apple MacBook Pro 13-inch"|
|"Asus N551JK-XO076H Laptop"|
|"HP Spectre XT Pro UltraBook"|
|"Adobe Photoshop CS4"|












