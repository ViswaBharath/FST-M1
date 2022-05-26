@activity1
  Feature: Google Search

    Scenario: Performing a google search for Cheese
      Given User is on Google home page
      When User types in Cheese and hits Enter
      Then Show how many search results were shown
#      And Close the browser