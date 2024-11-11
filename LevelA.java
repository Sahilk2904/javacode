package sahil;

public class LevelA extends LevelB{
	void login() {
	System.out.println("login Jenkins");
	}
	public static void main(String[] args) {
		LevelA a = new LevelA();
		a.login();
		a.Build();
		a.conf();
		a.console();
	}
}

class LevelB extends LevelC {

	void Build() {
		System.out.println("Jenkins Build");
		}
}

class LevelC extends LevelD{
	void conf() {
		System.out.println("Jenkins Confi");
		}

}

class LevelD {
	void console() {
		System.out.println("console logs");
		}
}
