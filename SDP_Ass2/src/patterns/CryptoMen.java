package patterns;

import java.util.List;

public class CryptoMen implements Observer {
    private String name;
    private String surname;
    private int age;

    public CryptoMen(String name , String surname , int age) {
        setName ( name );
        setSurname ( surname );
        setAge ( age );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void handle(List<String> cryptoMoney , List<Integer> amount) {
        if (getAge () >= 18) {
            System.out.print( getName () + " " + getSurname () + " bought ");
            for (int i = 0; i < cryptoMoney.size (); i++) {
                System.out.printf ( "%d of %s\n" , amount.get ( i ) , cryptoMoney.get ( i ) );
            }
            System.out.println ("================================================================\n");
        } else {
            System.err.println ("Sorry, " + getName () + " " + getSurname () + ", you cannot buy crypto money because you must be older than 18!");
        }
    }
}
