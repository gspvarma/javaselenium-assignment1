Feature: To validate ReqRes user APIs with RestAssured library and Cucumber

  @APITest
  Scenario Outline: Verify Reqres GET API
    Given setup endpoint to fetch users
    When request is send to server with page number as '<page>'
    Then validate the response of first user record having email as '<emailID>'

    Examples:
      | page | emailID                  |
      | 2    | michael.lawson@reqres.in |
      | 1    | george.bluth@reqres.in   |


  @APITest
  Scenario Outline: Verify Reqres POST API
    Given setup endpoint with payload to create user "Mike"
    When request is send to the server and get the statusCode "201"
    Then new user must be created with name as '<username>'

    Examples:
      | username |
      | Mike     |