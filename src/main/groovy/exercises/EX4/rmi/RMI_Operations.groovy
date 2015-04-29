package exercises.EX4.rmi

import java.rmi.Remote
import java.rmi.RemoteException

/**
 * Created by alberto on 4/25/15.
 */

interface RMI_Operations extends Remote {
    public Double sum(List elements) throws RemoteException;
    public Double subtract(List elements) throws RemoteException;
    public Double multiply(List elements) throws RemoteException;
    public Double divide(List elements) throws Exception;
    public Object linearSearch(List elements, def element) throws RemoteException;
    public Object binarySearch(List elements, def element) throws RemoteException;
    public List selectionSort(List elements) throws RemoteException;
    public List quickSort(List elements) throws RemoteException;
    public List mergeSort(List elements) throws RemoteException;
}
