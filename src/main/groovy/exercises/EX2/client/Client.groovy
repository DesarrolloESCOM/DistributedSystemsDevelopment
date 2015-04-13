package exercises.EX2.client

import groovy.json.JsonOutput
import sun.org.mozilla.javascript.internal.json.JsonParser

/**
 * Created by alberto on 4/12/15.
 */
class Client {
    def static connect(def params){
        def s = new Socket("localhost", 4444);
        def result
        s.withStreams { input, output ->
            def json =(new JsonOutput().toJson(params)+'\n')
            output << json
            result = input.newReader().readLine()
        }
        return result
    }
}
