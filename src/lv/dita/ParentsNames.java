package lv.dita;

import java.util.Scanner;

public class ParentsNames {

	protected String fatherName = "";
	protected String motherName = "";
	
	
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	protected String endFather = fatherName.substring(fatherName.length() - 3);
	protected String beginFather = fatherName.substring(0, 3);
	protected String beginMother = motherName.substring(0, 3);
	protected String endMother = motherName.substring(motherName.length() - 3);;

//	public void setEndFather(String endFather) {
//		this.endFather = endFather.substring(fatherName.length() - 3);
//	}
//
//	public void setBeginFather(String beginFather) {
//		this.beginFather = beginFather.substring(0, 3);
//	}
//
//	public void setBeginMother(String beginMother) {
//		this.beginMother = beginMother.substring(0, 3);
//	}
//
//	public void setEndMother(String endMother) {
//		this.endMother = endMother.
//	}

	public String getFatherName() {
		return fatherName.toUpperCase();
	}
	
	public String getMotherName() {
		return motherName.toUpperCase();
	}
	
	public String getEndFather() {
		return endFather;
		}
	
	public String getEndMother() {
		return endMother;
	}

	public String getBeginFather() {
		return beginFather;
	}
	
	public String getBeginMother() {
		return beginMother;
	}
}
