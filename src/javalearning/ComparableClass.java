package javalearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableClass implements Comparable<ComparableClass>, Comparator<ComparableClass>,AdityaIntf<ComparableClass> {

	private int trainerid;
	private String trainername;

	public ComparableClass() {
	}

	public ComparableClass(int trainerid, String trainername) {
		this.trainerid = trainerid;
		this.trainername = trainername;
	}

	public int getTrainerid() {
		return trainerid;
	}

	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	@Override
	public String toString() {
		return "ComparableClass [trainerid=" + trainerid + ", trainername=" + trainername + "]";
	}

	// Comes from Comparable
	@Override
	public int compareTo(ComparableClass obj) {
		return this.trainerid - obj.trainerid;

	}

	// Comes from Comparator
	@Override
	public int compare(ComparableClass o1, ComparableClass o2) {
		return o1.getTrainername().compareTo(o2.getTrainername());
	}

	public static void main(String[] args) {

		List<ComparableClass> listComparable = new ArrayList<>();
		listComparable.add(new ComparableClass(1, "Aditya"));
		listComparable.add(new ComparableClass(0, "Drishti"));
		listComparable.add(new ComparableClass(5, "Frisht"));

		Collections.sort(listComparable);

		for (ComparableClass comparableRes : listComparable) {
			System.out.println("comparableRes->" + comparableRes);
		}

		List<ComparableClass> listComparator = new ArrayList<>();
		listComparator.add(new ComparableClass(1, "Aditya"));
		listComparator.add(new ComparableClass(0, "Drishti"));
		listComparator.add(new ComparableClass(5, "Frisht"));

		Collections.sort(listComparator, new ComparableClass());

		for (ComparableClass comparatorRes : listComparator) {
			System.out.println("comparatorRes->" + comparatorRes);
		}
		
		
	}

	@Override
	public int funcForAddition(ComparableClass obj) {
		return this.trainerid - obj.trainerid;
		
	}


}
