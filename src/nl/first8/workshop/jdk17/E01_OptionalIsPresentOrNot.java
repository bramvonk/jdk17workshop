package nl.first8.workshop.jdk17;

import java.util.Optional;

public class E01_OptionalIsPresentOrNot {
    private void checkOptional(Optional<String> anOptionalMessage) {
        // TODO can you do something to remove that stupid exclamation point (!) ? As you may not know it is not so that people cannot deal with negatives very well!
        if (!anOptionalMessage.isPresent()) {
            System.out.println("Oh no, the message is missing... Aborting!");
            return;
        }

        System.out.println("The message is: " + anOptionalMessage.get());
    }

    public static void main(String[] args) {
        E01_OptionalIsPresentOrNot instance = new E01_OptionalIsPresentOrNot();
        instance.checkOptional(Optional.of("Yeah!"));
        instance.checkOptional(Optional.empty());
    }

}
