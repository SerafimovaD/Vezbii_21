
public class min {
	int min;
	void minFun(int n1,int n2) { //metod-min od dva broja
		min=n1; //pretpostaven minimum
		if(min>n2)
				min=n2;
		System.out.println( " Od broevite " + n1 + " i " + n2 + " pomal e " + min );
	}
	void minFun(int n1, int n2, int n3) {
		min=n1;
		if(min>n2)
			min=n2;
		if(min>3)
			min=n3;
		System.out.println( " Od broevite " + n1 + "," + n2 + "," + n3 + " najmal e " + min );
	}
	public static void main(String[] args) {
		min najmal=new min(); //Kreiraj objekt
		najmal.minFun(11, 6);//Povik na metodot-min od dva broja
		najmal.minFun(6, 3, 4); //Povik na metodot-min od tri broja

	}

}
