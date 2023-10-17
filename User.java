
public class User {
	public String username;
    private String password;
    private int coins;

    private Stack stack;
    private Deck deck;

    public User(){
        this.username = "user";
        this.password = "";
        this.coins = 0;

        this.stack = new Stack();
        this.deck = new Deck();
    }

    public User(String username, int coins){
        this.username = username;
        this.coins = coins;
        this.password = "";

        this.stack = new Stack();
        this.deck = new Deck();
    }

    public void setPassword(String password){
        //password = hashpassword(password)
    }

    public Package buyPackage(){
        this.coins = this.coins - 5;
        Package pack = new Package();

        this.stack.add(pack);
        return pack;
    }
    
    public void chooseDeck(Deck deck) {
    	this.deck = deck;
    }
    
    
}
