import java.time.LocalDate;

public class No_188 {

	public static void main(String[] args) {

		int cnt = 0;
		LocalDate ld = LocalDate.of(2015,1,1);
		for(int i = 0; i < 365; i++){

			if(String.valueOf(ld.getDayOfMonth()).length() == 1 &&
					ld.getMonthValue() == ld.getDayOfMonth()){
				cnt++;
			}else if(ld.getMonthValue() == ((ld.getDayOfMonth() / 10) + (ld.getDayOfMonth() % 10))){
				cnt++;
			}
			ld = ld.plusDays(1);
		}
		System.out.println(cnt);
	}

}
