package tudien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TuDien {
	public TuDien() {
		
	}
	
	static Scanner sc = new Scanner(System.in);
	static List<Word> td = new ArrayList<Word>();
	
	private static void menu() {
		System.out.println("-----Menu-----");
		System.out.println("1. Nhập ds cho TĐ\n" + 
							"2. Xuất ds\n" + 
							"3. Tra từ: Nhập từ cần tìm\n" + 
							"4. Tìm và sửa từ\n" + 
							"5. Tìm và xóa\n" + 
							"6. Sắp xếp\n" +
							"7. Thoat");
		System.out.println("-----Menu-----");
	}
	
	private void themTu() {
		Word newWord = new Word();
		newWord.nhap();
		td.add(newWord);
		System.out.println("Nhap tu thanh cong");
	}
	
	private void xuatTu() {
		System.out.println("Tu dien:\n");
		for(Word word : td)
			word.xuat();
	}
	
	private void timTu() {
		System.out.print("Nhap tu can tim:");
		//Scanner sca = new Scanner(System.in);
		String str = sc.nextLine();
		boolean isExist = false;
		for(Word word : td) {
			if(word.getTu().equalsIgnoreCase(str)) {
				System.out.println("Tu can tim la:");
				word.xuat();
				isExist = true;
				break;
			}
		}
		if(!isExist)
			System.out.println("Tu khong ton tai!");
		//sca.close();
	}
	
	private void suaTu() {
		System.out.print("Nhap tu can sua:");
		//Scanner scan = new Scanner(System.in);
		String str1 = sc.nextLine();
		boolean isExist1 = false;
		for(Word word : td) {
			if(word.getTu().equalsIgnoreCase(str1)) {
				System.out.println("Tu can sua la:");
				word.xuat();
				word.suaTu();
				isExist1 = true;
				break;
			}
		}
		if(!isExist1)
			System.out.println("Tu khong ton tai!");
		//scan.close();

	}
	
	private void xoaTu() {
		System.out.print("Nhap tu can xoa:");
		//Scanner scann = new Scanner(System.in);
		String str2 = sc.nextLine();
		boolean isExist2 = false;
		for(Word word : td) {
			if(word.getTu().equalsIgnoreCase(str2)) {
				System.out.println("Tu can xoa la:");
				word.xuat();
				System.out.println("Ban co chac muon xoa tu \"" + word.getTu() + "\"? y/n");
				if(sc.nextLine().equalsIgnoreCase("y"))
					td.remove(word);
				isExist2 = true;
				break;
			}
		}
		if(!isExist2)
			System.out.println("Tu khong ton tai!");
		//scann.close();
	}
	
	private void sapXep() {
		System.out.println("Truoc khi sap xep :");
		for(Word word : td)
			System.out.println(word.getTu());
		for(int i = 0 ; i < td.size() ; i++) {
			for(int j = i + 1 ; j < td.size() ; j++) {
				if(td.get(i).getTu().compareToIgnoreCase(td.get(j).getTu()) > 0)
					Collections.swap(td, i, j);
			}
		}
		System.out.println("Sau khi sap xep:");
		for(Word word : td)
			System.out.println(word.getTu());
	}
	

	public static void main(String[] args) {
		TuDien x = new TuDien();
		int chon = 0;
		while(true) {
			menu();
			try {
				chon = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Ban can nhap dung, nhan enter de tiep tuc");
				sc.nextLine();
				continue;
			}
			switch(chon) {
			case 1:
//				Word newWord = new Word();
//				newWord.nhap();
//				td.add(newWord);
//				System.out.println("Nhap tu thanh cong");
				x.themTu();
				break;
			case 2:
//				System.out.println("Tu dien:\n");
//				for(Word word : td)
//					word.xuat();
				x.xuatTu();
				break;
			case 3:
//				System.out.print("Nhap tu can tim:");
//				Scanner sca = new Scanner(System.in);
//				String str = sca.nextLine();
//				boolean isExist = false;
//				for(Word word : td) {
//					if(word.getTu().equalsIgnoreCase(str)) {
//						System.out.println("Tu can tim la:");
//						word.xuat();
//						isExist = true;
//						break;
//					}
//				}
//				if(!isExist)
//					System.out.println("Tu khong ton tai!");
				x.timTu();
				break;
			case 4:
//				System.out.print("Nhap tu can sua:");
//				Scanner scan = new Scanner(System.in);
//				String str1 = scan.nextLine();
//				boolean isExist1 = false;
//				for(Word word : td) {
//					if(word.getTu().equalsIgnoreCase(str1)) {
//						System.out.println("Tu can sua la:");
//						word.xuat();
//						word.suaTu(str1);
//						isExist1 = true;
//						break;
//					}
//				}
//				if(!isExist1)
//					System.out.println("Tu khong ton tai!");
				x.suaTu();
				break;
			case 5:
//				System.out.print("Nhap tu can xoa:");
//				Scanner scann = new Scanner(System.in);
//				String str2 = scann.nextLine();
//				boolean isExist2 = false;
//				for(Word word : td) {
//					if(word.getTu().equalsIgnoreCase(str2)) {
//						System.out.println("Tu can xoa la:");
//						word.xuat();
//						System.out.println("Ban co chac muon xoa tu \"" + word.getTu() + "\"? y/n");
//						if(scann.nextLine().equalsIgnoreCase("y"))
//							td.remove(word);
//						isExist2 = true;
//						break;
//					}
//				}
//				if(!isExist2)
//					System.out.println("Tu khong ton tai!");
				x.xoaTu();
				break;
			case 6:
//				System.out.println("Truoc khi sap xep :");
//				for(Word word : td)
//					System.out.println(word.getTu());
//				for(int i = 0 ; i < td.size() ; i++) {
//					for(int j = i + 1 ; j < td.size() ; j++) {
//						if(td.get(i).getTu().compareToIgnoreCase(td.get(j).getTu()) > 0)
//							Collections.swap(td, i, j);
//					}
//				}
//				System.out.println("Sau khi sap xep:");
//				for(Word word : td)
//					System.out.println(word.getTu());
				x.sapXep();
				break;
			case 7:
				System.out.println("Tam biet!!!");
				System.exit(0);
				break;
			default:
				break;
				}
//			if(chon == 7)
//				break;
			System.out.println("Nhan enter de tiep tuc");
			sc.nextLine();
		}
		
	}
}
