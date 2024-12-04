public class oppgave1 {




    public static void investigateStringArray(String[]strings){

        int antall=0;
        int antallNull=0;
        for (int i = 0; i < strings.length; i++){



            if (strings[i] == null){
                antallNull++;
            }

            else {
                antall+=strings[i].length();

                if (strings[i].contains("a")){
                    System.out.println(strings[i]);
                }
            }


        }

        System.out.println(antall);

        System.out.println(antallNull);


 }





    public  static void main(String[] args) {

            String [] array = {"arman","nei","rask","fifa",null ,null ,"der"};

            investigateStringArray(array);
    }


}