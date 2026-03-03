import java.util.Scanner;

public class Problem10 {
   public Problem10() {
   }
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      float var2 = var1.nextFloat();
      float var3 = 0.39370078F;
      float var4 = var3 * var2;
      float var5 = var4 / 12.0F;
      int var6 = (int)var5;
      float var7 = var4 % 12.0F;
      int var8 = (int)var7;
      System.out.println("Your Height in cm is " + var2 + " while in feet is " + var6 + " and inches is " + var8);
      var1.close();
   }
}