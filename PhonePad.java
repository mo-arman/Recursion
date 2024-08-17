import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        phonepad("", "12");
        System.out.println(phonepadRet("", "12"));
    }
    static void phonepad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) -'0';//this will convert '2' into 2
        
        for(int i=(digit-1) *3; i<digit*3; i++){
            char ch = (char) ('a' +i);
            phonepad(p+ch, up.substring(1));
        }
    }
    static ArrayList<String> phonepadRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) -'0';//this will convert '2' into 2
        ArrayList<String> list =new ArrayList<>();
        for(int i=(digit-1) *3; i<digit*3; i++){
            char ch = (char) ('a' +i);
            list.addAll(phonepadRet(p+ch, up.substring(1)));
        }
        return list;
    }
}
