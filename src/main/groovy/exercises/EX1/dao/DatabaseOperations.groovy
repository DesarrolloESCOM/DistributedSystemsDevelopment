package exercises.EX1.dao

/**
 * Created by alberto on 3/31/15.
 */
interface DatabaseOperations {
    def getAll(def entity);
    def findBy(def entity);
    def findAllBy(def entity);
    boolean insert(def entity);
    boolean delete(def entity);
    def update(def entity);
}