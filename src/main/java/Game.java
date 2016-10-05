import java.util.ArrayList;

public class Game {
    public String converter(int numberToConvert) {
        boolean isMultipleOfThree = numberToConvert % 3 == 0;
        boolean isMultipleOfFive = numberToConvert % 5 == 0;

        if (isMultipleOfThree && isMultipleOfFive) return "TreeNiquet";
        if (isMultipleOfThree) return "Tree";
        if (isMultipleOfFive) return "Niquet";
        return numberToConvert + "";
    }

    public ArrayList counter(int limit) {
        ArrayList listResult = new ArrayList();
        for (int i = 1; i <= limit; i++) {
            listResult.add(converter(i));
        }
        return listResult;
    }
}
