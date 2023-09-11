public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

// ----------------------- VOLUME -----------------------
    public void aumentarVolume(){
        //volume + 1
        volume++;
    }
    public void diminuirVolume(){
        //volume--
        volume--;
    }
// ----------------------- CANAL -----------------------
    public void aumentarCanal(){
       // canal + 1
        canal++;
    }

    public void diminuirCanal(){
        //canal - 1
        canal--;
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
// -----------------------LIGAR / DESLIGAR -----------------------
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}