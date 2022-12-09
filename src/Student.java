public class Student {
    private String msv ;
    private String name ;
    private int ege ;
    private String gender ;
    private String address ;
    private double GPA ;

    public Student() {
    }

    public Student(String msv, String name, int ege, String gender, String address, double GPA) {
        this.msv = msv;
        this.name = name;
        this.ege = ege;
        this.gender = gender;
        this.address = address;
        this.GPA = GPA;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{ " +
                " msv = '" + msv + '\'' +
                ", name = '" + name + '\'' +
                ", ege = " + ege +
                ", gender = '" + gender + '\'' +
                ", address = '" + address + '\'' +
                ", GPA = " + GPA +
                '}';
    }
}
