package pk6;

public class CarGasExample {

	public static void main(String[] args) {
		CarGas cargas = new CarGas();
		cargas.setGas(5);
		boolean gasState=cargas.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			cargas.run();
		
		//주유의 필요유무
		if(cargas.isLeftGas()) {
			System.out.println("주유 필요없음 ");
		}else {
			System.out.println("주유가 필요");
		}
	}
	}
}
