import homeworks.HW2.Calculator
import spock.lang.Shared

/**
 * Created by alberto on 3/27/15.
 */
class CalculatorSpec extends spock.lang.Specification {
    @Shared
    Calculator calc

    def setupSpec() {
        calc = new Calculator()
    }

    def "should sum n numbers"() {
        expect:
        calc.sum(values) == result
        where:
        values      | result
        [1, 2, 3]   | 6
        [1, 1, 1]   | 3
        []          | 0
        null        | 0
        [1, -1, -1] | -1
    }

    def "should subtract to the first number the next n values"() {
        expect:
        calc.subtract(values) == result
        where:
        values      | result
        [1, 2, 3]   | -4
        [1, 1, 1]   | -1
        []          | 0
        null        | 0
        [1, -1, -1] | 3
    }

    def "should multiply all the vales from a list"() {
        expect:
        calc.multiply(values) == result
        where:
        values      | result
        [1, 2, 3]   | 6
        [1, 1, 1]   | 1
        []          | 0
        null        | 0
        [1, -1, -1] | 1
    }

        def "should divide the first value from the next n  vales from a list"() {
        expect:
        calc.multiply(values) == result
        where:
        values      | result
        [1, 2, 3]   | 6
        [1, 1, 1]   | 1
        []          | 0
        null        | 0
        [1, -1, -1] | 1
    }
}
