package q01_basic.question05;

public class NonMember extends Member {
	/**
	 * @param name
	 */
	public NonMember() {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public NonMember(String name) {
		this.name = name;
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

	String name;

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ
		super.buyItem();
	}

	@Override
	public void showMember() {
		super.showMember();
	}
}
