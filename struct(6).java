public class struct {
	ArrayList<Integer> arr;
	HashMap<Integer, Integer> map;
	
	public struct() {
		arr = new ArrayList<>();
		map = new HashMap<>();
	}
	
	public void add(int elem) {
		if(map.containsKey(elem)) {
			return;
		}
		arr.add(elem);
		map.put(elem, arr.size()-1);
	}
	
	public void remove(int elem) {
		if(!map.containsKey(elem)) {
			return;
		}
		int val = map.get(elem);
		map.remove(elem);
		Collections.swap(arr, val, arr.size()-1);
		arr.remove(arr.size()-1);
		map.replace(arr.get(val), val);
		
	}
	

}



