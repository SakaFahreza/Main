import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String nama1, nama2, nama3, pekerjaan1, pekerjaan2, pekerjaan3, hobby1, hobby2, hobby3;

		System.out.println("================================");
		System.out.print("Masukan Nama 1: ");
		nama1 = keyboard.nextLine();
		System.out.print("Masukan Nama 2: ");
		nama2 = keyboard.nextLine();
		System.out.print("Masukan Nama 3: ");
		nama3 = keyboard.nextLine();
		System.out.println("================================");

		System.out.print("Masukan Pekerjaan 1: ");
		pekerjaan1 = keyboard.nextLine();
		System.out.print("Masukan Pekerjaan 2: ");
		pekerjaan2 = keyboard.nextLine();
		System.out.print("Masukan Pekerjaan 3: ");
		pekerjaan3 = keyboard.nextLine();
		System.out.println("================================");

		System.out.print("Masukan Hobby 1: ");
		hobby1 = keyboard.nextLine();
		System.out.print("Masukan Hobby 2: ");
		hobby2 = keyboard.nextLine();
		System.out.print("Masukan Hobby 3: ");
		hobby3 = keyboard.nextLine();
		System.out.println("HASIL TAMPILAN");
		System.out.println("=============================================");
		
		System.out.println("|Nama:\t|Pekerjaan:\t|Hobby:  ");
		System.out.println("|"+nama1+"\t"+"|"+pekerjaan1+"\t\t"+"|"+hobby1+"");
		System.out.println("|"+nama2+"\t"+"|"+pekerjaan2+"\t\t"+"|"+hobby2+"");
		System.out.println("|"+nama3+"\t"+"|"+pekerjaan3+"\t\t"+"|"+hobby3+"");
		System.out.println("=============================================");




	}
}