import java.util.ArrayList;
import java.util.Objects;
import java.util.SortedMap;

public class ProgReader {
    private ArrayList<Reader> readers = new ArrayList<>();

    public void addReader(Reader rd){
        readers.add(rd);
    }
    /*public Reader getReader(String name){
        for (int i = 0; i < readers.size(); i++){
            if (readers.get(i).getName()==name){
                return readers.get(i);
            }
            else {
                return null;
            }
        }
        return null;
    }*/
    public Reader getReader(String ...name) {
        if (name.length > 3) {
            System.out.println("Введены неверные данные.");
            return null;
        } else {
            if (name.length == 3) {
                for (int i = 0; i < readers.size(); i++) {
                    if (readers.get(i).getName() == name[0]) {
                        for (int j = 0; j < readers.size(); j++) {
                            if (readers.get(i).getSourName() == name[1]) {
                                for (int k = 0; k < readers.size(); k++) {
                                    if (readers.get(i).getMiddleName() == name[2]) {
                                        return readers.get(i);
                                    }
                                }
                                System.out.println("Нет такого пользователя.");
                                return null;
                            }
                        }
                        System.out.println("Нет такого пользователя.");
                        return null;
                    }
                }
                System.out.println("Нет такого пользователя.");
                return null;
            } else {
                if (name.length == 2) {
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).getName() == name[0]) {
                            for (int j = 0; j < readers.size(); j++) {
                                if (readers.get(i).getSourName() == name[1]) {
                                    return readers.get(i);
                                }
                            }
                            System.out.println("Нет такого пользователя.");
                            return null;
                        }
                    }
                    System.out.println("Нет такого пользователя.");
                    return null;
                } else {
                    for (int i = 0; i < readers.size(); i++){
                        if(readers.get(i).getName() == name[0]){
                            return readers.get(i);
                        }
                    }
                    System.out.println("Нет такого пользователя.");
                    return null;
                }
            }
        }
    }
    public Reader getReader(long phoneNumber){
        for (int i = 0; i < readers.size(); i++){
            if (readers.get(i).getPhoneNumber()==phoneNumber) {
                return readers.get(i);
            }
        }
        return null;
    }
    /*public ArrayList<Reader> getReader(String faculty){
        ArrayList<Reader> rd = new ArrayList<>();
        for (int i = 0; i < readers.size(); i++){
            if (readers.get(i).getFaculty() == faculty){
                rd.add(readers.get(i));
                //System.out.println(readers.get(i));
            }
        }
        return rd;
    }*/
}
