package br.com.cristopher.resources;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

@QuarkusTest
public class BitcoinResourceTest {

	@Test
	public void listar200Test() {
		RestAssured.given().get("bitcoins").then().statusCode(200);
	}

}
