package com.college.pojo;

public class Subjects {
	
	private int phyMarks;
	private int chemMarks;
	private int sciMarks;
	private int mathMarks;
	
	public Subjects(int phyMarks, int chemMarks, int sciMarks, int mathMarks) {
		super();
		this.phyMarks = phyMarks;
		this.chemMarks = chemMarks;
		this.sciMarks = sciMarks;
		this.mathMarks = mathMarks;
	}
	public Subjects() {
		super();
	}
	
	public int getPhyMarks() {
		return phyMarks;
	}
	public void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}
	public int getChemMarks() {
		return chemMarks;
	}
	public void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}
	public int getSciMarks() {
		return sciMarks;
	}
	public void setSciMarks(int sciMarks) {
		this.sciMarks = sciMarks;
	}
	public int getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}
	
	@Override
	public String toString() {
		return "Subjects [phyMarks=" + phyMarks + ", chemMarks=" + chemMarks + ", sciMarks=" + sciMarks + ", mathMarks="
				+ mathMarks + "]";
	}
}
