import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] student = {"a", "b", "c", "d", "e", "f"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien ban muon tim");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)){
                System.out.println("Vi tri cua sinh vien " + input_name + " trong mang student la a " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong tim thay vi tri cua sinh vien " + input_name + " trong mang student");
        }
    }
}
