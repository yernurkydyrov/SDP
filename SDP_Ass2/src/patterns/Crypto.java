package patterns;

import java.util.ArrayList;
import java.util.List;

public class Crypto implements Observed {
    private List<String> cryptoMoney;
    private List<Integer> amount;
    private final List<Observer> cryptoMen;

    public Crypto() {
        cryptoMoney = new ArrayList<> ();
        amount = new ArrayList<> ();
        cryptoMen = new ArrayList<> ();
    }

    public void addNewCrypto(String cryptoMoney , Integer amount) {
        this.cryptoMoney.add ( cryptoMoney );
        this.amount.add ( amount );
        notifyObserver ();
    }

    public void removeNewCrypto(String cryptoMoney , Integer amount) {
        this.cryptoMoney.remove ( cryptoMoney );
        this.amount.remove ( amount );
        notifyObserver ();
    }


    public void addObserver(Observer observer) {
        this.cryptoMen.add ( observer );
    }

    public void removeObserver(Observer observer) {
        int i = cryptoMen.indexOf ( observer );
        if (i >= 0) {
            this.cryptoMen.remove ( observer );
        }
    }

    public void notifyObserver() {
        for (Observer observer :
                cryptoMen) {
            observer.handle ( this.cryptoMoney , this.amount );
        }
    }

    public List<String> getCryptoMoney() {
        return cryptoMoney;
    }

    public void setCryptoMoney(List<String> cryptoMoney) {
        this.cryptoMoney = cryptoMoney;
        notifyObserver ();
    }

    public List<Integer> getAmount() {
        return amount;
    }

    public void setAmount(List<Integer> amount) {
/*//        if (amount != null) {
 //           return;
   //     }
     //   for (int i = 0; i < cryptoMoney.size (); ++i) {
       //     assert false;
        //    if (amount.get ( i ) != null) {
          //      this.amount = Collections.singletonList ( this.amount.get ( i ) + amount.get ( i ) );
          //  } else {
           //     this.amount = amount;
           // }
       // }*/
        this.amount = amount;
        notifyObserver ();
    }
}