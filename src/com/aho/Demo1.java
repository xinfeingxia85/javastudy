package com.aho;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		//读取字典内容
		BufferedReader br= new BufferedReader(new FileReader("./data/small.dic"));
		String line;
		Map<String, String> map = new HashMap<String, String>();
		while((line = br.readLine())!= null){
			map.put(line, line);
		}
		long startTime = System.currentTimeMillis();
		AhoCorasickDoubleArrayTrie<String> acda = new AhoCorasickDoubleArrayTrie<String>();
		acda.build(map);

		
		//分析的文本内容
		String text = "我想知道你的人在干什么!!";
		
		//匹配字符串
		acda.parseText(text, new AhoCorasickDoubleArrayTrie.IHit<String>(){

			@Override
			public void hit(int begin, int end, String value) {
				// TODO Auto-generated method stub
				System.out.println(value);
			}
			
		});
		
		long endTime = System.currentTimeMillis();
		System.out.println("字典加载耗时:" + (endTime-startTime));
	}

}
