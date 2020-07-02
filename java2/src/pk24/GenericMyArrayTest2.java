package pk24;

class MyArray2<T>{
	private Object[] array = new Object[10];
	int i;
	
	public T add(T obj) {
		return  (T) (array[i++] = obj);
		
	}
	public Object get(int index) {
		return array[index];
	}
}
public class GenericMyArrayTest2 {

	public static void main(String[] args) {
		MyArray2<String> myArray1 = new MyArray2<String>();
		String str=myArray1.add(new String("Test")); 
		System.out.println(str);
		
		MyArray2<Integer> myArray2 = new MyArray2<Integer>();
		Integer num=myArray2.add(new Integer(100));
		System.out.println(num);
	}

	

}