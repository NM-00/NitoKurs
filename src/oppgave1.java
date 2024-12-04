public class oppgave1 {

public static void investigateStringArray(String[] strings){

            //oppgave 1 del 3
            //starter med antall verdier som er "null" starter med 0
            int antallNullVerdier =0;

            //oppgave 1 del 2
            //stater med antallBokstaver skal være 0
            int antallBokstaver=0;



            for (int i=0; i<strings.length; i++){

                //oppgave 1 del 3
                if (strings[i] == null){

                    //antall null verdier økes med 1
                    antallNullVerdier++;
                }
                else {
                    //antallBokstaver+=strings[i].length(); samme som under opp til dere hva dere vil bruke


                    //oppgave 1 del 2
                    //strings[i].length() er innebygd funksjon i java som begrener antall bokstaver en streng har
                    antallBokstaver =antallBokstaver + strings[i].length();


                    //oppgave 1 del 1
                    if (strings[i].contains("a")){
                        System.out.println(strings[i]); //alt som inneholder bokstaven "a"
                    }

                }

            }

            System.out.println(antallNullVerdier); // null veridene, blir printa
            System.out.println(antallBokstaver); // antall bokstaver i arrayet blir printe her
        }




    public static void main(String[] args) {
        // "0" er ikke "null"
        //test array med null verdier, verdier som inneholder bokstaven "a" og verider som ikke inneholder
        //bokstaven "a"

        String [] array = {"Banan",null , "Ris", "Stol", "Test", null, "Java", "Eksamen"};

        //kaller på metoden:
        Main.investigateStringArray(array);


        }


}
