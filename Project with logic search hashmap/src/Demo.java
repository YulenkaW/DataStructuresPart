
/**
 *
 // Yuliia Wickens
// CIS 2353
// Fall 2022
// Prof. John P. Baugh

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Demo {


public static void main(String[] args) {


List<String> fileList = new ArrayList<String>();

Map<String, String[]> groupMap = new HashMap<String, String[]>();

List<String> resultList = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
fileList = readFromFile();

for (String str : fileList) {
System.out.println(str);
}


groupMap = groupList(fileList);

System.out.println("What would you like to search for ?\n");

String searchstr = scanner.nextLine();

resultList = searchImage(searchstr, groupMap);


for (String s : resultList) {
System.out.println(s);
}

}

private static List<String> searchImage(String searchS, Map<String, String[]> groupMap) {
String[] searchFor;
List<String> result = new ArrayList<>();
if (searchS.equals("or")) {
searchFor = searchS.split(" or ");
if (searchFor.length > 2) {
System.out.println("Invalid search");
}
for (String s1 : searchFor) {
for (String key : groupMap.keySet()) {
String[] values = groupMap.get(key);
for (String s : values) {
if (s1.equals(s)) {
result.add(key);
}
}
}
}

} else if (searchS.equals("and")) {

searchFor = searchS.split(" and ");
if (searchFor.length > 2) {
System.out.println("Invalid search");
}

int count=0;
for (String key : groupMap.keySet()) {
String[] values = groupMap.get(key);
for (String s : values) {
if (searchFor[0].equals(s)) {
count++;

}
if (searchFor[1].equals(s)) {
count++;
}
if (count == 2) {
result.add(key);
}
}

}

} else {
for (String key : groupMap.keySet()) {
String[] values = groupMap.get(key);
for (String s : values) {
if (searchS.equals(s)) {
result.add(key);
}
}
}
}
return result;

}

public static List<String> readFromFile() {
List<String> fileList = new ArrayList<>();
BufferedReader reader;
try {
reader = new BufferedReader(new FileReader("test.txt"));
String line = reader.readLine();
while (line != null) {


fileList.add(line);
line = reader.readLine();
}
reader.close();
} catch (IOException e) {
System.out.println ("Invalid data");
}
return fileList;
}


public static Map<String, String[]> groupList(List<String> fileList) {
Map<String, String[]> groupMap = new HashMap<String, String[]>();
for (String string1 : fileList) {
String[] words = string1.split(" ");
String[] keys = new String[words.length - 1];
for (int i = 0; i < words.length - 1; i++) {
keys[i] = words[i + 1];
groupMap.put(words[0], keys);
}
}
return groupMap;
}    
}
