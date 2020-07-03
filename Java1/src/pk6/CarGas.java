package pk6;

public class CarGas {
	//필드
	int gas;
	//생성자 
	//메소드 
	void setGas(int gas) {
		this.gas= gas;
	}
	boolean isLeftGas() {
		//gas가 0이면 gas가 없습니다 -> false
		if(gas==0){
			System.out.println("gas가 없습니다");
			return false;
		}else {
			System.out.println("gas가 있습니다");
			return true;
		}
		
	}
	void run() {
		//gas가 0보다 크면 달립니다 gas보유량
		//gas가 0이면 멈춥니다 gas보유량 
		while(true) {
		if(gas>0) {
			System.out.println("주행중. " + "gas보유량 : " + gas);
			gas--;
		}else {
			System.out.println("멈춥니다. " + "gas보유량 : " + gas);
			return;
		}
		}
	}
}
