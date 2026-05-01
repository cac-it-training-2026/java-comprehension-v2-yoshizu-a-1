package q01_basic.question05;

public class Member extends AbstMember {
	/**
	 * @param id
	 * @param passward
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member() {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * @param id
	 * @param passward
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String passward, String name, int age, int rank) {
		this.id = id;
		this.password = passward;
		this.name = name;
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
	 * @return passward
	 */
	public String getPassward() {
		return password;
	}

	/**
	 * @param passward セットする passward
	 */
	public void setPassward(String passward) {
		this.password = passward;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
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

	//TODO ここから実装する
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;

	public void rankUp() {
		rank++;

	}

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
