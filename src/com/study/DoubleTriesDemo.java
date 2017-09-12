package com.study;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.darts.DoubleArrayTrie;

public class DoubleTriesDemo {

	public static void main(String[] args) throws IOException {
		// 读取字典
		BufferedReader br = new BufferedReader(new FileReader("./data/small.dic"));
		String line;
		List<String> words = new ArrayList<String>(); // store word
		Set<Character> charset = new HashSet<Character>();// store character

		while ((line = br.readLine()) != null) {
			words.add(line);

			// 制作一份码表
//			for (Character c : line.toCharArray()) {
//				charset.add(c);
//			}
		}
		br.close();
		
		//对字段进行排序
		Collections.sort(words);
		

//		System.out.println("字典此条数:" + words.size());
		
//		{
//			StringBuilder infoCharsetValue = new StringBuilder();
//			StringBuilder infoCharsetCode = new StringBuilder();
//			
//			for (Character c : charset) {
//				infoCharsetValue.append(c.charValue()+"    ");
//				infoCharsetCode.append((int)c.charValue()+" ");
//			}
//			infoCharsetCode.append("\n");
//			infoCharsetValue.append("\n");
//			System.out.println(infoCharsetValue.toString());
//			System.out.println(infoCharsetCode.toString());
//		}

		//双数组进行分词
		DoubleArrayTrie dat= new DoubleArrayTrie();
		long startTime = System.currentTimeMillis();
		System.out.println("是否错误:"+dat.build(words));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		List<Integer> integerList = dat.commonPrefixSearch("宝马奥迪");
		for (Integer index : integerList) {
			System.out.println(words.get(index));
		}
//		dat.dump();
	}

}
