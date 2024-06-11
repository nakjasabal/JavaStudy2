package ex12inheritance;

class Iclass extends Object {
	void aFn() {}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
class Jclass extends Iclass {	
	@Override
	void aFn() {		
		super.aFn();
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
