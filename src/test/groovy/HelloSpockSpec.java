package test.groovy;

/**
 * Created by alberto on 3/26/15.
 */
public class HelloSpockSpec extends spock.lang.Specification {
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }
}
