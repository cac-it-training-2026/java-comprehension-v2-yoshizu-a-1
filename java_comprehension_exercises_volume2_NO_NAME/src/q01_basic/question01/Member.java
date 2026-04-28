package q01_basic.question01;

/**
 * Member 会員クラス
 * 
name:Miura Manabu
age:24
rank:1
*****************
 */
class Member {
	//TODO ここから実装する

	String name;
	int age;
	int rank;

	public void showMember() {
		System.out.println("---SHOW DATA---\n***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
	}
}
