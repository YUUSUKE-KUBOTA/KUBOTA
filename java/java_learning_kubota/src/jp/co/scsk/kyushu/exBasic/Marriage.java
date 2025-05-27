package jp.co.scsk.kyushu.exBasic;

public class Marriage {
	Sex sex = new Sex(Sex.MAN);
	Blood blood = new Blood();
	Human human1 = new Human(20, "山田花子", sex, blood, 160.0, 50.0);

	public boolean checkMarriage(Human person) {
		if (person.getSex().isMan()) {
			return person.getAge() > 18;
		}
		if (person.getSex().isWoman()) {
			return person.getAge() > 16;
		}
		return false;
	}

	public boolean checkMarriage(Human person1, Human person2) {
		return ((person1.getSex().isMan() && person2.getSex().isWoman())
				|| (person1.getSex().isWoman() && person2.getSex().isMan()));
	}
}
