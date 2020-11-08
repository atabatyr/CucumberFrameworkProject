@Smoke
Feature: User in the google page
Background:
Given user is on the google page
  Scenario: TC01 Verify iphone search
    And user search for "iphone"
    Then verify the result has "iphone"
