package com.stepdefinitions;

import static io.restassured.RestAssured.given;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

public class stepsDefinitionsAPI {

    Response response;

    @Given("setup endpoint to fetch users")
    public void setupEndpoint()
    {
        RestAssured.baseURI="https://reqres.in/";
        RestAssured.basePath="/api/users";
    }


    @When("request is send to server with page number as {string}")
    public void sendRequest(String pageNumber)
    {
        response = given().
                queryParam("page",Integer.parseInt(pageNumber)).
                when().
                get().
                then().
                contentType(ContentType.JSON).
                extract().response();
    }


    @Then("validate the response of first user record having email as {string}")
    public void validateUserData(String emailID)
    {
        String userEmail = response.path("data[0].email");
        Assert.assertEquals(userEmail, emailID);
    }

    public HashMap<Object,Object> map=new HashMap<Object,Object>();

    @Given("setup endpoint with payload to create user {string}")
    public void setupEndpointAndPostData(String user)
    {
        RestAssured.baseURI="https://reqres.in/";
        RestAssured.basePath="/api/users";

        map.put("name",user);
        map.put("job", "QA Automation");
    }


    @When("request is send to the server and get the statusCode {string}")
    public void sendPostRequest(String statusCode)
    {
        response = given()
                .contentType(ContentType.JSON)
                .body(map)
                .when()
                .post()
                .then()
                .statusCode(Integer.parseInt(statusCode)).contentType(ContentType.JSON).
                        extract().response();
    }


    @Then("new user must be created with name as {string}")
    public void validateResponse(String name)
    {
        String userName = response.path("name");
        Assert.assertEquals(userName, name);
    }

}
