package project.test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, strict = true)
public class RunCucumberTest {
    public static void SimpleGETPost (String postNumber) {
        String uriBase = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador"+postNumber;
        given()
                .contentType(ContentType.JSON);
        when()
                .get(uriBase)
                .then()
                .body("meses", is("id"));
    }
}
