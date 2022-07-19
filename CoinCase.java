public class CoinCase {
  import java.util.Scanner;
  int hund = 0, fhund = 0, fty = 0, ten = 0, five = 0, one = 0;
  public void AddCoins() {
    Scanner keyboardInput = new Scanner(System.input);
    System.out.println("동전 종류: ");
    String cointype = keyboardInput.nextInt();
    keyboardInput.nextLine();
    System.out.println("동전 수량: ");
    int coinnum = keyboardInput.nextInt();
    keyboardInput.nextLine();

     if (cointype == 100){
      hund++;
     }
     if (cointype == 500){
      fhund++;
     }
     if (cointype == 50){
      fty++;
     }
     if (cointype == 10){
      ten++;
     }
     if (cointype == 5){
      five++;
     }
     if (cointype == 1){
      one++;
     }
  }

  public void GetCount(int coin){
    if (cointype == 100){
      System.out.println(hund);
     }
     if (cointype == 500){
      System.out.println(fhund);
     }
     if (cointype == 50){
      System.out.println(fty);
     }
     if (cointype == 10){
      System.out.println(ten);
     }
     if (cointype == 5){
      System.out.println(five);
     }
     if (cointype == 1){
      System.out.println(one);
     }
  }
}
