package exercises.EX4.rmi.interfaces

/**
 * Created by alberto on 5/6/15.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote{
    def Double sum(List elements) throws RemoteException;
    def Double subtract(List elements) throws RemoteException;
    def Double multiply(List elements) throws RemoteException;
    def Double divide(List elements) throws Exception,RemoteException;
    def Object linearSearch(List elements, def element) throws RemoteException;
    def Object binarySearch(List elements, def element) throws RemoteException;
    def List selectionSort(List elements) throws RemoteException;
    def List quickSort(List elements) throws RemoteException;
    def List mergeSort(List elements) throws RemoteException;
}