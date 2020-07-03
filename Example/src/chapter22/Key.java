package chapter22;

public class Key {
	public int number;

	public Key(int number){
		this.number = number;
	}



	//equals �������̵�(������ �ּҸ� ���Ը���)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key) obj;
			if(this.number == key.number) {
				return true;
			}
		}

		return false;
	}




	//hashcode �������̵� (�������� �ּҸ� ����)
	@Override
	public int hashCode() {

		return number;
	}


}
