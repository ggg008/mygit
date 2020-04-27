import java.util.Random;

public class MyTest
{
	void selectionSort(int[] list, int length)
	{

		int least, temp;

		for (int i = 0; i < length - 1; ++i) {
			least = i;
			for (int j = i + 1; j < length; ++j)
				if (list[j] < list[least]) {
					least = j;
					temp = list[i];
					list[i] = list[least];
					list[least] = temp;
				}
		}
	}
	
	
	void insertionSort(int[] list, int length)
	{		
		int j = 0;
		for(int i = 1; i < length; ++i) {
			int key = list[i];
			j = i - 1;
			while(0 <= j && key < list[j]) {
				list[j+1] = list[j];
				--j;
			}
			list[j+1] = key;
		}
		
	}
	
	void bubbleSort(int[] list, int length)
	{		
		for(int i = length -1; 0 < i; --i) {
			for(int j =0; j < i; ++j) {
				if(list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;					
				}
			}
		}		
	}
	
	
	void TestM(int a, long b) {
		System.out.println("TestM ");
	}
	
	void TestM(long b, int a) {
		System.out.println("TestM Change P");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
//		System.out.printf("[%15s]\n", "jim");
//		System.out.printf("[%15s]\n", "hkim");
//		System.out.printf("[%15s]\n", "sadsjim");
//		System.out.printf("[%15s]\n", "dddjim");
		
//		NumberFormat nf = new NumberFormat("+#");
//		DecimalFormat df = new DecimalFormat("+#");
		
		int x = 22222;
//		System.out.printf("%10s\n", df.format(x));
		
//		System.out.printf("%+15d", 1000);
		
		
		System.out.printf("%.1f", 1000f);
		
	      
		
		int[] arr[];
		
		MyTest mt = new MyTest();
		
		Random r = new Random();

		int[] rArr = new int[10];

		for (int i = 0; i < rArr.length; ++i) {

			rArr[i] = r.nextInt(999);
		}

//		int iCargo = 0;
//		for (int i = 0; i < 10; ++i) {
//			for (int j = 0; j < 9; ++j) {
//				if (rArr[j] > rArr[j + 1]) {
//					iCargo = rArr[j];
//					rArr[j] = rArr[j + 1];
//					rArr[j + 1] = iCargo;
//				}
//			}
//		}
		
		mt.bubbleSort(rArr, rArr.length);
		
		
		mt.TestM(1, 1l);
		mt.TestM(1l, 1);
		

		for (int num : rArr) {
			System.out.printf("%d ", num);
		}
	}

}
