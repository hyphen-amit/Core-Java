package abstractionExample;

public class EmployeeDetails extends Employee{

    private int experience;
    public EmployeeDetails() {
        super();
    }

    public EmployeeDetails(int experience){
        this.experience=experience;
    }


    public void isEligible(){
        if(experience >= 2){
            System.out.println("Employee is eligible for promotion");
        }else{
            System.out.println("Employee is not eligible for promotion");
        }
    }

}
