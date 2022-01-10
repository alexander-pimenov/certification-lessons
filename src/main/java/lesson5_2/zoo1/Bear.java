package lesson5_2.zoo1;

public class Bear {
    public String name;
    String favoriteToy;
    private String secondName;

    public void feedBear(String food) {
        System.out.println("eat food " + food);
        sleetOnly5Hours(1,"f");
    }

    String sleep(int num) {
        sleetOnly5Hours(num, "Hello");
        return "went to sleep";
    }

    private void sleetOnly5Hours(int num, String str) {
        System.out.println("sleep for 5 hours");
    }

    protected String doBearStuff(){
        return "Bear Play";
    }
}
