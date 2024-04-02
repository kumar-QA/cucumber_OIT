Feature: verify login Function

@multi
  Scenario Outline: verify loginFunction With Multiple test data
   Given OpenBrowser and Enter url
   When User Enter username as<username>
   When user Enter password as<Password>
   When user click on login Btn
   Then it should display loginsucessfullypage
   
   Examples:
 |username | Password|
 |"abc123"|"123343"|
 |"def123"|"4567"|
 |"student"|"123"|
   