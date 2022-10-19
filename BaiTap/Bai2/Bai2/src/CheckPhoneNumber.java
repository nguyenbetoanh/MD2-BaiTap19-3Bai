import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    public static String CheckPhone() {
        Scanner sc = new Scanner(System.in);
        String numberPhone = "";
        while (true) {
            System.out.println("Nhập số điện thoại cần check");
            numberPhone = sc.nextLine();
            Pattern pattern = Pattern.compile("[84]-");
            Pattern pattern1 = Pattern.compile("[0-9]{10}");
            Pattern pattern2 = Pattern.compile("^.{13}$");
            if (pattern.matcher(numberPhone.trim()).find()) {
                if (pattern1.matcher(numberPhone.trim()).find()) {
                    if (pattern2.matcher(numberPhone.trim()).find()) {
                        break;
                    } else {
                        System.err.println("Nhập 2 số đầu và 10 số điện thoại tiếp theo ");
                    }
                } else {
                    System.err.println("Nhập lại");
                }
            }else {
                System.err.println("nhập mã vùng là 84");
            }

        }
        return numberPhone;
    }

    public static void main(String[] args) {
        String check = CheckPhone();
        System.out.println("số điện thoại là " + check);

    }
}
