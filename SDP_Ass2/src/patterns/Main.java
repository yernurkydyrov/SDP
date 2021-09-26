package patterns;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Crypto crypto = new Crypto ();
        crypto.addNewCrypto ( "BIT",100000 );
        CryptoMen men = new CryptoMen ( "John", "Smith", 32 );
        crypto.addObserver ( men );
        crypto.addNewCrypto ( "USD", 20000 );
        CryptoMen Arman = new CryptoMen ( "Arman", "Wallow", 14 );
        crypto.addObserver ( Arman );
        crypto.addNewCrypto ( "DOGE", 20010 );

    }
}
