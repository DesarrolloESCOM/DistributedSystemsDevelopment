package exercises.RestCalc.groovlets

import groovy.json.*
import exercises.EX2.math.Calculator

/**
 * Created by alberto on 1/07/15.
 */
import groovy.json.*

def calculator = new Calculator()
def result
if (params.method in ['linearSearch', 'binarySearch']) {
    result = calculator."${params.method}"(params.items as List, params.toBeFound)
} else {
    result = calculator."${params.method}"(params.items as List)
}
println(new JsonBuilder([result: result]).toPrettyString())
response.contentType = 'application/json'