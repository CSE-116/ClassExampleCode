package week2;

public class PlusMinus {
    public static String letter(int score){
        int tens=score/10;
        if (tens>=9){
            return "A";
        } else if(tens>=8){
            return "B";
        } else if(tens>=7){
            return "C";
        } else if(tens>=6){
            return "D";
        } else {
            return "F";
        }
    }
    public static String plusMinus(int score){
        int ones=score%10;
        if (ones>=7){
            return "+";
        } else if (ones>2){
            return "";
        } else {
            return "-";
        }
    }

    public static void main(String[] args) {
        System.out.println(letter(95));
        System.out.println(letter(78));
        System.out.println(letter(51));
    }
}
