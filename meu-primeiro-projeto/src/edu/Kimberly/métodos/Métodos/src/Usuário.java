public class Usuário {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(48);

        System.out.println("Novo status TV Ligada? " + smartTv.ligada);
        System.out.println("Novo status Canal Atual: " + smartTv.canal);
        System.out.println("Novo status Volume Atual: " + smartTv.volume);

    }
}
