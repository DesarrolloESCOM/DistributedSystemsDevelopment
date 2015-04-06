package excersices.EX1.dao

/**
 * Created by alberto on 3/31/15.
 */
interface ObjectDAO {
    def getAll(def entity);
    def findById(def entity);
    boolean insert(def entity);
    boolean delete(def entity);
    def update(def entity);
}