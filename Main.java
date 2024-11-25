public class Main {
    public static void main(String[] args) {
        // 1st algorithm
        int[] numbers = {1, 3, 7, 8, 10, 12, 14};
        int evenNumbersCounter = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbersCounter++;
            }
        }

        if (evenNumbersCounter == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("ამ მასივში არის " + evenNumbersCounter + " ლუწი რიცხვი");
        }

        // 2nd algorithm
        While whileInstance = new While("fnvkfnfkjznjnkzznzzkjnkjZZdfefFFFGSR");

        // 4th algorithm
        checkNumber(0);

        // 5th algorithm
        isInGap(22, 10, 13);
    }


    static class While {
        private String input;

        public While(String input) {
            this.input = input;
        }

        public void processString() {
            int index = 2;

            while (index < input.length()) {
                char currentLetter = input.charAt(index);
                System.out.println(currentLetter);

                if (currentLetter == 'z') {
                    break;
                }

                index += 3;
            }
        }
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("დადებითი");
        } else if (number < 0) {
            System.out.println("უარყოფითი");
        } else {
            System.out.println("ნოლი");
        }
    }

    public static void isInGap(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


