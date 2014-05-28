package edu.esprit.examtest;

public class Myclass {

	public Myclass() {
		// TODO Auto-generated constructor stub
	}

	public int process(int n) {

		if (n < 2) {
			return n;
		}

		else {
			return process(n - 2) + process(n - 1);
		}
	}
}
