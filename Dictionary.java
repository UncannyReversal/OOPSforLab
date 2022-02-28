package dictionary;
import java.util.*;
class dictionary1{
    String words[] = {"azure","bashful","caliber","Deft","Emolument"};
    String meaning[] = {"a light,purplish blue","shy","ability","Quick and skilful","Salary or fee"};
    void findMeaning(String word){
        int chk=0;
        for(int i=0;i<words.length;i++){
            if(words[i].equalsIgnoreCase(word)){
                System.out.println("Meaning: "+meaning[i]);
                chk=1;
            }
        }
        if(chk==0)
            System.out.println("Word not found");
    }
}
public class Dictionary 
{
    public static void main(String args[])
    {
        dictionary1 obj = new dictionary1();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("azure\nbashful\ncaliber\nDeft\nEmolument");
        System.out.print("\nEnter the word: ");
        String word = obj1.nextLine();
        obj.findMeaning(word);   
    }
}