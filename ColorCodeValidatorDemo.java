package assignment;
class ColorCodevalidator{
    String str;
   int validateHex(String str){
        if(str.matches("^#[A-Fa-f0-9]{6}$")) {
            return 1;
        }
       return -1;
        }
    int validateDecimalCode(String str) {
        if (!str.startsWith("rgb(") || !str.endsWith(")")) {
            return -1;
        }

        String content = str.substring(4, str.length() - 1);
        String[] values = content.split(",");

        if (values.length != 3) {
            return -1;
        }

        for (String value : values) {
            try {
                int num = Integer.parseInt(value.trim());
                if (num < 0 || num > 255) {
                    return -1;
                }
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        return 1;
    }
    }



public class ColorCodeValidatorDemo {
    public static void main(String[] args) {
    ColorCodevalidator cv=new ColorCodevalidator();
        System.out.println(cv.validateDecimalCode("rgb(255,255,255)") == 1 ? "Valid" : "Invalid");
        System.out.println(cv.validateDecimalCode("rgb(252,0,0)") == 1 ? "Valid" : "Invalid");
        System.out.println( cv.validateHex("#123455")==1?"valid":"invalid");
    }
}
