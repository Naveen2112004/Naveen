public class viratkohli {
    public static void main(String[] args) {
        String[] virat = {
            "V     V   IIIII RRRR   AAAAA TTTTT",
            "V     V     I   R   R  A   A   T  ",
            "V     V     I   RRRR   AAAAA   T  ",
            " V   V      I   R R    A   A   T  ",
            "  VVV     IIIII R  RR  A   A   T  "
        };

        String[] kohli = {
            "K   K   OOO   H   H  L      I ",
            "K  K   O   O  H   H  L      I ",
            "KKK    O   O  HHHHH  L      I ",
            "K  K   O   O  H   H  L      I ",
            "K   K   OOO   H   H  LLLLL III"
        };

        System.out.println("VIRAT:");
        for (String line : virat) {
            System.out.println(line);
        }

        System.out.println("\nKOHLI:");
        for (String line : kohli) {
            System.out.println(line);
        }
    }
}
