package Question3;

public class InstanceMethod {
	private static String name;
	private static int age;

	private static int getAge() {
		return age;
	}

	private static String getName() {
		return name;
	}

	public static class InnerClass {

		public InnerClass() {
			name = "Zhe Huang";
			age = 26;
		}

		public void display() {
			System.out.println("name：" + getName() + "; age：" + getAge());
		}
	}

	public static void main(String[] args) {
		InstanceMethod im = new InstanceMethod();
		InstanceMethod.InnerClass innerClass = im.new InnerClass();
		innerClass.display();
	}
}