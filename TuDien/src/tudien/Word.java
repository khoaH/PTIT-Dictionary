package tudien;

import java.util.Scanner;

public class Word {
	
	static Scanner s = new Scanner(System.in);
	
	protected String getTu() {
		return tu;
	}
	public void setTu(String tu) {
		this.tu = tu;
	}
	public String getNghia() {
		return nghia;
	}
	public void setNghia(String nghia) {
		this.nghia = nghia;
	}
	@Override
	public String toString() {
		return "TuDien [tu=" + tu + ", nghia=" + nghia + "]";
	}
	
	public Word() {
		
	}
	public Word(String tu, String nghia) {
		this.tu = tu;
		this.nghia = nghia;
	}
	private String tu;
	private String nghia;
	
	public void nhap() {
		System.out.println("Nhap tu:");
		this.setTu(s.nextLine());
		System.out.println("Nhap nghia");
		this.setNghia(s.nextLine());
	}
	
	public void xuat() {
		System.out.println("tu=" + tu + ", nghia=" + nghia);
	}
	
	public void suaTu() {
		System.out.println("Ban co chac muon sua tu? y/n");
		if(s.nextLine().equalsIgnoreCase("y")) {
			System.out.println("Sua tu thanh:");
			this.setTu(s.nextLine());
			System.out.println("Sua nghia thanh:");
			this.setNghia(s.nextLine());
		}
	}
}
