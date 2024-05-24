//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [][]numbers = {{5,4},{2,3,2}};
        int toplamSayi=0;
        for (int[]w:numbers){
            toplamSayi+=w.length;
        }
        System.out.println(toplamSayi);
        }
    }
