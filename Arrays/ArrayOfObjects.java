package Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {
        //creating array of employee
        Employee[] emp;

        //allocating memory
        emp = new Employee[5];

        //initialising
        emp[0]=new Employee(1, "Tony Stark");
        emp[1]=new Employee(2, "Steve Rogers");
        emp[2]=new Employee(3, "Peter Parker");
        emp[3]=new Employee(4, "Steven Strange");
        emp[4]=new Employee(5, "Bruce Banner");

        for(int i=0;i< emp.length;i++){
            System.out.println("id = "+ emp[i].getId()+ " name = "+ emp[i].getName());
        }
    }





}
