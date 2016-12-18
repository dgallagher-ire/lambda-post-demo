package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<RequestClass, ResponseClass> {

    @Override
    public ResponseClass handleRequest(RequestClass input, Context context) {
    	final LambdaLogger logger = context.getLogger();
        logger.log("started");

        final ResponseClass resp = new ResponseClass();
        resp.setResponse(input.toString());
        return resp;
    }

}
