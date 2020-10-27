import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(3);
        Person person = new Person("Simon", "Password");
        System.out.println(person.viewName());
    }
}

class Person{
    private String name;
    private double money;
    private String password;

    Person(String name, double money, String password){
        this.name = name;
        this.money = money;
        this.password = password;
    }

    Person(String name, String password){
        this.name = name;
        this.money = 0;
        this.password = password;
    }

    public void changePassword(String newpassword){
        this.password = newpassword;
    }

    public String viewPassword(){
        return this.password;
    }

    public String viewName(){
        return this.name;
    }

    public double viewMoney(){
        return this.money;
    }
}

class Bank{
    int nrOfPeople;
    Person[] people;

    Bank(){
        nrOfPeople = 0;
        people = new Person[10];
    }

    Bank(int arraySize){
        nrOfPeople = 0;
        people = new Person[arraySize];
    }

    public void addPerson(){
        String password;
        String second;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String name = sc.nextLine();

        int l = 1;
        do{
            if(l!=1){
                System.out.println("De var inte samma. Välj igen!");
            }
            System.out.println("Välj ett lösenord!");
            password = sc.nextLine();
            System.out.println("Bekräfta lösenord!");
            second = sc.nextLine();
            l++;
        }while(!password.equals(second));

        people[nrOfPeople] = new Person(name, password);

        System.out.println("Kontot har skapats");
        nrOfPeople++;
    }

    public void viewPeople(){
        for(int i=0;i<people.length; i++){
            System.out.println(people[i].viewName());
        }
    }

    public void addMoney(String name, String password, double money){
        Scanner sc = new Scanner(System.in);
        for(Person p : people){
            if(p.viewName().equals(name)){
                if(p.viewPassword().equals(password)){

                }
            }
        }

    }
}