import java.util.Scanner;

public class If_Statement {
    /*
    'if' -statements innehåller ett villkor, om detta villkor uppfylls kommer koden i if-blocket att köras.
    'if else' kontrollerar ett till villkor om inte det första i 'if' gäller.
    'else' är då ingen av ovanstående villkor kör. Då körs detta kodblock. 

    **/
    public static void main(String[] args) {
        if(true){
            System.out.println("Detta kommer alltid att skrivas ut");
        }


        String val = "Else!";

        if(val.equals("Not Here")){
            System.out.println("Detta visas inte");

        }
        else if(val.equals("Not here either")){
            System.out.println("Detta visas inte heller");
        }
        else{System.out.println("Detta visas dockx!");}





        /**
         * Nedan är lite av ett specialfall, det är egentligen inte ett if-statement. 
         * Om man har många utfall kan man använda en 'switch' istället. Det är exempelvis praktiskt
         * som ett enkelt menysystem. 
         */

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        choice = choice.toLowerCase();
        sc.close();

        java.net.URI URL = null;
        //Ignorera 'try' och 'catch' nedan, jag kan förklara detta om ni är intresserade. 
        
        try{
            switch (choice) {
            case "google":
                URL = new java.net.URI("https://www.google.com/");
                break;
            case "youtube":
                URL = new java.net.URI("https://www.youtube.com/");
                break;
            case "reddit":
                URL = new java.net.URI("https://www.reddit.com/");
                break;
            default:
                System.out.println("Ingen hemsida vald");
                break;
        }
        
        java.awt.Desktop.getDesktop().browse(URL);
    }catch(Exception e){}
        

    

        
    }
    
}
