import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerStudent implements Serializable {
    Scanner scanner = new Scanner(System.in);
     private ArrayList<Student> studentList = new ArrayList<>();
    public final String REGEX_STRING = "[bon]";


    public void showStudent(){
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }

    public Student inputInformation(){
        System.out.println("Nhập mã sinh viên :");
        String code = scanner.nextLine() ;

        System.out.println("Nhập tên sinh viên :");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi sinh viên :");
        int ege = checkEge();

        System.out.println("Nhập giới tính sinh viên :");
        String gender = scanner.nextLine();

        System.out.println("Nhập địa chỉ sinh viên :");
        String address = scanner.nextLine();

        System.out.println("Nhập điểm trung bình :");
        double GPA ;

        while (true){
            try {
                GPA = Double.parseDouble(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Nhập lại định dạng đi bon :");
            }
        }
        Student students = new Student(code,name,ege,gender,address,GPA);
        System.out.println(students);
        return students;
    }

    public void addStudent(){
        Student students = inputInformation();
            studentList.add(students);
    }

    public void updateStudent(){
        System.out.println("Nhập mã sinh viên bạn muốn sửa: ");
        String code = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMsv().equals(code)) {
                studentList.set(i, inputInformation());
            }
        }
    }

    public void deleteStudent(){
        System.out.println("Nhập msv muốn xóa :");
        String code = scanner.nextLine();
        System.out.println("Có chắc muốn xóa không (có:y hoặc không:no): ");
        String choice = validateString(REGEX_STRING );
        if (choice.equals("y")){
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getMsv().equalsIgnoreCase(code)) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                    break;
                }
            }
        } else {
            System.out.println("Hủy bỏ xóa!");
        }


    }


    public void sortStudent(){
        int choose = 2 ;
        System.out.println("1 : Sắp xếp GPA theo thứ tự giảm dần.");
        System.out.println("2 : Thoát.");
        System.out.println("Chọn đi Bon.");
        do {
            if(choose < 2)
                System.out.println("Nhập lại đi bố. không biết đọc ák");
                choose = Integer.parseInt(scanner.nextLine());

        }while (choose > 2);
        switch (choose){
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                System.out.println("Xong rồi nhé .");
        }
    }

    public void sortUpAscending() {
        Student temp;
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(i).getGPA() > studentList.get(j).getGPA()) {
                    temp = studentList.get(i);
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, temp);
                }
            }
        }
        showStudent();

    }

    public String validateString(String regex) {
        while (true) {
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            }
            System.err.println("Sai định dạng, vui lòng nhập lại.");
        }
    }

    public int checkEge(){
        int check;
        while (true) {
            try {
                check = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("Sai định dạng! Vui lòng chọn lại");
            }
        }
        return check;
    }



}
