package assignment;
class Encryption{
    String message;
    String decodeMessage(String message){
       String Strresult=message.replaceAll("[AEIOUaeiou]","");
       return  Strresult;

    }
}
public class EncryptionDecryptionDemo {
    public static void main(String[] args) {
        Encryption e=new Encryption();
        System.out.println(e.decodeMessage("helloraja"));
    }

}
