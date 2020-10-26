public class Bank {
    
}

class Person{
    String name;
    float money;
    cardType type;

    Person(String name, float money, cardType type){
        this.name = name;
        this.money = money;
        this.type = type;

    }


}

enum cardType{Credit, Debit}