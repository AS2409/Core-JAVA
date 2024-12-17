public class RandomNumberGuess {
    int randomNumber;

    public boolean game(int guess) {

        while (true) {

            randomNumber = (int) Math.round(Math.random());
            if (guess == randomNumber) {

                System.out.println("Number was " + randomNumber);
                return true;
            } else {

                System.out.println("Number was " + randomNumber);
                return false;
            }
        }
    }
}
