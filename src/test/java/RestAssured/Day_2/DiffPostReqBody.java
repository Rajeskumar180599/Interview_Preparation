package RestAssured.Day_2;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DiffPostReqBody {
    String id;

    //    @Test(priority = 1)
    void testUsingHashMap() {
        HashMap data = new HashMap();
        data.put("Name", "Rajesh");
        data.put("Location", "Tuticorin");
        String[] Courses = {"C++", "Java"};
        data.put("courses", Courses);

        id = given().contentType("application/json")
                .body(data)
                .when().post("http://localhost:3000/Employee_details")
                .jsonPath().getString("id");

        when().get("http://localhost:3000/Employee_details/" + id)
                .then().statusCode(200)
                .body("Name", equalTo("Rajesh"))
                .body("Location", equalTo("Tuticorin"))
                .body("courses[0]", equalTo("C++"))
//                .header("content-Type","aplication/json; charset=utf-8")
                .log().all();
    }

    @Test(priority = 2)
    void testDelete() {
        given().when().delete("http://localhost:3000/Employee_details/" + id)
                .then().statusCode(200)
                .log().all();
    }

//    @Test(priority = 1)
    void testUsingPOJOClass() {
        POJO_JsonData data = new POJO_JsonData();
        data.setName("Rajesh");
        data.setLocation("Tuticorin");
        String[] course = {"C++", "Java"};
        data.setCourses(course);

        id = given().contentType("application/json").body(data)
                .when().post("http://localhost:3000/Employee_details")
                .jsonPath().getString("id");

        when().get("http://localhost:3000/Employee_details/" + id)
                .then().statusCode(200)
                .body("name", equalTo("Rajesh"))
                .body("location", equalTo("Tuticorin"))
                .body("courses[1]", equalTo("Java"))
                .log().all();
    }

//    @Test(priority = 1)
    void testUsingJSONLibraryFile() {
        JSONObject data = new JSONObject();
        data.put("name","kumar");
        data.put("location","chennai");
        String[] courses={"Java","python"};
        data.put("Courses",courses);

       id = given().contentType("application/json").body(data.toString())
                .when().post("http://localhost:3000/Employee_details")
                .jsonPath().getString("id");

       when().get("http://localhost:3000/Employee_details/"+id)
               .then().statusCode(200)
               .body("name",equalTo("kumar"))
               .body("location",equalTo("chennai"))
               .body("Courses[1]",equalTo("python"))
               .log().all();
    }

    @Test(priority = 1)
    void testUsingExternalJsonFile() throws FileNotFoundException {
        File f =new File("RestAssured/Day_2/Student.json");
        FileReader fr = new FileReader(f);
        JSONTokener jt = new JSONTokener(fr);
        JSONObject data = new JSONObject(jt);

       id = given().contentType("application/json")
                .body(data)
                .when().post("http://localhost:3000/Employee_details")
                .jsonPath().getString("id");

       when().get("http://localhost:3000/Employee_details/"+id )
               .then().statusCode(200);


    }

}
