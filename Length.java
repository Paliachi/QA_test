package QA_test;

// 3d algorithm
public class Length {
    public static void main(String[] args) {
        String sentence = "Daigala khe rkhevit!";

        int sentenceLength = sentence.length();

        if (sentenceLength % 2 == 0) {
            System.out.println("სტრიქონის სიგრძე ლუწია");
        } else {
            System.out.println("სტრიქონის სიგრძე კენტია");
        }
    }
}
