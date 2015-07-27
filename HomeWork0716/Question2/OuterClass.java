package Question2;

public class OuterClass {
	private String name;
	private int age;

	private int getAge() {
		return age;
	}

	private String getName() {
		return name;
	}

	public class InnerClass {

		public InnerClass() {
			name = "Zhe Huang";
			age = 26;
		}

		public void display() {
			System.out.println("name：" + getName() + "; age：" + getAge());
		}
	}

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass innerClass = oc.new InnerClass();
		innerClass.display();
	}
}