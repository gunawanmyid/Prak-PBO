import java.util.Scanner; //BERIKAN PENJELASAN INI APA GUNANYA..^_^

public class Answer {
	public static int c; //BERIKAN PENJELASAN INI APA GUNANYA..^_^
	
	public static void biografi(){ //BERIKAN PENJELASAN INI APA GUNANYA..^_^
		System.out.println("===========BIODATA=============="); //BERIKAN PENJELASAN INI APA GUNANYA..^_^
		System.out.println("Nama : Muhammad Azhar Hairuddin");
		System.out.println("NIM  : 60200112029");
		System.out.println("TTL  : Cakke,20 Maret 1994");
		System.out.println("================================");		
	}
	
	public static void pilihan(){
		System.out.println("Operasi Aritmastika");
		System.out.println("1. Penjumlahan");
		System.out.println("2: Pengurangan");
		System.out.println("3: Perkalian");
		System.out.println("4: Pembagian");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		biografi(); //BERIKAN PENJELASAN INI APA GUNANYA..^_^
		 Scanner in = new Scanner(System.in); //BERIKAN PENJELASAN INI APA GUNANYA..^_^
	     System.out.println("Nilai A : ");
	     int a=in.nextInt(); //BERIKAN PENJELASAN INI APA GUNANYA..^_^
	     System.out.println("Nilai B : ");
	     int b=in.nextInt(); //BERIKAN PENJELASAN INI APA GUNANYA..^_^
	     
	     pilihan();	      
	     System.out.println("Masukkan Pilihan");
	     int pil=in.nextInt();      //BERIKAN PENJELASAN INI APA GUNANYA..^_^
	     
	     in.close();             //BERIKAN PENJELASAN INI APA GUNANYA..^_^
	     Perhitungan hitung = new Perhitungan();  //BERIKAN PENJELASAN INI APA GUNANYA..^_^
		
		
		switch (pil){  //BERIKAN PENJELASAN INI APA GUNANYA..^_^
			case 1: //BERIKAN PENJELASAN INI APA GUNANYA..^_^
				hitung.tambah(a,b); //BERIKAN PENJELASAN INI APA GUNANYA..^_^
				break; //BERIKAN PENJELASAN INI APA GUNANYA..^_^
			case 2:
				hitung.kurang(a,b);
				break;
			case 3:
				hitung.kali(a,b);
				break;
			case 4:
				hitung.bagi(a,b);
				break;
			default:
				System.out.println("Anda salah menginput pilihan..!!");
		}	
	}

}
