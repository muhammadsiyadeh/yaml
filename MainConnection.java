package com.seqato;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class MainConnection {

	public static void main(String[] args) {
		Yaml yaml = new Yaml();
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("/home/siyad-seqato/a/a.yml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Object> obj = yaml.load(inputStream);
		String name = (String) obj.get("name");
		System.out.println(name);
		System.out.println(obj);
		List<Object> listObj = new ArrayList<Object>();
		listObj.add(obj.get("names"));
		System.out.println(listObj);
}
}