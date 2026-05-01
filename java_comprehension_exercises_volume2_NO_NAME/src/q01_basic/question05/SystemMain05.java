package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		//TODO ここから実装する
		NonMember nonmember = new NonMember("Sato Kensuke");
		Member member1 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		System.out.println("---SHOW MEMBERS---");
		AbstMember[] allmembers = { nonmember, member1 };
		MemberManager.showAllMembers(allmembers);
		System.out.println("---BUY ITEM---");
		nonmember.buyItem();
		member1.buyItem();

	}

}
