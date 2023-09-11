public class Usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);


        smartTv.ligar();
        System.out.println("TV Ligada?" + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual volume atual ?" + smartTv.volume);

        smartTv.mudarCanal(103);
        
        System.out.println("Canal atual:" + smartTv.canal);
}}

