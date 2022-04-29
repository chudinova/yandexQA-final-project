public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        int spaceCount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                spaceCount++;
        }
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if(name.isEmpty())
            return false;
        else if(name.length() < 3)
            return false;
        else if(name.length() > 19)
            return false;
        else if(spaceCount != 1)
            return false;
        else if(name.startsWith(" "))
            return false;
        else if(name.endsWith(" "))
            return false;
        else return true;
    }



}