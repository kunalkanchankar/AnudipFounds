package day1027;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;
public class Main2 {
	public static void main(String[] args) {
		PriorityQueue<String> name=new PriorityQueue<>();
		name.add("Prajyot");
		name.add("Saurabh");
		name.add("Amit");
		name.add("Vishwajit");
		System.out.println(name.peek());
		System.out.println(name.poll());
		System.out.println(name.poll());
		}
	}