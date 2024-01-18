package javaPackage1;

public class Array4Oct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		//lenght is property of the array
		int raw=arr.length; //gives rwas length
		int col=arr[0].length; //gives col length
		System.out.println("raws::"+raw);

		System.out.println("coloumns::"+col);
		
		for(int i=0;i<raw;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
