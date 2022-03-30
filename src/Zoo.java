import Streams.ObjStream;
import Streams.ScannerStream;
import objects.Employee;
import stuffs.TextStream;

public class Zoo {

    public static void main(String[] args) {

        // Stuffs
        ScannerStream sc = new ScannerStream();  // fixed Scanner
        Employee[] employeeArray; // all employees in array

        // Employees
        if (TextStream.BasicEmployeeOrNot(sc)){   // do you want load basic Employees?
            employeeArray = ObjStream.loadData();
        }else {                                     // if no..
            byte employeeArraySize = 1;
            employeeArray = new Employee[employeeArraySize]; // all employees in array
            Employee[] arrayToFlip = new Employee[employeeArraySize]; // to flip in employyeArray..

//            while (TextStream.addEmployeeOrNot(sc)){  // do you want more employees?
//
//                for (byte a = 0; a<=employeeArraySize ; a++){
//
//                }
//
//                employeeArraySize++;
//                employeeArray[employeeArraySize - 1] = TextStream.createEmployee(sc);
//            }
        }



    }
}
