public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String accountName) {

        int spaceCount = 0;
        for (int i = 0; i < accountName.length(); i++) {
            if (accountName.charAt(i) == ' ')
                spaceCount++;
        }
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if(accountName.isEmpty())
            return false;
        else if(accountName.length() < 3)
            return false;
        else if(accountName.length() > 19)
            return false;
        else if(spaceCount > 1)
            return false;
        else if(accountName.startsWith(" "))
            return false;
        else if(accountName.endsWith(" "))
            return false;
        else return true;
    }



}