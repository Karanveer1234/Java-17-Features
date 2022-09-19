package switch_statement;

import javax.swing.text.Position;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class Switch {

    public static void main(String a[]){
        String               randomPosition;
        Map<Integer, String> positionMap = new HashMap<>();
        positionMap.put(1, "GOALKEEPER");
        positionMap.put(2, "DEFENCE");
        positionMap.put(3, "MIDFIELDER");
        positionMap.put(4, "STRIKER");
        for (Integer key:positionMap.keySet()) {
            randomPosition = Optional.ofNullable(positionMap.get(key)).orElse("BENCH");
            oldSwitchExpressionTest(randomPosition);
            newSwitchExpressionTest(randomPosition);
            newSwitchExpressionWithAssignmentTest(randomPosition);
        }
    }


    public static void oldSwitchExpressionTest(String randomPosition) {
        switch (randomPosition) {
            case "GOALKEEPER":
                System.out.println("Goal Keeper: Buffon");
                break;
            case "DEFENCE":
                System.out.println("Defence: Ramos");
                break;
            case "MIDFIELDER":
                System.out.println("Midfielder: Messi");
                break;
            case "STRIKER":
                System.out.println("Striker: Zlatan");
                break;
            default:
                System.out.println("Please select a footballer from the BENCH!");
        }
    }


    public static void newSwitchExpressionTest(String randomPosition) {
        switch (randomPosition) {
            case "GOALKEEPER" -> System.out.println("Goal Keeper: Buffon");
            case "DEFENCE" -> System.out.println("Defence: Ramos");
            case "MIDFIELDER" -> System.out.println("Midfielder: Messi");
            case "STRIKER" -> System.out.println("Striker: Zlatan");
            default -> System.out.println("Please select a footballer from the BENCH!");
        }
    }

    public static void newSwitchExpressionWithAssignmentTest(String randomPosition) {
        String footballer = switch (randomPosition) {
            case "GOALKEEPER", "DEFENCE" -> {
                System.out.println("Defensive Footballer Selection!");
                yield "Defence: Ramos";
            }
            case "MIDFIELDER", "STRIKER" -> {
                System.out.println("Offensive Footballer Selection!");
                yield "Midfielder: Messi";
            }
            default -> "Please select a footballer from the BENCH!";
        };
        System.out.println(footballer);
    }
}
