package bookStoreChap07;

public class Validate {
	
	private StringBuilder error = new StringBuilder();
	
	public void getError() {
		//return error;
		System.out.println(this.error);
	}

	public void setError(String error) {
		this.error.append(error).append("\n");
	}

	public boolean checkID(String iD) {
		boolean flag = iD.matches("[A-z]{3}-[1-9]{3}");
		if(flag == false) {
			this.setError("ID không hợp lệ, id phải có dạng [A-z]{3}-[1-9]{3}");
		}
		return flag;
		//return iD.matches("[A-z]{3}-[1-9]{3}"); // vì giá trị trả về chỉ có false hoặc true
	}
	
	public boolean checkName(String Name) {
		boolean flag = Name.matches("[A-z0-9\\.\\s!]{5,100}");
		if (flag == false) {
			this.setError("Name không hợp lệ, Name phải có dạng [A-z0-9\\.\\s!]{5,100}");
		}
		return flag;
	}
	
	public boolean checkPrice(Double Price) {
		boolean flag = (Price > 0) && (Price <= 100);
		if (flag == false) {
			this.setError("giá không hợp lệ, giá phải >0 và <=100");
		}
		return flag;
	}
}
