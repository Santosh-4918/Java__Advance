import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondMostFrequent {
    public static long analyzeArray(List<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            return -1;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : arr) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        int highestFrequency = 0;
        int secondHighestFrequency = -1;

        for (int frequency : frequencyMap.values()) {
            highestFrequency = Math.max(highestFrequency, frequency);           
        }
        System.out.println("Highest Frequency: " + highestFrequency);
 
        for(int freq : frequencyMap.values()){
            if(freq<highestFrequency){
                secondHighestFrequency = Math.max(secondHighestFrequency, freq);
            }
        }
        System.out.println("Second Highest Frequency: " + secondHighestFrequency);

        long answer = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == secondHighestFrequency) {
                answer = Math.max(answer, entry.getKey());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(11, 2, 2, 3, 3, 3, 1);
        System.out.println(analyzeArray(arr));
    }
}