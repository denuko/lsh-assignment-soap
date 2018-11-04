package lsh.assignment.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import soap.assignment.lsh.models.soap.emp.BigDecimalMath;
import soap.assignment.lsh.models.soap.emp.GetBigDecimalMathRequest;
import soap.assignment.lsh.models.soap.emp.GetBigDecimalMathResponse;

@Endpoint
public class BigDecimalMathEndpoint {

    @PayloadRoot(namespace = "http://lsh.assignment.soap/big-decimal-math", localPart = "GetBigDecimalMathRequest")
    @ResponsePayload
    public GetBigDecimalMathResponse GetBigDecimalMath(@RequestPayload GetBigDecimalMathRequest request) {
        GetBigDecimalMathResponse response = new GetBigDecimalMathResponse();

        BigDecimalMath bigDecimalMath = new BigDecimalMath();

        response.setBigDecimalMath(bigDecimalMath);

        return response;
    }
}
