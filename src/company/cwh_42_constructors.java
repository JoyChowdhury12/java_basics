package company;


class MyMainEmployee {
    private String name;
    private int id;

    //    public com.MyMainEmployee() {
//        name = "Joy";
//        id = 41;
//    }
    public MyMainEmployee(int myId, String myName) {
        name = myName;
        id = myId;
    }


    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {

        MyMainEmployee joy = new MyMainEmployee(45, "Joy Chowdhury");
        System.out.println(joy.getId());
        System.out.println(joy.getName());
    }


}


