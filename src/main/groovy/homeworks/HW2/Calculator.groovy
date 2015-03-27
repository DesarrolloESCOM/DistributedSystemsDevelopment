package homeworks.HW2

/**
 * Created by alberto on 3/27/15.
 */
class Calculator implements Operations {


    @Override
    Double sum(def List elements) {
        if(elements){
            return elements.sum()
        } else {
            return 0
        }

    }

    @Override
    Double subtract(List elements) {
        if(elements){
            def result = elements[0];
            elements.remove(0)
            elements.each{
                result-=it;
            }
            return result
        } else {
            0
        }

    }

    @Override
    Double multiply(List elements) {
        def result = 1
        elements.each{
            result*=it;
        }
        return result
    }

    @Override
    Double divide(List elements) throws Exception {
        return null
    }

    @Override
    List linearSearc(List elements) {
        return null
    }

    @Override
    List binarySearch(List elements) {
        return null
    }

    @Override
    List bubbleSort(List elements) {
        return null
    }

    @Override
    List quickSort(List elements) {
        return null
    }

    @Override
    List mergeSort(List elements) {
        return null
    }
}
