public class JoinWordsForPalindrome {

    public static String[] find (String[] words){

        for(int i = 0; i<words.length; i++){
            for(int j=i+1; j<words.length;j++){
                String word1 = words[i];
                String word2 = words[j];
                if(checkPalindrome(word1,word2))
                    return new String[] {word1,word2};
            }
        }
        return new String[]{};
    }

    private static boolean checkPalindrome(String word1,String word2){
        String word = word1+word2;
        char[] chars = word.toCharArray();

        int length = chars.length;
        int i;
        int j;
        if(length%2==0){
            int mid = length/2;
            i = mid-1;
            j = mid;
        }
        else{
            int mid = length/2;
            i = mid;
            j = mid;
        }

        while(i!=0 && j!=length-1){
            if(chars[i]!=chars[j]) return false;
            i--;j++;
        }
        return true;
    }

    public static void main(String[] args){
        //String[] inp = {"bat","tab","cad"};
        //String[] inp = {"ant","cat","dog"};
        String[] inp = {"ab","deedba"};
        String[] out = JoinWordsForPalindrome.find(inp);
        for(int i =0;i<out.length;i++){
            System.out.println(out[i]);
        }
    }
}
