package exercises.EX1.db.tools

/**
 * Created by alberto on 3/31/15.
 */
trait DatabaseQueriesTrait {
    def final operators = [
            'equal'             : '=',
            'lessThan'          : '<',
            'greaterThan'       : '>',
            'lessOrEqualThan'   : '<=',
            'greaterOrEqualThan': '>=',
            'like'              : ' like '
    ]

    def getAll(def entity) {
        """select (${
            (entity.properties.findAll {
                !(it.key in ['class', 'metaClass'])
            }).collect { it -> it.key }.sort().join(',')
        }) from ${entity.class.getSimpleName()}"""
    }

    def getAll(def entity, def fields) {
        """select (${
            fields ? fields.join(',') : (entity.properties.findAll {
                !(it.key in ['class', 'metaClass'])
            }).collect { it -> it.key }.sort().join(',')
        }) from ${entity.class.getSimpleName()}"""
    }

    def findBy(def entity, def fields, def conditions) {
        def query = getAll(entity, fields) + " where "
        def results = conditions.collect { logic ->
            def logicOperators = logic.value.collect { sqlOperator ->
                def sqlOperators = sqlOperator.value.collect { condition ->
                    if (condition.value.class.getSimpleName() in ['String', 'GStringImp']) {
                        return "${condition.key}${operators[sqlOperator.key ?: 'like']}'${condition.value}'"
                    } else {
                        return "${condition.key}${operators[sqlOperator.key]}${condition.value}"
                    }
                }
                return sqlOperators.join(' ' + logic.key + ' ')
            }
            return logicOperators.join(' ' + logic.key + ' ')
        }
        query += results.size() > 1 ? results.join(' ') : results[0]
        return query
    }


    def insert(def entity) {

    }

    def delete(def entity) {

    }

    def update(def entity) {

    }
}