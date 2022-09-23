package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * LeetCode company workers use key-cards to unlock office doors. Each time a worker uses their key-card, the security system saves the worker's name and the time when it was used. The system emits an alert if any worker uses the key-card three or more times in a one-hour period.
 *
 * You are given a list of strings keyName and keyTime where [keyName[i], keyTime[i]] corresponds to a person's name and the time when their key-card was used in a single day.
 *
 * Access times are given in the 24-hour time format "HH:MM", such as "23:51" and "09:49".
 *
 * Return a list of unique worker names who received an alert for frequent keycard use. Sort the names in ascending order alphabetically.
 *
 * Notice that "10:00" - "11:00" is considered to be within a one-hour period, while "22:51" - "23:52" is not considered to be within a one-hour period.
 *
 *
 *
 * Example 1:
 *
 * Input: keyName = ["daniel","daniel","daniel","luis","luis","luis","luis"], keyTime = ["10:00","10:40","11:00","09:00","11:00","13:00","15:00"]
 * Output: ["daniel"]
 * Explanation: "daniel" used the keycard 3 times in a one-hour period ("10:00","10:40", "11:00").
 * Example 2:
 *
 * Input: keyName = ["alice","alice","alice","bob","bob","bob","bob"], keyTime = ["12:01","12:00","18:00","21:00","21:20","21:30","23:00"]
 * Output: ["bob"]
 * Explanation: "bob" used the keycard 3 times in a one-hour period ("21:00","21:20", "21:30").
 */
public class CardEntry {


        private int convertTimeMinutes(String time){
            int h= Integer.parseInt(time.substring(0,2));
            int m =  Integer.parseInt(time.substring(3));
            //if(h==0){
            //     h=24;
            // }
            return (h *60 + m);
        }

        public List<String> alertNames(String[] keyName, String[] keyTime) {
            List<String> listNames = new ArrayList<String>();
            HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();

            //Instant  time = new SimpleDateFormat ("HH:mm");
            for(int i=0; i<keyTime.length; i++){

                if(map.containsKey(keyName[i])){
                    map.get(keyName[i]).add(convertTimeMinutes(keyTime[i]));
                    Collections.sort(map.get(keyName[i]));
                }else{
                    ArrayList list=  new ArrayList<Integer>();
                    list.add(convertTimeMinutes(keyTime[i]));
                    map.put(keyName[i],list);

                }
            }

            map.forEach((key,value)->{
                for(int i=0; i<value.size()-2; i++){
                    if(Math.abs(value.get(i)-value.get(i+2))<=60){
                        if(!listNames.contains(key)){
                            listNames.add(key);}
                    }
                }
            });
            Collections.sort(listNames);
            return listNames;

        }

}
