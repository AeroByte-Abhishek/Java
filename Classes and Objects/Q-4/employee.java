class employeeData {
    int empId, salary;
    String name;

    void setEmpData(int a, String b, int c){
        empId = a;
        name = b;
        salary = c;
    }

    void showEmpData(){
        System.out.println("Employee Id : " + empId );
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }
}

public class employee{
    public static void main(String[] args) {
        employeeData e1 = new employeeData();
        e1.setEmpData(21, "Abhishek", 70000);
        e1.showEmpData();
    }
}