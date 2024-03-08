Feature: This allows golf caddies access to the golf club.
Background: login into the application
  Given I go to Sicagolf
  When I enter my data and log in
  Then I can see the dashboard
Scenario Outline: Registering which golf caddies have access to the golf club.
    Given I am in the vigilante dashboard
    When I write the caddy <document>
    Then They have access to the club
    Examples:
        | document    | 
        | 1019118954  | 