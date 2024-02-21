package testApi;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class reqUserApi {
    @Test
    public void getListUser(){
        File jsonSchema = new File("src/test/resources/jsonSchema/schemaUser");

        RestAssured.given().when()
                .get("https://gorest.co.in/public/v2/users") //masukan link api
                .then().log().all()
                .assertThat().statusCode(200);
    }
}
