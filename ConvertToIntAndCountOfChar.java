package assignment;

import static java.lang.Integer.parseInt;

class StringPlay{
    int convert;
    int max;
}
class  StringMethods{
    String str;
   int convertToInt(StringPlay sp,String str){
       int result=parseInt(str);
      return sp.convert=result;


    }
    int getMax(StringPlay sp,String str,char ch){
       int counter=0;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)==ch){
               counter++;
           }

       }
       return sp.max=counter;
    }

}
public class ConvertToIntAndCountOfChar {
    public static void main(String[] args) {

        StringPlay sp=new StringPlay();
        StringMethods sm=new StringMethods();
        System.out.println(sm.convertToInt(sp,"123"));
        System.out.println(sm.getMax(sp,"helloooo", 'e'));




    }
}
