@LoginPage
Feature: Home Page

  @Check
  Scenario: Check Login Page
    Given Enes is on Homepage
    When Click "Giriş Yap" card in the top right
    Then Should see Login Page
