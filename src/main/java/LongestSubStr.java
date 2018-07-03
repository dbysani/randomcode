import java.util.HashMap;
import java.util.Map;

public class LongestSubStr {

    private static String search(String str){
        String res="";
        int length=0;
        if(str!=null && str.length()==0){
            return null;
        }

        char[] text = str.toCharArray();
        int i=0; //start pointer
        Map<Character,Character> map;
        for(;i<str.length();i++){
            map = new HashMap();
            int count = 0;
            for(int j=i;j<str.length();j++) {
                if (map.containsKey(text[j])) ;
                else{
                    map.put(text[j],text[j]);
                    count++;
                }
                if(count==2){
                    //System.out.println(str.substring(i,j+1));
                    int llength = j-i+1;
                    if(llength>length) {
                        length=llength;
                        res = str.substring(i,j+1);
                    }
                }
                else if(count>2) break;
            }
        }
        return res;
    }


    public static void main(String[] args){
        LongestSubStr.search("abacd");
    }
}
