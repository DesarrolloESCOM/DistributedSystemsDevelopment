package exercises.EX1.db.tools

/**
 * Created by alberto on 3/31/15.
 */
trait DatabaseQueriesTrait {
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
        def size = conditions.size()
        conditions.eachWithIndex { it, index ->
            if (it.value.class.getSimpleName() in ['String', 'GStringImp']) {
                query += "${it.key} like '${it.value}'"
            } else {
                query += "${it.key}=${it.value}"
            }
            if (index < size - 1) {
                query += " and "
            }
        }
        query
    }


    def insert(def entity) {

    }

    def delete(def entity) {

    }

    def update(def entity) {

    }
}