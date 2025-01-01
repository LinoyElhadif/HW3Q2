package WeakClass.WeakClass;

public class WeakClass {
	public int weakMethod1 (int a, int b) {
		if (a > b) {
			return a/b;
		} else {
			return b/a;
		}
	}
	
	public int weakMethod2 (int a, int b) {
		if (a<b) {
			return b/a;
		}
		else {
			return a/b;
		}
	}
}