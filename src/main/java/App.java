import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
//        String regex = "(0|\\+84)\\d{2}[\\.\\-\\s]?\\d{3}[\\.\\-\\s]?\\d{4}";
//        String input = "0918155775, +84981644665, 090.876.7654";
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(input);
//        boolean matchFound = m.find();
//        while (matchFound){
//            String phone = input.substring(m.start(), m.end());
//            System.out.println(phone);
//            matchFound=m.find();
//        }

        //Tìm tất cả các chuỗi ngày tháng có định dạng dd-mm-yyyy hoặc dd/mm/yyyy trong chuỗi văn bản text1

        String regex1 = "(0[1-9]|[12]\\d|3[01])[-|\\/](0[1-9]|1[012])[-|\\/](\\d{4})"  ;
        System.out.println(regex1);

        String input = "24/12/2014, 24-12-2014";
        System.out.println("input" + input);

        Pattern p = Pattern.compile(regex1);
        System.out.println("p" + p);
        Matcher m = p.matcher(input);
        System.out.println( "Matcher: " + m);

        boolean matchF = m.find();
        System.out.println( matchF);

        while (matchF){
            String date = input.substring(m.start(), m.end());
            System.out.println(date);
            matchF = m.find();
        }

//Câu 2
//        Tìm tất cả các địa chỉ email có trong chuỗi văn bản đầu vào text
//        Định nghĩa email:
//        Bắt đầu bằng chữ cái.
//                Chỉ chứa chữ cái, chữ số, dấu gạch ngang -
//                Chứa một ký tự @, sau @ là tên miền.
//                Tên miền có thể là domain.xxx.yyy hoặc domain.xxx. Trong đó xxx và yyy là các chữ cái và có độ dài từ 2 trở lên.

        String regex2 = "[a-z][\\w]{0,}@{1}[a-z]+[[.]{0,1}[a-z]{2,}+.{0,1}[a-z]{2,}$|[[.]{1}[a-z]{2,}]]";
        String input1 = "duy@hgdfgfd.com.hj gfdgfd@ygf.com a_ggfg_j@gjjjjjjhj.mb";
        System.out.println("Input1: " + input1);
        Pattern p1 = Pattern.compile(regex2);
        System.out.println("Pattern p1: " + p1);
        Matcher m1 = p1.matcher(input1);
        System.out.println("m1:" + m1);
        boolean isFind1 = m1.find();
        System.out.println(isFind1);
        while (isFind1) {
            String sub1 = input1.substring(m1.start(), m1.end());
            System.out.println(sub1);
            isFind1 = m1.find();
        }

    }
}
