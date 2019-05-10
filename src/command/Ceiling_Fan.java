package command;

public class Ceiling_Fan {
    private String Status;
    public void  high(){
        Status = "High";
        System.out.println("Ceiling Fan Status is "+Status);
    }

    public void low(){
        Status = "Low";
        System.out.println("Ceiling Fan Status is "+Status);
    }
}
