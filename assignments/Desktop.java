package week3.day1.assignments;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktop size is 15 inches");
	}
public static void main(String[] args) {
	Desktop des= new Desktop();
	des.desktopSize();
	des.computerModel();
}
}
