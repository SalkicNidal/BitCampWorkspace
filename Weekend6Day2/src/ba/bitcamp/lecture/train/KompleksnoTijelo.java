package ba.bitcamp.lecture.train;

public class KompleksnoTijelo implements ITijelo {

	ITijelo[] dijelovi;
	
	public KompleksnoTijelo(ITijelo[] noviDijelovi){
		dijelovi = noviDijelovi;
	}
	
	
	public void dodajDio (ITijelo dio){
		 ITijelo [] novi  = null;
		 if ( dijelovi == null){
			 dijelovi = new ITijelo[1];
		 }else{
			 novi = new ITijelo[dijelovi.length +1] ;
			 System.arraycopy(dijelovi, 0, dijelovi.length, 0, dijelovi.length);
		 }
		novi[novi.length -1] = dio;
	}

	@Override
	public double povrsina() {
		if (dijelovi != null) {
			double sum = 0;
			for (ITijelo dio : dijelovi) {
				sum += dio.povrsina();
			}
			return sum;
		}
		return 0;

	}

	@Override
	public double obim() {
		if (dijelovi != null) {
			double sum = 0;
			for (ITijelo dio : dijelovi) {
				sum += dio.obim();
			}
			return sum;
		}
		return 0;
	}

}
