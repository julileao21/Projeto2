package base;

import base.BaseUtil;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseUtil {

    public Response response;
    public RequestSpecification request;
    public String urlDigital = " https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\n";
    public String urlSweb = " http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador ";

}