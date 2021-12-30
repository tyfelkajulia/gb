import ru.gb.PhoneBook;
import ru.gb.PhoneItem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HomeWorkApp {

    public static void main(String[] args) {
        String[] words = { "hello", "world", "how", "are", "you", "good", "hello", "bat", "batman", "see", "you", "later", "tomorrow", "happy", "new", "year", "to", "you"};
        System.out.println(countUnique(words));

        PhoneItem Ivanov = new PhoneItem("Ivanov", 35452213);
        PhoneItem Petrov = new PhoneItem("Petrov", 12312123);
        Set<PhoneItem> phoneItems = new HashSet<>();
        phoneItems.add(Ivanov);
        phoneItems.add(Petrov);

        PhoneBook phoneBook = new PhoneBook(phoneItems);
        System.out.println(phoneBook.get("Ivanov"));

    }

    public static HashMap<String, Integer> countUnique(String[] words){
        HashMap<String, Integer> uniqueList = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(!uniqueList.containsKey(words[i])){
                uniqueList.put(words[i], 1);
            }else{
                uniqueList.put(words[i], uniqueList.get(words[i]) + 1);
            }
        }
        return uniqueList;
    }

}



