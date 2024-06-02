package GuessGame;
public class Game {
    int computerguess;
    Player p1,p2,p3;

    Game(String n1,String n2,String n3){
        p1=new Player(n1);
        p2=new Player(n2);
        p3=new Player(n3);
    }
    boolean winner(){
        if(p1.guess==computerguess){
            System.out.println(p1.name+" wins");
            return true;
        } else if (p2.guess==computerguess) {
            System.out.println(p2.name+" wins");
            return true;
        } else if (p3.guess==computerguess) {
            System.out.println(p3.name+" wins");
            return true;
        }
        else{
            System.out.println(" koi nahi jeeta Bc");
        }
        return false;
    }
    void launch(){
        System.out.println("Lets Start the Game babe...");
        computerguess = (int)(Math.random()*9)+1;

        while(true){
            System.out.println("Computer Guessed: "+computerguess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();

            if(winner()){
                System.out.println("Bro Game has Over");
                break;
            }
            else{
                this.computerguess = (int)(Math.random()*9)+1;
            }
        }
    }
}