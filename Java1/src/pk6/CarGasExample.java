package pk6;

public class CarGasExample {

	public static void main(String[] args) {
		CarGas cargas = new CarGas();
		cargas.setGas(5);
		boolean gasState=cargas.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�");
			cargas.run();
		
		//������ �ʿ�����
		if(cargas.isLeftGas()) {
			System.out.println("���� �ʿ���� ");
		}else {
			System.out.println("������ �ʿ�");
		}
	}
	}
}
