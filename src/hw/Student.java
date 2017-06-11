package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> id = new ArrayList<>();
		ArrayList<Integer> score = new ArrayList<Integer>();
		System.out.println("是否輸入資料?(Y/N)");
		String but = scn.next();
		while (but.equals("Y")) {
			System.out.println("輸入姓名:");
			name.add(scn.next());
			System.out.println("輸入學號:");
			id.add(scn.next());
			System.out.println("輸入成績:");
			score.add(scn.nextInt());
			for (int i = 0; i < score.size(); i++) {
				for (int j = 0; j < score.size(); j++) {
					if (score.get(i) < score.get(j)) {
						int chg = score.get(i);
						score.set(i, score.get(j));
						score.set(j, chg);
					}
				}
			}
			for (int i = 0; i < score.size(); i++) {
				System.out.println(name.get(i) + "\t" + id.get(i) + "\t" + score.get(i));
			}
		}

		while (but.equals("y")) {
			System.out.println("輸入姓名:");
			name.add(scn.next());
			System.out.println("輸入學號:");
			id.add(scn.next());
			System.out.println("輸入成績:");
			score.add(scn.nextInt());
			for (int i = 0; i < score.size(); i++) {
				for (int j = 0; j < score.size(); j++) {
					if (score.get(i) < score.get(j)) {
						int chg = score.get(i);
						score.set(i, score.get(j));
						score.set(j, chg);
					}
				}
			}
		}
		while(but.equals("N")){
			for (int i = 0; i < score.size(); i++) {
				System.out.print(name.get(i) + "\t" + id.get(i) + "\t" + score.get(i));
			}
		}
		while(but.equals("n")){
			for (int i = 0; i < score.size(); i++) {
				System.out.print(name.get(i) + "\t" + id.get(i) + "\t" + score.get(i));
			}
		}
	}
}

