package day11;

public class Students {

	int sid;
	String sname;
	char grad;

	void printstudentdata() {
		System.out.println(sid + "  " + sname + "  " + grad);
	}

	void setstudentdata(int id, String name, char gr) {
		sid = id;
		sname = name;
		grad = gr;

	}

	Students(int id, String name, char gr) {
		sid = id;
		sname = name;
		grad = gr;

	}
}
