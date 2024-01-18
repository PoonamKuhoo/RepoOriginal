package javaPackage1;

public class ArrayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object obj[][]= {{1,"Poonam","IT",13.5},{2,"Geet","MIT",14.5},{3,"Kuhoo","US",56.7}};
	
           int raw=obj.length;
           int col=obj[0].length;
           
           
           for(int i=0;i<raw;i++)
           {
        	  for(int j=0;j<col;j++)
        	  {
        		  System.out.print(obj[i][j]+"  ");
        	  }
        	  System.out.println();
           }

	}

}
