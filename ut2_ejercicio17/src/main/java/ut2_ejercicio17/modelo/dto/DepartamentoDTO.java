package ut2_ejercicio17.modelo.dto;

public class DepartamentoDTO {
	private int depNum;
	private String apellido1;
	private String apellido2;
	
	public DepartamentoDTO() {
		
	}

	public int getDepNum() {
		return depNum;
	}

	public void setDepNum(int depNum) {
		this.depNum = depNum;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public DepartamentoDTO(int depNum, String apellido1, String apellido2) {
		super();
		this.depNum = depNum;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	@Override
	public String toString() {
		return "DepartamentoDTO [depNum=" + depNum + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}

	
	
}
