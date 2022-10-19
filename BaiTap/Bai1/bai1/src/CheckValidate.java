import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidate {
    public static String check() {
        Scanner sc = new Scanner(System.in);
        String className="";
        while (true){
            System.out.println("Nhập tên lớp ");
            className=sc.nextLine();
            Pattern pFirst=Pattern.compile("[ACP]");
            Pattern pNoSpecial=Pattern.compile("^[a-zA-Z0-9]*$");
            Pattern p4=Pattern.compile("[0-9]{4}");
            Pattern pLast=Pattern.compile("[GHIKLM]");
            Pattern pLength =Pattern.compile("^.{6}$");


            if (pFirst.matcher(className).find()){
                if (pNoSpecial.matcher(className).find()){
                    if (p4.matcher(className).find()){
                        if (pLast.matcher(className).find()){
                            if (pLength.matcher(className).find()){
                                break;
                            }else {
                                System.err.println("vui long nhập 6 kí tự thôi");
                            }

                        }else {
                            System.err.println("Vui lòng nhập kí tự cuối là G,H,I,K,L,M");
                        }

                    }else {
                        System.err.println("vui lòng nhập 4 chữ số nguyên liên tiếp sau kí tự đầu tiên");
                    }

                }else {
                    System.err.println("tên lớp ko chứa kí tự đặc biệt");
                }
            }else {
                System.err.println("tên lớp bắt đầu bằng chữ C , A hoặc P");
            }
        }
        return className;
    }

    public static void main(String[] args) {
        String pass=check();
        System.out.println("tên lớp là "+pass);
    }
}
