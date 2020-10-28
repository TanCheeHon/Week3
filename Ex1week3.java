public class Ex1Week3{
	public static void main(String [] nilaiTerima){
		//System.out.println("Nilai 1 : "+ nilaiTerima[0]);
		//System.out.println("Nilai 1 : "+ nilaiTerima[1]);
		//System.out.println("Nilai 1 : "+ nilaiTerima[2]);

//javac Ex1Week3.java
// java Ex1Week3 tan chee hon
		//kurang error ,,lebih x error
		int sum=0;

		for(int i =0;i<nilaiTerima.length;i++){
		System.out.println("Nilai : "+ nilaiTerima[i]);
		sum += Integer.parseInt(nilaiTerima[i]);
		System.out.println("Nilai sum : "+ sum);

             }
		//java Ex1Week3 10 20 30 40
	}
}