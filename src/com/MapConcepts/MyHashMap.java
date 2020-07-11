package com.MapConcepts;
 
import java.security.NoSuchAlgorithmException;

public class MyHashMap {

	int n; // buckets to store data
	Node[] buckets;

	public MyHashMap(int buckets) {
		n = buckets;
		this.buckets = new Node[n];
	}

	public MyHashMap() { // default implementation
		this(100);
	}

	private int hash(String key) {
		try {
			return key.hashCode();
		} catch (Exception e) {
			return 0;
		}

	}

	public void put(String key, String value) {
		int hashcode = hash(key);
		System.out.println(hashcode);
		int idx = hashcode & (n - 1);// convert the hascode to value between 0 to n-1 beacuse we have buckets of n size
		System.out.println(idx);
		if (buckets[idx] == null) {
			Node node = new Node(key, value);
			buckets[idx] = node;
		} else {
			buckets[idx].put(key, value);
		}

	}

	public String get(String key) {
		int hashcode = hash(key);
		int idx = hashcode & (n - 1);// convert the hascode to value between 0 to n-1 beacuse we have buckets of n
		if (buckets[idx] == null) {
			return null;
		} else {

			return buckets[idx].get(key);
		}

	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		MyHashMap map = new MyHashMap();
		map.put("madhur", "hero");
		map.put("bharadwaj", "avenger");
		map.put("madhur", "herokahonda");
		System.out.println(map);
		System.out.println(map.get("madhur"));
		System.out.println(map.get("bharadwaj"));
		

	}

}
