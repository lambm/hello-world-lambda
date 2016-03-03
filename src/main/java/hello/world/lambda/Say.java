/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import java.util.Map;

/**
 *
 * @author mlamb
 */
public class Say {
    
    public String handler(Map map, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("received : " + map);
        if (map == null || map.isEmpty() || map.get("name") == null) {
            return "hello";
        } else {
            return "hello " + map.get("name");
        }
    }
    
}
