Feature: veirfy loginfunction completely



@Postive
Scenario: verify loginfunction with validdata
When user enter valid username
And  User Enter valid Password
When user click on login button
Then it should naviagte to Dashboarboard page and Text should be Dashboard


#
#@negative
#Scenario: verify loginfunction with Invalid data
#When user enter invalid username
#And  user enter invaid password
#When user click on login button
#Then it should throw an error message as invalid username and password
#
#
#@negative
#Scenario: verifyLoginFunctionWithvalidusernameAndInvalidPwd
#When user enter valid username
#And  user enter invaid password
#When user click on login button
#Then it should throw error message
#
#
#@negative
#Scenario: verifyLoginFunctionWithoutData
#When  user keep username and password Fileds Empty
#When user click on login button
#Then it should throw error message as please enter your email



