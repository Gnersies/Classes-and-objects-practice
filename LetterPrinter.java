public class LetterPrinter {
	public static void main(String[] args) {
		Letter myLetter = new Letter("Mary", "John");
		myLetter.addLine("I am sorry we must part.");
		myLetter.addLine("I wish you all the best.");
		System.out.println(myLetter.getText());}
}
