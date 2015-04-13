package exercises.EX2.math

/**
 * Created by alberto on 3/27/15.
 */
interface Operations {
    def Double sum(List elements);
    def Double subtract(List elements);
    def Double multiply(List elements);
    def Double divide(List elements) throws Exception;
    def Object linearSearch(List elements, def element);
    def Object binarySearch(List elements, def element);
    def List selectionSort(List elements);
    def List quickSort(List elements);
    def List mergeSort(List elements);
}
