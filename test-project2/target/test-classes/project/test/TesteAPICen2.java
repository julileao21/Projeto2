package project.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://stackoverflow.com/questions/1381512/how-do-i-run-junit-from-netbeans
http://www.matera.com/blog/post/rest-assured-como-criar-testes-automaticos-para-api-rest
https://medium.com/qa-sampa-meeting/primeiros-testes-api-rest-assured-2f4397bad355
https://www.tutorialspoint.com/How-to-convert-Java-Array-Collection-to-JSON-array
https://stackoverflow.com/questions/20117148/how-to-create-json-object-using-string
 */

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.is;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author marce
 */
public class TesteAPICen2 {
    
    public TesteAPICen2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void Teste() {
//        Cenario: Consultar o formulário de simulação
//        Dado o endereço da API para manter o cadastro do associado
//        Quando realizar uma requisição de consulta passando o ID do cadastro
//        Então a API irá retornar os dados do associado corresponte respondendo o código 200

        String uriBase = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
        given()
            .relaxedHTTPSValidation()
            .param("ID", "1")
        .when()
            .get(uriBase)   
        .then()
            .statusCode(200);
        
        //podemos usar o r    
        Response r =given()
            .relaxedHTTPSValidation()
            .param("ID", "1")
        .when()
            .get(uriBase);
        
        System.out.println("R"+r);
    
    }
}
