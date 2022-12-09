import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MenuStudent {
    Scanner scanner = new Scanner(System.in);
    ManagerStudent managerStudent = new ManagerStudent();

    public void menu(){
        while (true){
            String menu = " " ;
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
            System.out.println("1. Hiện danh sách sinh viên.");
            System.out.println("2. Thêm sinh viên mới.");
            System.out.println("3. Cập nhật danh sách.");
            System.out.println("4. Xóa trong danh sách.");
            System.out.println("5. Sắp xếp trong danh sách.");
            System.out.println("6. Đọc file.");
            System.out.println("7. Ghi file.");
            System.out.println("8.Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    managerStudent.showStudent();
                    break;
                case 2 :
                    managerStudent.addStudent();
                    break;
                case 3 :
                    managerStudent.updateStudent();
                    break;
                case 4 :
                    managerStudent.deleteStudent();
                    break;
                case 5 :
                    managerStudent.sortStudent();
                    break;
                case 6 :
                    break;
                case 7 :
                    break;
                case 8 :
                  System.exit(0);
                default:
            }

        }
    }
}
