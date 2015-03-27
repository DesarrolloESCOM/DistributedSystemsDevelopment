package homeworks.HW2

/**
 * Created by alberto on 3/27/15.
 */
interface Operations {
    def Double sum(List elements);
    def Double subtract(List elements);
    def Double multiply(List elements);
    def Double divide(List elements) throws Exception;
    def List linearSearc(List elements);
    def List binarySearch(List elements);
    def List bubbleSort(List elements);
    def List quickSort(List elements);
    def List mergeSort(List elements);
}
