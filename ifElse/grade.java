import java.util.*;

public class grade
{
  public static void main (String[]args)
  {
    Scanner sc=new Scanner(System.in);

      System.out.println ("No. of Physics");
    int ph = sc.nextInt ();
      System.out.println ("No. of Chemistry");
    int ch = sc.nextInt ();
      System.out.println ("No. of Biology");
    int bi = sc.nextInt ();
      System.out.println ("No. of Mathematics");
    int mt = sc.nextInt ();
      System.out.println ("No. of Computer");
    int cm = sc.nextInt ();

    int sum = ph + ch + bi + mt + cm;
    int per = sum / 5;
    if (per >= 90)
      {
	 System.out.println ("Grade A");
      }
    else if (per >= 80)
      {
	System.out.println ("Grade B");
      }else if (per >=70)
      {
	System.out.println ("Grade C");
      }else if (per >=60)
      {
	System.out.println ("Grade D");
      }else if (per >=40)
      {
	System.out.println ("Grade E");
      }else if (per <40)
      {
	System.out.println ("Grade F");
      }
  }
}
