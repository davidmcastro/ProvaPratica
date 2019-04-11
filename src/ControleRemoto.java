public class ControleRemoto {
    int canal = 0;
    int volume = 0;

public void aumentarVolume() {
    volume = volume + 2;
    System.out.println("Aumentando volume para " + volume);
}

public void diminuirVolume() {
    volume = volume - 2;
    System.out.println("Diminuindo volume para " + volume);
}

public void trocarCanal() {
    canal = canal + 1;
    System.out.println("Alterando para o canal " + canal);
}
public void consultarVolumeSom() {
    System.out.println("O volume está em " + volume);
}
}
public static void main(String[] args){
    ControleRemoto TV = new ControleRemoto();
    TV.volume = 10;
    TV.trocarCanal();
    TV.aumentarVolume();
    TV.diminuirVolume();
    TV.consultarVolumeSom();
}
