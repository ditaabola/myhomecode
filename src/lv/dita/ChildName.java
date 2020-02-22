package lv.dita;

public class ChildName extends ParentsNames {
	protected String childNameM1 = super.beginMother+ super.endFather;
	protected String childNameF1 = super.beginFather + super.endMother;
	protected String childNameM2 = super.beginMother + super.beginFather + "S";
	protected String childNameF2 = super.beginMother + super.beginFather + "A";

	public ChildName() {
	}
	public String getChildNameM1() {
		return childNameM1;
	}
	
	public String getChildNameF1() {
		return childNameF1;
	}

	public String getChildNameM2() {
		return childNameM2;
	}

	public String getChildNameF2() {
		return childNameF2;
	}
}
