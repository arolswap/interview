package arrays;

import java.util.*;

/**
 * // We are working on a security system for a badged-access room in our company's building.
 * <p>
 * // Given an ordered list of employees who used their badge to enter or exit the room, write a function that returns two collections:
 * <p>
 * // 1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit. (All employees are required to leave the room before the log ends.)
 * <p>
 * // 2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter. (The room is empty when the log begins.)
 * <p>
 * // Each collection should contain no duplicates, regardless of how many times a given employee matches the criteria for belonging to it.
 */
public class CandidateBadgeCheck {

    public static List<Set<String>> badgeCheck(String[][] log) {
        Set<String> en = new HashSet<>();
        Set<String> ex = new HashSet<>();
        List<Set<String>> x = new ArrayList<Set<String>>();
        HashMap<String, Integer> statusList = new HashMap<>();
        for (int i = 0; i < log.length; i++) {


            String name = log[i][0];
            String status = log[i][1];
            if ("exit".equals(status)) {
                if (!statusList.containsKey(name)) {
                    en.add(name);
                    statusList.put(name, 0);
                } else {
                    if (statusList.get(name) > 1 || statusList.get(name) == 0) {
                        en.add(name);
                    }
                    statusList.put(name, 0);
                }

            }
            if ("enter".equals(status)) {
                if (!statusList.containsKey(name)) {
                    statusList.put(name, 1);
                } else {

                    if (statusList.get(name) > 1) {
                        en.add(name);
                    }
                    statusList.put(name, 1);
                }
            }

        }
        for (String name : statusList.keySet()) {
            if (statusList.get(name) == 1) {
                ex.add(name);
            }


        }
        x.add(ex);
        x.add(en);
        return x;

    }

    public static void main(String[] args) {
        String[][] input = {
                {"Martha", "exit"},
                {"Paul", "enter"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "enter"},
                {"Paul", "enter"},
                {"Curtis", "exit"},
                {"Curtis", "enter"},
                {"Paul", "exit"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "exit"},
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Martha", "exit"}
        };
       /* input = new String[][]{
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
                {"Paul", "enter"}};*/
        // Expected output: ["Paul"}, ["Paul"}
        input = new String[][]{
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
                {"Paul", "enter"},
                {"Martha", "enter"},
                {"Martha", "exit"}
        };

        // Expected output: ["Paul"], ["Paul"]


        badgeCheck(input);
    }
}
