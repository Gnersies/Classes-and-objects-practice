public class Letter {
	String sender;
	String recipient;
	String body = "";
	public Letter(String from, String to){
		sender = from;
		recipient = to;}
	public void addLine(String line){
		body += line + "\r";}
	public String getText(){
		return ("Dear " + recipient + ":\r\r" + body + "\rSincerely,\r\r" + sender);}
}
