import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class FindLuckyInteger {
	public int findLucky(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int number : arr){
			int frequency = 1;

			if(map.containsKey(number)){
				frequency += map.get(number);
				map.put(number, frequency);
			}else{
				map.put(number, frequency);
			}
		}

		int biggestValue = Integer.MIN_VALUE;

		map.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});

		for(Map.Entry<Integer, Integer> item : map.entrySet()){
			if(Objects.equals(item.getKey(), item.getValue())) {
				if(item.getValue() > biggestValue){
					biggestValue = item.getValue();
					System.out.println("biggest: " + biggestValue);
				}
			}else if(biggestValue != Integer.MIN_VALUE) {
				return biggestValue;
			}
			else {
				return -1;
			}
		}

		return biggestValue;
	}
}