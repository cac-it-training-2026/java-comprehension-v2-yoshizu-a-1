package q01_basic.question06;

public class Member extends AbstMember {

	/**
	 * @param id
	 * @param password
	 * @param age
	 * @param rank
	 */
	public Member() {
		this.id = id;
		this.password = password;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * @param id
	 * @param password
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + " purchased the item at 50% off");
	}

	@Override
	public void showMember() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("passward:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);

	}
}
