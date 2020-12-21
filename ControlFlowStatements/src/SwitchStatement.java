public class SwitchStatement {
      // if statement is a little more flexible
      public static void main(String[] args) {

          char charVale = 'H';
          switch(charVale){
              case 'A':
                  System.out.println("Found A");
                  break;

              case 'B':
                  System.out.println("Found B");
                  break;

              case 'C':
                  System.out.println("Found C");
                  break;

              case 'D':
                  System.out.println("Found D");
                  break;

              case 'E': case 'F':
                  System.out.println("Found E or F");
                  break;

                  default:
                  System.out.println("None were found");
          }
      }
}

