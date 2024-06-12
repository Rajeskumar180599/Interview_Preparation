package RestAssured.Day_1;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class HTTP_sample_request {
    String id;
    @Test(priority = 2)
   static void Get() {
        given()
                .when().get("http://localhost:3000/Employee_details")
                .then().statusCode(200)
                .log().all();
    }

    @Test(priority = 1)
    void Post(){
        HashMap data = new HashMap();
        data.put("name","Rajesh");
        data.put("job","Engineer");

        id = given().contentType("application/json")
                .body(data)
                .when().post("http://localhost:3000/Employee_details")
//                .then().statusCode(201).log().all();
                .jsonPath().getString("id");

    }

    @Test(priority = 3,dependsOnMethods = "Post")
    void Put(){
        HashMap data = new HashMap();
        data.put("name","kumar");
        data.put("job","IT");

        given().contentType("application/json")
                .body(data)
                .when().put("http://localhost:3000/Employee_details/"+id)
                .then().statusCode(200)
                .log().all();
    }

    @Test(priority = 4,dependsOnMethods = "Post")
    void Delete(){
        given()
                .when().delete("http://localhost:3000/Employee_details/"+id)
                .then().statusCode(200)
                .log().all();
        Get();
    }
}
