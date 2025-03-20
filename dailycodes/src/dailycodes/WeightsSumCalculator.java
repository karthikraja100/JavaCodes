package dailycodes;

public class WeightsSumCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {10, 36, 54, 89, 12};
		int totalweight =0;
		
		for(int num:numbers) {
			totalweight+=calculateWeight(num);
		}
		System.out.println("Total Sum of Weights is "+totalweight);
	}

	private static int calculateWeight(int num) {
		// TODO Auto-generated method stub
		int weight=0;
		
		// 1.5 if a perfect square
		if(isPerfectSquare(num)) {
			weight+=5;
		}
		 // Condition 2: 4 if multiple of 4 and divisible by 6
		if(num%4==0 && num%6==0) {
			weight+=4;
		}
		// Condition 3: 3 if even number
		if(num%2==0) {
			weight+=3;
		}
		
		return weight;
	
	}

	private static boolean isPerfectSquare(int num) {
		// TODO Auto-generated method stub	
		int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
	}

 }
