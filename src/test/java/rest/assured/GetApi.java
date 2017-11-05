package rest.assured;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetApi {

    @Test
    public void getRequest(){

        Response response = get("https://app.keysurvey.com/");

        int status = response.statusCode();
        String resp = response.asString();

        Assert.assertEquals(status, 200);
        System.out.println("Status code is " + status);
        System.out.println("Json body " + resp);



    }
}
