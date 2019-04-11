
package Clases;
import java.util.Random;

public class Class1 {
    int ganador;
    Random Alt = new Random();
    int N;
    
    public int Competir()
    {
        N = Alt.nextInt(4);
        if (N==0){
           ganador = N+1;
        }else if(N == 1){
            ganador = N+1;
        }else if (N == 2){
            ganador = N+1;
        }else if (N == 3){
            ganador = N+1;
        }
        return ganador;
    }
    
}
