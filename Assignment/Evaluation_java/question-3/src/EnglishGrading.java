import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class EnglishGrading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student's Article: ");
        String article=sc.nextLine();
        getFeedback(article);
    }

    private static void getFeedback(String article) {
        Pattern p=Pattern.compile("[a-zA-Z,;:.?! ]*");
        if (!p.matcher(article).matches()){
            System.out.println("Wrong use of Punctuations");
            System.exit(0);
        }
        String[] words=article.split("\\W");
        Map<String,Integer> newwords=new TreeMap<>();
        int count=0;
        for (int i=0;i< words.length;i++){
            if(words[i].equals("")){
                continue;
            }
            count++;
            String word=words[i].toLowerCase();
            if(newwords.containsKey(word)){
                newwords.put(word,newwords.get(word)+1);
            }
            else {
                newwords.put(word,1);
            }
        }
        System.out.println("Number of words"+count+" Number of unique words"+ newwords.size());
        System.out.println("The word are: ");
        int x=1;
        for (String key:newwords.keySet()){
            System.out.print(x+"."+key+" ");
            x++;
        }
    }
}
//    hello Hello HEllo hi hi: hi! Welcome, welcome”
//