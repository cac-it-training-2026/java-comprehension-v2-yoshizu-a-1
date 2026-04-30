package q01_basic.question05;

public class MemberManager {

	private MemberManager() {
	}

	public static void showAllMembers(AbstMember[] abstmember) {
		for (AbstMember members : abstmember) {

			members.showMember();

		}
	}

}
