package rickyrsyah;

public class Keramik {
	Integer panjang;
	Integer lebar;
	String label;
	Integer hargaPerBox;
	Integer jumlahPerBox;
	
	public Integer luasKeramikPerBox() {
		return panjang*lebar*jumlahPerBox;
	}
}