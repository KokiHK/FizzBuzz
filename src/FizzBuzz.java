
public class FizzBuzz {

	public static void main(String[] args) {
		// 1から100までの数値をループで処理する
		for (int n=1; n<101; n++) {
		//3かつ5の倍数の場合「FizzBizz」
		if(n % 3==0 && n %5 ==0) {
			System.out.println("FizzBIzz");
		}
		//条件式　３で割り切れる数値の場合「Fizz」と表示する
		else if( n % 3 == 0) {
			System.out.println("Fizz");
		}
		//条件式　5で割り切れる数値の場合「Buzz」とする
		else if( n % 5 == 0) {
			System.out.println("Buzz");
		}
		else 
			System.out.println(n);
		}
	
	}
}

	
		
			