package Parcial;

public class punto4 {

	public static void main(String[] args) {
		

	}
	
	
public static int Calculate_less_time(int[] route ,int[] duration_route) {
	int less_hours=0;
	for (int i = 1; i <route.length ; i++) {
		if(duration_route[i]<duration_route[i-1]) {
			less_hours=duration_route[i];
		}
	}
	return less_hours;
	
}
public static int payment(int duration_of_morning,int duration_of_nigth,int d,int p) {
	int total_work=duration_of_morning+duration_of_nigth;

	int hours_extra=0;
	int amount_payable=0;
	if(total_work>d) {
		hours_extra=total_work-d;
		amount_payable=(hours_extra*p)+(d*p);
	}else {
		amount_payable=total_work*p;
	}
	return amount_payable;
}

}
