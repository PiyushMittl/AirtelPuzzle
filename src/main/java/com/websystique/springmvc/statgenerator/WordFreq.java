package com.websystique.springmvc.statgenerator;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {

	public static void main(String[] args) {
		String text = "Happy like the quick brown fox jumps fox fox over the lazy dog brown Happy Cry";
		String[] keys = text.split(" ");
		String[] uniqueKeys;
		int count = 0;
		System.out.println(text);
		uniqueKeys = wordFreq(keys);
		System.out.print("-------------frequency count--------------------\n");
		for (String key : uniqueKeys) {
			if (null == key) {
				break;
			}
			for (String s : keys) {
				if (key.equals(s)) {
					count++;
				}
			}
			System.out.println("Count of [" + key + "] is : " + count);
			count = 0;
		}

		System.out.print("-------------vowel count--------------------\n");

		HashMap<String, String> coun = (HashMap<String, String>) vowelFreq(text);

		for (Map.Entry<String, String> entry : coun.entrySet()) {
			System.out.println("Count of [" + entry.getKey() + "] is : " + entry.getValue());
		}

		System.out.print("-------------score--------------------\n");

		String[] happyKeys = { "Happy", "like" };
		String[] badKeys = { "cry", "hate" };
		int cnt = 0;
		for (String key : keys) {

			if (key != null) {
				for (String s : happyKeys) {
					if (key.equalsIgnoreCase(s)) {
						cnt++;
					}
				}
			}
		}
		for (String key : keys) {
			if (key != null) {
				for (String s : badKeys) {
					if (key.equalsIgnoreCase(s)) {
						cnt--;
					}
				}
			}
		}

		System.out.println("total score " + cnt);

		if (cnt > 2)
			System.out.println("sentiment is positive");
		else if (cnt < -2)
			System.out.println("sentiment is negative");
		else
			System.out.println("sentiment is neutral");
	}

	private static String[] wordFreq(String[] keys) {
		String[] uniqueKeys = new String[keys.length];

		uniqueKeys[0] = keys[0];
		int uniqueKeyIndex = 1;
		boolean keyAlreadyExists = false;

		for (int i = 1; i < keys.length; i++) {
			for (int j = 0; j <= uniqueKeyIndex; j++) {
				if (keys[i].equals(uniqueKeys[j])) {
					keyAlreadyExists = true;
				}
			}

			if (!keyAlreadyExists) {
				uniqueKeys[uniqueKeyIndex] = keys[i];
				uniqueKeyIndex++;
			}
			keyAlreadyExists = false;
		}
		return uniqueKeys;
	}

	private static Map vowelFreq(String text) {

		Map<String, String> hashMap = new HashMap<String, String>();

		int count = 0;
		char vowel[] = { 'a', 'e', 'i', 'o', 'u' };

		for (char ch : vowel) {
			count = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ch) {
					count++;
				}
			}
			if (count != 0)
				hashMap.put("" + ch, "" + count);
		}
		return hashMap;
	}

}