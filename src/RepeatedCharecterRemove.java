import java.lang.reflect.Array;import java.util.ArrayList;import java.util.LinkedHashSet;public class RepeatedCharecterRemove {    public static void main(String[] args) {        String str = "Javava";        LinkedHashSet<String> list = new LinkedHashSet<>();        for (int i =0 ;i< str.length();i++) {            list.add(String.valueOf(str.charAt(i)));        }        for (String s : list){            System.out.print(s);        }    }}