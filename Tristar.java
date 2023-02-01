import java.util.Scanner;

class Tristar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("How many lines: ");
    int lines = input.nextInt();

    if(lines > 1) {
      System.out.print("Enter the star: ");
      String type = input.next();
  
      for(int i = 1; i <= lines; i++) {
        System.out.println(type.repeat(i));
      }
    

      do{
        System.out.print("How many lines: ");
        lines = input.nextInt();
        if(lines < 1) {
          System.out.println("done!");
          break;
        }

        System.out.print("Enter the star: ");
        type = input.next();

        for(int i = 1; i <= lines; i++) {
          System.out.println(type.repeat(i));
        }
      } while(lines > 1);




    } else {
      System.out.println("done!");
    }

    

  }
}