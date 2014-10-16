import java.util.*;
public class PlayerHum extends Player {
    
    public int guess()
    {
        Scanner klawiatura = new Scanner(System.in);
        int a = klawiatura.nextInt();
        return a;
    }
    
}
