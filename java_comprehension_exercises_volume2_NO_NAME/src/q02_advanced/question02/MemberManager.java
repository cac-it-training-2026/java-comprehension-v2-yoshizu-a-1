package q02_advanced.question02;

import java.nio.channels.MembershipKey;
import java.util.List;

public class MemberManager {

	private MemberManager() {
	}

	public static void showAllMembers(List<Member> members) {

	}

	public static void updatePassword(List<Member> members) {

	}

	boolean isNotExistMember = false;for(
	Member member:members)
	{
		if (member.getId() == targetId) {
			member.setPassword(newPassword);
			break;
		} else {
			isNotExistMember = true;//該当者なし
		}
	}

}