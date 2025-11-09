// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int cheersRange = Integer.parseInt(args[1]);
                String anLetters = "AEFHILMNORSX";
                String aOrAn = "";
                String upperName = "";

                for (int i = 0; i < name.length(); i++) {
                        char upperLetter = name.charAt(i);

                        if (upperLetter > 96 && upperLetter < 123) {
                                upperLetter = (char) (upperLetter - 32);
                        }

                        upperName += upperLetter;

                        if (anLetters.indexOf(upperLetter) != -1) {
                                aOrAn = "an";
                        } else {
                                aOrAn = "a ";
                        }

                        System.out.println("Give me " + aOrAn + " " + upperLetter + ": " + upperLetter + "!");
                }
                System.out.println("What does that spell?");

                for (int i = 0; i < cheersRange; i++) {
                        System.out.println(upperName + "!!!");
                }
        }
}
