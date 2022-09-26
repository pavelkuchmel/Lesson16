import java.util.ArrayList;

public class ProgReader {
    private ArrayList<Reader> readers = new ArrayList<>();

    public void addReader(Reader rd){
            readers.add(rd);
    }
    public void findReader(String ...name) {
        if (name.length > 3) {
            System.out.println("Введены неверные данные.");
        } else {
            if (name.length == 3) {
                for (int i = 0; i < readers.size(); i++) {
                    if (readers.get(i).getName() == name[0] || readers.get(i).getSourName() == name[0] || readers.get(i).getMiddleName() == name[0]) {
                        for (int j = 0; j < readers.size(); j++) {
                            if (readers.get(i).getSourName() == name[1] || readers.get(i).getName() == name[1] || readers.get(i).getMiddleName() == name[1]) {
                                for (int k = 0; k < readers.size(); k++) {
                                    if (readers.get(i).getSourName() == name[2] || readers.get(i).getName() == name[2] || readers.get(i).getMiddleName() == name[2]) {
                                        System.out.println(readers.get(i));
                                        return;
                                    }
                                }
                                System.out.println("Нет такого пользователя.");
                            }
                        }
                        System.out.println("Нет такого пользователя.");
                    }
                }
                System.out.println("Нет такого пользователя.");
            } else {
                if (name.length == 2) {
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).getSourName() == name[0] || readers.get(i).getName() == name[0] || readers.get(i).getMiddleName() == name[0]) {
                            for (int j = 0; j < readers.size(); j++) {
                                if (readers.get(i).getSourName() == name[1] || readers.get(i).getName() == name[1] || readers.get(i).getMiddleName() == name[1]) {
                                    System.out.println(readers.get(i));
                                    return;
                                }
                            }
                            System.out.println("Нет такого пользователя.");
                        }
                    }
                    System.out.println("Нет такого пользователя.");
                } else {
                    for (int i = 0; i < readers.size(); i++){
                        if(readers.get(i).getSourName() == name[0] || readers.get(i).getName() == name[0] || readers.get(i).getMiddleName() == name[0]){
                            System.out.println(readers.get(i));
                            //return;
                        }
                    }
                    System.out.println("Нет такого пользователя.");
                    findFaculty(name[0]);
                }
            }
        }
    }
    public void findReader(long phoneNumber){
        for (int i = 0; i < readers.size(); i++){
            if (readers.get(i).getPhoneNumber()==phoneNumber) {
                System.out.println(readers.get(i));
            }
        }
        System.out.println("Нет пользователя с таким номером телефона.");
    }
    public void findReader(int readerNumber){
        for (int i = 0; i < readers.size(); i++){
            if (readers.get(i).getReaderNumber()==readerNumber) {
                System.out.println(readers.get(i));
            }
        }
        System.out.println("Нет пользователя с таким номером.");
    }
    public void findFaculty(String faculty){
        ArrayList<Reader> rd = new ArrayList<>();
        for (int i = 0; i < readers.size(); i++){
            if (readers.get(i).getFaculty() == faculty){
                rd.add(readers.get(i));
                //System.out.println(readers.get(i));
            }
        }
        if (rd.isEmpty()) {
            System.out.println("Нет учеников такого факультета.");
        }
        else for (int i = 0; i < readers.size(); i++){
            System.out.println(rd.get(i));
        }
    }
}