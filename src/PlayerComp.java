import java.util.Random;

public class PlayerComp extends Player{
    
    public int guess()
    {
        Random wybor = new Random(); 
        return (wybor.nextInt(6)+1);
    }
}
