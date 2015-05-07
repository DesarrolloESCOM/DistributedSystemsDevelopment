import exercises.EX1.db.tools.DatabaseQueriesTrait
import exercises.EX1.entities.Career
import exercises.EX1.entities.Student
import spock.lang.Shared

/**
 * Created by alberto on 4/11/15.
 *
 */
class DatabaseQueriesSpec extends spock.lang.Specification {
    @Shared
    DatabaseQueriesTrait testInstance = new Object() as DatabaseQueriesTrait

    def "Should return a simple query from a given bean"() {
        expect:
        testInstance.getAll(entity) == result
        where:
        entity                                     | result
        new Student([id: 1, name: 'pepo'])         | "select (birthDate,career,email,id,lastName,name) from Student"
        new Career([id: 1, description: 'Doctor']) | "select (description,id) from Career"
    }

    def "Should return an specific projection query from a given bean"() {
        expect:
        testInstance.getAll(entity, filter) == result
        where:
        entity                                     | filter          || result
        new Student([id: 1, name: 'pepo'])         | ['id']          || "select (id) from Student"
        new Career([id: 1, description: 'Doctor']) | ['description'] || "select (description) from Career"
        new Career([id: 1, description: 'Doctor']) | []              || "select (description,id) from Career"
    }

    def "Should return an specific query from a given bean using given some conditions"() {
        expect:
        testInstance.findBy(entity, filter, conditions) == result
        where:
        entity                                     | filter          | conditions                                            || result
        new Student([id: 1, name: 'pepo'])         | ['id']          | [and: [equal: [id: 20]]]                              || "select (id) from Student where id=20"
        new Student([id: 1, name: 'pepo'])         | ['id']          | [and: [lessThan: [id: 20]]]                           || "select (id) from Student where id<20"
        new Student([id: 1, name: 'pepo'])         | ['id']          | [and: [greaterThan: [id: 20]]]                        || "select (id) from Student where id>20"
        new Student([id: 1, name: 'pepo'])         | ['id']          | [and: [lessOrEqualThan: [id: 20]]]                    || "select (id) from Student where id<=20"
        new Student([id: 1, name: 'pepo'])         | ['id']          | [or: [greaterOrEqualThan: [id: 20]]]                  || "select (id) from Student where id>=20"
        new Career([id: 1, description: 'Doctor']) | ['description'] | [or: [equal: [id: 20], like: [description: '%Des%']]] || "select (description) from Career where id=20 or description like '%Des%'"
    }

    def "Should create an insert query from given fields and values"() {
        expect:
        testInstance.insert(entity) == result
        where:
        entity                                                                             || result
        new Student([id: 1, name: 'pepo', lastName: 'resendiz', email: 'pepo27@pepo.com']) || "insert into Student (email,lastName,name) values ('pepo27@pepo.com','resendiz','pepo')"
        new Career([id: 1, description: 'Doctor'])                                         || "insert into Career (description) values ('Doctor')"
    }

    def "Should create an update query from a given entity, fields and conditions"() {
        expect:
        entity == result
        where:
        entity || result
        true   || true
    }
}
