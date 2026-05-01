package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		System.out.println("===会員情報を表示します===");

		//TODO ここから実装する
		List<Member> members = new ArrayList<Member>();
		members.add(new Member(1, "PasswOrd", "Miura Manabu", 28, 2));
		members.add(new Member(2, "aaaAAA", "Sato Kensuke", 43, 1));

		MemberManager.showAllMembers();
	}

}
