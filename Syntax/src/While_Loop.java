import java.util.Scanner;

public class While_Loop {
    /*
    Till skillnad från en for-loop, där loopen kör ett bestämt antal gånger kommer while-loopen köra 
    till det att ett viss villkor har uppfyllts. I det första exemplet nedan används while-loopen precis
    som for-loopen i förra exemplet. 
    **/

    public static void main(String[] args) {

        //En while-loop använd som en for-loop
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while(choice != 0){

            System.out.println("Choose an integer (Choose 0 to exit): ");
            choice = sc.nextInt();

            if(choice != 0){
                System.out.println("Your choice is" + choice);
            }
            else{
                System.out.println("Exiting");
            }
            sc.close();
        }

        
        /* 
        "Do-while" fungerar som while-loopen förutom att villkoret kontrolleras EFTER vaje iteration. 
        Denna loop kommer alltså alltid att köra minst en gång.
        **/
        do{
            System.out.println("Hej");
        }while(false);

    }
    
}
