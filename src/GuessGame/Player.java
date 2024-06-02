package GuessGame;

public class Player {
    String name;
    int guess;

    Player(String name){
        this.name=name;
    }
    void makeGuess(){
        this.guess=(int)(Math.random()*9+1);
        System.out.println(this.name+" Have Guessed is "+guess);
    }

}
