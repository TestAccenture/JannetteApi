package com.apipublicuser.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import io.restassured.response.Response;

public class StepDefinitions {

String url;

Response response;
	
@Given("^que Accenture Test Automation consume el Api$")
public void que_accenture_test_automation_consume_el_api() throws Throwable {
	url = "https://api.octoperf.com/public/users/login";
}

@When("^se ingresa el usuario (.*) y contrasena (.*)$")
public void se_ingresa_el_usuario_testaccenturedrivegmailcom_y_contrasena_testaccenturedrive2019(String user, String pass) throws Throwable {
	url += "?password="+pass+"&username="+user;
	RestAssured.defaultParser = Parser.JSON; 	
	response = RestAssured.when().post(url);
}

@Then("^la respuesta es igual a (.*) y el parametro Key Token tenga un valor$")
public void la_respuesta_es_igual_a_y_el_parametro_key_token_tenga_un_valor(int code) throws Throwable {
   response.then().assertThat().statusCode(code); 
}

}