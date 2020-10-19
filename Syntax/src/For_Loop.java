import java.util.Arrays;
public class For_Loop{
    /* 
    For-loopen kommer att loopa ett bestämt antal gånger. Hur många gånger den ska loopa
    definieras i själva "loop-huvudet". I nedanstående fall börjar i på 0, och kommer att köra så
    länge som villkoret i<10 stämmer. Vid varje ny iteration av loopen kontrolleras villkoret. 
    När i=10 så stämmer inte villkoret längre, och loopoen slutar. 
    
    For "Enhanced For-loop" kommer loopen istället gå igenom alla objekt som finns i en klass 
    som är 'iterable'. Det är praktiskt om man är intresserad av alla värden i en array eller lista*. 

    *Vi diskuterar listor om vi får tid över. Annars kan ni läsa om listor på egen hand. 
    **/

    public static void main(String[] args) {
        //Vanlig for-loop - Går igenom array via index
        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        int int_list[] = new int[10];
        for(int i=0; i<10; i++){
            int_list[i]=i*2;
        }
        
        System.out.println(Arrays.toString(int_list));

        //Enhanced for-loop - Returnerar varje värde
        for(int value : int_list){
            System.out.println(value);
        }
    }
}
