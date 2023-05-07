package week3.Assignment5;

public class Automation extends  MultipleLanguage implements TestTool  {

	public static void main(String[] args) {
	 Automation key = new Automation();
      key.java();
      key.python();
      key.ruby();
      key.Selenium();
	}


	@Override
	public void ruby() {
		System.out.println("unimplement method from abstract ");
		
	}


	public void java() {
		// TODO Auto-generated method stub
		System.out.println("unimplement method from language");
	}


	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("unimplement method from testtool");
	}

}
