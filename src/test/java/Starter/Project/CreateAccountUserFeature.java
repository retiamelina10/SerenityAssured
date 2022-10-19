package Starter.Project;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class CreateAccountUserFeature {
    private String url, data;
    public void setUrl() {
        url = "https://demoqa.com/swagger/#/Account/AccountV1UserPost";
    }

    public void setUserNameAndPassword() {
        data = "username";
        data = "password";
    }
    public JSONObject allCreateAccountUserFeature(){
        JSONObject body = new JSONObject();
        body.put("username", "Retiaaa");
        body.put("password", "Keluargacemara-10");
        return body;
    }

    public void requestWithUsernameAndPassword() {
        given().header("Authorization", url)
                .header("Content-Type", "application/json")
                .body(allCreateAccountUserFeature().toJSONString());
        when().post(url);

    }

    public void getStatusCode200() {
        then().statusCode(200);
    }

    public void verifyDetailResponse() {
        then().body("username", equalTo("Retiaaa"
        ));
        then().body("password", equalTo("Keluargacemara-10"));
    }
}
