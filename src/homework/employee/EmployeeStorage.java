package homework.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];

    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] temp = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }

    public void searchByID(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().contains(keyword)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("Employee with " + keyword + " not found");
        }
    }

    public void searchByCompanyName(String keyWord) {
        boolean found =false;
        for (int i = 0; i < size; i++) {
            Employee employee=array[i];
            if (employee.getCompany().contains(keyWord)){
                found=true;
                System.out.println(employee);
            }
        }
        if (!found){
            System.out.println("Employee with " + keyWord + " not found");
        }
    }
}
