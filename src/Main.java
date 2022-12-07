
public class Main {

	public static void main(String[] args) {

		Article article1 = new Article();
		System.out.println(article1.id);
		
		Article article2 = new Article(2,"12-12-12");
		article2.id =2;
		article2.lastId =2;
		System.out.println("id :"+article2.id);
		System.out.println(article2.lastId);
		System.out.println("id :"+article1.id);
		System.out.println(article1.lastId);

	}

}
class Article{
	
	static int lastId;
	//스태틱메서드는 설계도에게 일시키기위해 만들고
	//이건스태틱 변수라고 하며 스태틱변수는 바로이전에 초기화한 값을 출력한다
	//스태택변수는 바로아래 스태틱블럭에서만 초기화가 가능하다
	int id;
	String regDate;
	
	
	
	static {
	//실행될때 가장먼저 실행된다
	//이것은 초기화 블럭이라고 하며스태틱변수를 사용하면 스태틱 초기화를 해주어야 한다
		lastId = 1;
	//위에서 article2.lastId =2로 다시한번 초기화를 해주어서
	//이곳에는 실제 값이 2로 변경된다 그리고 위의 출력문에서 마지막 lastId가 2가 나온다
	//공유제이다 
	}
	
	Article(){
	//기본생성자 생성자는 객체만들때 실행된다
		this.id =1;
	}

	Article(int id, String ragDate) {
	//매개변수가 있는 생성자
		this.id =id;
		this.regDate =ragDate;
		
	}
	
	
}
