
public class ArrayCopy {
	public static void main(String[] args){
	//Number 2
	System.out.println("\n--------NUMBER 2----------\n");
	int[] numberArray1 = new int[100];
	for(int i=0; i < 100; i++){
		numberArray1[i] = i;
	}
	int[] numberArray2 = new int[100];
	for(int j=0; j < 100; j++){
		numberArray2[j] = numberArray1[j];
		}
	for(int k=0; k < 100; k++) {
		System.out.println(numberArray2[k]);
		}
	
	//Number 6

	int[][] grades1 = new int[30][10];
	
	
	//Number 7
	System.out.println("\n----------NUMBER 7----------\n");
	int col = 30;
	int row = 10;
	int sum = 0;
	int[][] grades = new int[col][row];
	for(int x=0;x < col; x++){
		for(int y=0;y < row; y++){
			grades[x][y] = x;
			sum += grades[x][y];
			}
		}
	int average = sum / (grades.length);
	System.out.println(average);
		}
	}

