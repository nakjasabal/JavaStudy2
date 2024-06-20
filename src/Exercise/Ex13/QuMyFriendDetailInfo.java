package Exercise.Ex13;
//친구의 정보를 저장할 기본클래스
class MyFriendInfo
{
	private String name;
	int age;
	
	//생성자
	public MyFriendInfo(String name, int a) {
		//this() : 생성자내에서 다른 생성자를 호출할때 사용.
		this(name);
		age = a;		
	}
	public MyFriendInfo(String name) {
		//this.멤버변수 : 해당 클래스의 멤버변수를 가르킴.
		this.name = name;		
	}
	
	public void ShowMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
  	private String phone;
  	
  	public MyFriendDetailInfo(String n, int a, 
  			String ad, String p) {
  		super(n,a);
  		addr = ad;
  		phone = p;
  	}

	public void ShowMyFriendDetailInfo()
	{
		ShowMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfo
{
	public static void main(String[] args)
	{
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		//정보Print		
		MyFriendDetailInfo friendInfo = 
				new MyFriendDetailInfo("이순신", 99, 
						"광화문광장", "010-1234-5678");
		
		friendInfo.ShowMyFriendDetailInfo();
	}
}
 






