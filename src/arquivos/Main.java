package arquivos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arquivos arquivos = new Arquivos();
        Scanner sc = new Scanner(System.in);
        String dirName = sc.nextLine();
        String fileName = sc.nextLine();

        arquivos.modoAcceso(dirName, fileName);
        arquivos.mLectura(dirName, fileName);
        arquivos.modoAcceso(dirName, fileName);

    }
}
