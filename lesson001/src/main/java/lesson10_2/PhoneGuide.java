package lesson10_2;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//для хранения телефонов использую две карты idName( ID | Name ) и PhoneIdName( Phone | ID ) связанные по ID

public class PhoneGuide {
    static int nameId;
    private Map<Integer, String> idName = new HashMap<>();
    private Map<String, Integer> phoneIdName = new HashMap<>();

    static {
        nameId = 0;
    }

    public void add(String name, String phone){
        idName.put(nameId, name);
        phoneIdName.put(phone,nameId);
        nameId++;
    }

    public void add(int id, String phone){
        if (idName.containsKey(id)){
            phoneIdName.put(phone, id);
        }
    }

    public void get(String name){
        ArrayList<Integer> nameIdList = new ArrayList<>();
        for (Integer id : idName.keySet()) {
            if (idName.get(id) == name){
                nameIdList.add(id);
            }
        }
        ArrayList<String>  listPhone = new ArrayList<>();
        for (Integer id : nameIdList) {
            initListPhone(listPhone, id);
        }
        System.out.print(name);
        System.out.println(listPhone);
    }

    public void printPhoneGuide(){
        System.out.println("ID | NAME[список телефонов]");
        System.out.println("---------------------------");
        idName.forEach((key, val) -> {
            ArrayList<String> listPhone = new ArrayList<>();
            initListPhone(listPhone, key);

            System.out.print(MessageFormat.format(" {0} | {1}", key, val));
            System.out.println(listPhone);
        });
   }

    private void initListPhone(ArrayList<String> listPhone, Integer key) {
        Integer val;
        for (String  id : phoneIdName.keySet()) {
            val = phoneIdName.get(id);
            if(val == key){
                listPhone.add(id);
            }
        }
    }

}
