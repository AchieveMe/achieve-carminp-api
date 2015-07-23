Feature: Author search
  In order to be able to search for an author
  As a registered user
  I want to specify the conditions for the search

  Scenario: Search author by name
    Given an author with the name "Guilherme Magalhaes"
    When user search for the author with the name "Guilherme Magalhaes"
    Then user get the author name
    And only one author

