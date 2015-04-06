import spock.lang.Shared
import excersices.EX2.Calculator

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
        calc.divide(values) == result
        where:
        values      | result
        [1, 2, 2]   | 0.25
        [1, 1, 1]   | 1
        []          | 0.0
        null        | 0.0
        [1, -1, -1] | 1
    }

    def "should search for an item in a list using linear search"() {
        expect:
        calc.linearSearch(values,value) == result
        where:
        values          |value     || result
        [1, 2, 7]       |7         || 7
        [1, 1, 1]       |1         || 1
        []              | null     || null
        null            | null     || null
        [1, -1, -1]     | 15       || null
    }

    def "should search for an item in a list using binary search"() {
        expect:
        calc.binarySearch(values,value) == result
        where:
        values          |value     || result
        [1, 2, 7]       |7         || 7
        [1, 1, 1]       |1         || 1
        []              | null     || null
        null            | null     || null
        [1, -1, -1]     | 15       || null
    }

    def "should sort an array using selection sort"() {
        expect:
        calc.selectionSort(values) == result
        where:
        values      | result
        [2, 1, 3]   | [1, 2, 3]
        [1, 3, 0]   | [0, 1, 3]
        []          | []
        null        | null
        [1, -1, -1] | [-1, -1, 1]
    }

    def "should sort an array using merge sort"() {
        expect:
        calc.mergeSort(values) == result
        where:
        values      | result
        [2, 1, 3]   | [1, 2, 3]
        [1, 3, 0]   | [0, 1, 3]
        []          | []
        null        | null
        [1, -1, -1] | [-1, -1, 1]
    }

    def "should sort an array using quick sort"() {
        expect:
        calc.quickSort(values) == result
        where:
        values      | result
        [2, 1, 3]   | [1, 2, 3]
        [1, 3, 0]   | [0, 1, 3]
        []          | []
        null        | null
        [1, -1, -1] | [-1, -1, 1]
    }
}
