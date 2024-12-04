
import javax.swing.JOptionPane;


public class oppgave2 {


    public static void presentMenu() {

        while (true) {
        // Vis meny til brukeren
        String input = JOptionPane.showInputDialog(
                null,
                "Velkommen! Vennligst velg et alternativ:\n" +
                        "Motta dagens visdomsord\n" +
                        "Se dagens vær\n" +
                        "Avslutt programmet"

        );

        if (input == null) {
            // Hvis brukeren trykker "Avbryt" eller lukker dialogboksen
            JOptionPane.showMessageDialog(null, "Avslutter programmet. Ha en fin dag!");
            break;
        }

        int inputKonverting = Integer.parseInt(input);

//        switch (input) {
//            case "1":
//                displayWordOfWisdom();
//                break;
//            case "2":
//                displayWeather();
//                break;
//            case "3":
//                exitProgram();
//                return; // Avslutt løkken og programmet
//        }

            //kan brukes med if istedenfor switch

            if (input.equals("1")){
                displayWordOfWisdom();

            }
            else if (input.equals("2")){
                displayWeather();
            }
            if (input.equals("3")){
                exitProgram();
            }


    }
}

// Metodeplassholdere
public static void displayWordOfWisdom() {
    JOptionPane.showMessageDialog(null, "Dagens visdomsord: \"Hver dag er en ny sjanse til å lære noe nytt.");
}

public static void displayWeather() {
    JOptionPane.showMessageDialog(null, "Dagens vær: Sol med noen få skyer. 20°C.");
}

public static void exitProgram() {
    JOptionPane.showMessageDialog(null, "Avslutter programmet. Ha en flott dag!");
}

public static void main(String[] args) {
    presentMenu();
}
}
