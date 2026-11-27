package object.apo20;

public class CaptainApo {

    private String name;
    private int age;

    public CaptainApo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (this == null) return false;
//        CaptainApo apo = (CaptainApo) obj;
//        if (obj.getClass() != apo.getClass()) return false;
//    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
