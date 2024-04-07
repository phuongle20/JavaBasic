package day5;

public class Loop {
//ex1
	public void inMang() {
		//Khai báo mảng a kiểu byte:
		//byte[] a;
		//Khởi tạo mảng a
		byte[] a = new byte[] {1,3,5,8,9};
		for(int i = 0; i<a.length; i++) {
	System.out.println("Phần tử thứ " + (i+1) + "là:" + a[i]);
	}}
	
	public void  sumAndAverage() {
		int sum = 0;
				for(short i = 1; i <= 100; i++) {
					sum=sum+i;	
				}
				System.out.println("The sum is" + sum);
				float average = sum/100f;
				System.out.println("The average is" + average);
		
				
	}
	public void sumAndAverageOdd(){
		int sum =0;
		int count = 0;
		for(int i = 1; i<=100; i++) {
			if (i%2 == 1) {
				sum = sum+i;
				count++;
				
			}
		}
		System.out.println("The sum is" + sum);
		System.out.println("The average is" + sum/(float)count);	
	}
	
	public void sumThosenumber() {
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if (i%7 == 0 ) {
				sum = sum+i;
				count++;
			}
			System.out.println("The sum is" + sum);
			System.out.println("The average is" + sum/count);
			
			
		}
		public void sumofTheSquares() {
			int sum = 0;
			int count = 0;
			
		}
		
		
	}
	
	
}
