package q01_basic.question03;

class Member {
	//TODO ここから実装する

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member() {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
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

	private String name;
	private int age;
	private int rank;

	public void rankUp() {
		rank++;
	}

	public void showMember() {
		System.out.println("---SHOW DATA---\n***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
	}
}
