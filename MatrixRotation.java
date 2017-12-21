import java.util.*;
import java.lang.*;
import java.io.*;

class MatrixRotation {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for(int t=0;t<testCases;t++){
		    int size = Integer.parseInt(br.readLine());
		    String tempArr[] = br.readLine().split(" ");
		    String arr[][] = new String[size][size];
		    int k = 0;
		    for(int i=0;i<size;i++){
		        for(int j=0;j<size;j++){
		            arr[i][j] = tempArr[k++];
		        }
		    }
		    
		    transpose(arr);
		    reverseCols(arr);
		    
		    for(int i=0;i<size;i++){
		        for(int j=0;j<size;j++){
		            System.out.print(arr[i][j]+" ");
		        }
		        //System.out.println();
		    }
		    System.out.println();
		}
		
	}
	
	public static String[][] transpose(String[][] arr){
	    String temp;
	    for(int i=0;i<arr.length;i++){
		    for(int j=i;j<arr[i].length;j++){
		        temp = arr[i][j];
		        arr[i][j] = arr[j][i];
		        arr[j][i] = temp;
		    }
		}
		return arr;
	}
	
	
	public static String[][] reverseCols(String[][] arr){
	    String temp;
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length/2;j++){
	            temp = arr[j][i];
	            arr[j][i] = arr[arr.length-1-j][i];
	            arr[arr.length-1-j][i] = temp;
	        }
	    }
	    return arr;
	}
	
	
}
