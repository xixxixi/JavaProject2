package streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {

		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50,60");
		inputList2.stream() // Stream<String>
		.flatMapToInt( new Function<String, IntStream> (){
			@Override
			public IntStream apply(String t) {
				String[] strArr = t.split(","); 	// split : , 를 기준으로 배열을 만듬
				int[] intArr = new int[strArr.length];
				for(int i = 0; i<strArr.length;i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());	// 문자 10을 숫자 10에 담는다
				}	
				return Arrays.stream(intArr);
			}
		}) // IntStream
		.foreach(number -> sysout )
			
	}

}
//data -> {
//}
//	String[] strArr = data.split(",");
//	int[] intArr = new int[strArr.length];
//	for (int i = 0; i < strArr.length; i++) {
//		intArr[i] = Integer.parseInt(strArr[i].trim());
//	}
//	return Arrays.stream(intArr);
//}) // IntStream
//.forEach(number -> System.out.println(number));