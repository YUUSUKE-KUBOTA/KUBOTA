package jp.co.scsk.kyushu.exBasic;

public class Marriage {
	public boolean checkMarriage(Human person) {
		if (person.getSex().isMan()) {
			return person.getAge() >= 18;
		}
		if (person.getSex().isWoman()) {
			return person.getAge() >= 16;
		}
		return false;
	}

	public boolean checkMarriage(Human person1, Human person2) {
		if(!checkMarriage(person1)) {
			return false;
		} else if (!checkMarriage(person2)) {
			return false;
		}
		return (person1.getSex().isMan() != person2.getSex().isMan());
	}

	public static void main(String[] args) {
		Marriage marriage = new Marriage();
		Sex sex1 = new Sex(1);
		Sex sex2 = new Sex(2);
		Blood blood = new Blood();
		Human human1 = new Human(10, "山田花子", sex1, blood, 160.0, 50.0);
		Human human2 = new Human(20, "山田花子", sex2, blood, 160.0, 50.0);
		System.out.println(marriage.checkMarriage(human1, human2));
	}

}
