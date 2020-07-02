package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		//immutable, 불변
		String javaStr=new String("java");
		//처음 객체의 인스턴스화시 메모리 값 
		System.out.println("javaStr의 메모리 주소 : "+ System.identityHashCode(javaStr));
		//String으로부터 StringBuilder의 객체를 생성 
		StringBuilder buffer = new StringBuilder(javaStr);
		//연산이 이루어지기 전 원본 hash값 
		System.out.println("연산전 Buffer의 메모리 주소 : " + System.identityHashCode(buffer));
		
		System.out.println(buffer);
		
		buffer.append(" and ");
		buffer.append("android");
		buffer.append(" Programming is fun!");
		
		System.out.println("연산후 Buffer의 메모리 주소 : " + System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		
		System.out.println("새로만들어진 javaStr의 문자열 주소 : " + System.identityHashCode(javaStr));
	}

}
