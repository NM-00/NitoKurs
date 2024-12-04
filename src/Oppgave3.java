public class Oppgave3 {

    public static char [] reversedArray (char [] array ){


        char[] reversed = new char[array.length];

        //lager to variabler i og j. i starter baklengst i arrayet. "array.length - 1" Betyr siste elemente
        //i arrayet og den skal kjøre baklengst til den kommer til første elemente
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            //nye arrayet får satt inn verdiene til den opprinlige arrayet

            reversed[j] = array[i];
        }

        return reversed;

        //Systemout ville fungere her men kanskje så får dere ikke full uttelling (kommer an på sensur)

        //        for (int i = array.length - 1; i >= 0; i--) {
        //            System.out.print(array[i] + " ");
        //         }
        //
        //        return array;


    }


    public static void main(String[] args) {

        char [] array = {'a','b','c','d','f'};

        reversedArray(array);



    }

}

