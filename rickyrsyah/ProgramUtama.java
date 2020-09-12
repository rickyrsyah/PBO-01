package rickyrsyah;

public class ProgramUtama {
	public static void main(String[] args) {
		Keramik keramikA = new Keramik();
		keramikA.panjang = 30;
		keramikA.lebar = 30;
		keramikA.label = "Keramik A";
		keramikA.hargaPerBox = 54000;
		keramikA.jumlahPerBox = 10;
		
		Keramik keramikB = new Keramik();
		keramikB.panjang = 40;
		keramikB.lebar = 40;
		keramikB.label = "Keramik B";
		keramikB.hargaPerBox = 65000;
		keramikB.jumlahPerBox = 5;
		
		Keramik keramikC = new Keramik();
		keramikC.panjang = 30;
		keramikC.lebar = 40;
		keramikC.label = "Keramik C";
		keramikC.hargaPerBox = 60000;
		keramikC.jumlahPerBox = 8;
		
		Double luasKeramikDibutuhkan = 1000000.0; // 1.000.000cm^2 == 100m^2
		
		Integer minimumBoxKeramikA = (int) Math.ceil(luasKeramikDibutuhkan / keramikA.luasKeramikPerBox()); // Math.ceil() untuk pembulatan keatas
		System.out.println("========");
		System.out.println(keramikA.label);
		System.out.println("Minimum box yang harus dibeli: "+minimumBoxKeramikA);
		System.out.println("Total harga: Rp "+ (minimumBoxKeramikA*keramikA.hargaPerBox));
		
		Integer minimumBoxKeramikB = (int) Math.ceil(luasKeramikDibutuhkan / keramikB.luasKeramikPerBox()); // Math.ceil() untuk pembulatan keatas
		System.out.println("========");
		System.out.println(keramikB.label);
		System.out.println("Minimum box yang harus dibeli: "+minimumBoxKeramikB);
		System.out.println("Total harga: Rp "+ (minimumBoxKeramikB*keramikB.hargaPerBox));
		
		Integer minimumBoxKeramikC = (int) Math.ceil(luasKeramikDibutuhkan / keramikC.luasKeramikPerBox()); // Math.ceil() untuk pembulatan keatas
		System.out.println("========");
		System.out.println(keramikC.label);
		System.out.println("Minimum box yang harus dibeli: "+minimumBoxKeramikC);
		System.out.println("Total harga: Rp "+ (minimumBoxKeramikC*keramikC.hargaPerBox));
	}
}