package command;

public class Garage_Door {
    private String Status;
    public void  open(){
        Status = "open";
        System.out.println("Garage Door Status is "+Status);
    }

    public void close(){
        Status = "close";
        System.out.println("Garage Door Status is "+Status);
    }
}
