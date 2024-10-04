package company;

class MyEmployee {
    private String name;
    private int id;

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

public class cwh_40_ch9 {
    public static void main(String[] args) {

        MyEmployee joy = new MyEmployee();
        joy.setName("Joy");
        joy.setId(33);
        System.out.println(joy.getId());
        System.out.println(joy.getName());
    }


}
