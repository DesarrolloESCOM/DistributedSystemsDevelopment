package exercises.EX4.rmi.remoteserver

import exercises.EX4.rmi.interfaces.RemoteInterface

import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by alberto on 5/6/15.
 */
public class RMIImplementation extends UnicastRemoteObject implements RemoteInterface {

    protected RMIImplementation() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 1L;

    @Override
    Double sum(def List elements) throws RemoteException {
        if (elements) {
            return elements.sum()
        } else {
            return 0
        }

    }

    @Override
    Double subtract(List elements) throws RemoteException {
        if (elements) {
            def result = elements[0];
            elements.remove(0)
            elements.each {
                result -= it;
            }
            return result
        } else {
            0
        }

    }

    @Override
    Double multiply(List elements) throws RemoteException {
        def result = 1
        if (elements) {
            elements.each {
                result *= it;
            }
            return result
        } else {
            return 0
        }
    }

    @Override
    Double divide(List elements) throws Exception,RemoteException {
        if (elements) {
            def result = elements[0];
            elements.remove(0)
            elements.each {
                result /= it;
            }
            return result
        } else {
            return 0.0
        }
    }

    @Override
    def Object linearSearch(List elements, def element) throws RemoteException {
        return elements.find { it == element }
    }

    @Override
    def Object binarySearch(List elements, def element) throws RemoteException {
        if (elements) {
            def sortedElements = elements?.sort()
            def index = Collections.binarySearch(sortedElements, element)

            if (index > 0) {
                return sortedElements[index]
            }
        }
        return null
    }

    @Override
    List selectionSort(List elements) throws RemoteException {
        if (elements) {
            for (i in 0..elements.size() - 1) {
                def curr = i

                for (j in curr..elements.size() - 1) {
                    if (elements[j] < elements[curr]) {
                        curr = j
                    }
                }

                Collections.swap(elements, i, curr)
            }

            return elements
        } else {
            return elements
        }

    }

    @Override
    List quickSort(List elements) throws RemoteException {
        return elements?.sort()
    }

    @Override
    List mergeSort(List elements) throws RemoteException {
        def result

        if (elements?.size() <= 1) {
            return elements
        } else {
            List left, right
            def lst_size = elements?.size();
            int lst_mid = (lst_size - 1) / 2

            left = elements[0..lst_mid]
            right = elements[lst_mid + 1..lst_size - 1]

            left = mergeSort(left)
            right = mergeSort(right)

            result = merge(left, right)

            return result
        }
    }

    List merge(List left, List right) {
        List result = []

        while (left.size() > 0 && right.size() > 0) {

            def l_size = left.size()
            def r_size = right.size()

            if (left[0] <= right[0]) {
                result << left[0]

                if (l_size > 1) {
                    left = left[1..l_size - 1]
                } else {
                    left = []
                }

            } else {
                result << right[0]
                if (r_size > 1) {
                    right = right[1..r_size - 1]
                } else {
                    right = []
                }
            }

        }
        if (left.size() > 0) result += left
        if (right.size() > 0) result += right

        return result
    }

}
