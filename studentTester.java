public class studentTester {
	public static void main(String[] args) {
		Student a = new Student("Justin");
		a.addQuiz(92);
		a.addQuiz(98);
	System.out.println(a.getName() + " has a total score of " + a.getTotalScore() + ". His/her average score is " + a.getAverageScore());}
}
