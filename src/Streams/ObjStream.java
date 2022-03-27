package Streams;

import objects.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * this is class for save and load data in txt document
 */

public class ObjStream {

    /**
     * This is method for load data from txt doc.
     * CARE !!! if someone delete data or somehow its happens that there is no data, there may come error! more in @return
     * @return it will return employee from loaded data (if data are empty = basically return 0 length object array!!)
     */

    public static Employee [] loadData(){
        Employee [] employeesData = new Employee[0];

        try {

            FileInputStream inputStream = new FileInputStream("data/data.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            employeesData = (Employee[]) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            System.out.println("there is a error, probably you already didn't save any employee to data or something..");
            e.getStackTrace();
        }
        return employeesData;
    }
}
