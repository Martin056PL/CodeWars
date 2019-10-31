import java.util.ArrayList;
import java.util.List;

/*      Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.
        Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:

        [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
        7      6      5      4      3            2      1

        If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
        Note: there will always be exactly one wolf in the array.
        Examples

        warnTheSheep(["sheep", "sheep", "sheep", "wolf", "sheep"]) === "Oi! Sheep number 1! You are about to be eaten by a wolf!"
        warnTheSheep(["sheep", "sheep", "wolf"]) === "Pls go away and stop eating my sheep"*/

public class kyu8_AWolfInSheepsClothing {

    public static void main(String[] args) {
        String[] array = {"sheep", "sheep", "wolf", "sheep", "wolf"};
        warnTheSheep(array);
    }

    private static String warnTheSheep(String[] array) {

        List<String> list = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
            list.add(array[i]);
        }

        if (list.indexOf("wolf") != 0)
            return "Oi! Sheep number " + list.indexOf("wolf") + "! You are about to be eaten by a wolf!";
        else
            return "Pls go away and stop eating my sheep";
    }

}
