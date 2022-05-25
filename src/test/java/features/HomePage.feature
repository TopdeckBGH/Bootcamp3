@LoginPage
Feature: Home Page

  @Check
  Scenario: Check Login Page
    Given Enes is on Home page
    When click "Giris Yap" card in the top rigt
    Then should see Login Page
