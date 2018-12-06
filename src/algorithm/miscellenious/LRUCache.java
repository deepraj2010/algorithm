package algorithm.miscellenious;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LRUCache {
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(7);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give input ");
		String values = input.nextLine();
		
		String[] array = values.split("S|G");
		for(String s : array) {
			if(s.trim().length() >= 3) {
				String[] s2 = s.split(" ");
				if(s2[0].length() == 0) {
					cache.set(Integer.parseInt(s2[1]), Integer.parseInt(s2[2]));
				} else {
					cache.set(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]));
				}
				
			}else if(s.trim().length() > 0 && s.trim().length() < 3) {
				String[] s2 = s.split(" ");
				if(s2[0].trim().length() ==0) {
					System.out.print(cache.get(Integer.parseInt(s2[1].trim())));
				} else {
					System.out.print(cache.get(Integer.parseInt(s2[0].trim())));
				}
				System.out.print(" ");
			}
		}
		input.close();
	}
    
    private Map<Integer, Integer> cacheMap;
    private List<Integer> queue;
    private int capacity;
    
    public LRUCache(int capacity) {
    	this.capacity = capacity;
        cacheMap = new HashMap<Integer, Integer>(capacity);
        queue = new LinkedList<Integer>();
    }
    
    public int get(int key) {
    	if(cacheMap.containsKey(key)) {
    		int index = queue.indexOf(key);
    		queue.remove(index);
    		queue.add(key);
    		return cacheMap.get(key);
    	} else {
    		return -1;
    	}
    }
    
    public void set(int key, int value) {
    	if(cacheMap.containsKey(key)) {
    		cacheMap.put(key, value);
    		int index = queue.indexOf(key);
    		queue.remove(index);
    		queue.add(key);
    	}
    	else if(cacheMap.size() == capacity ) {
     		Integer i = queue.remove(queue.size() -1);
     		cacheMap.remove(i);
     		cacheMap.put(key, value);
     		queue.add(key);
     	} else {
    		cacheMap.put(key, value);
    		queue.add(key);
    	}
    }
}
