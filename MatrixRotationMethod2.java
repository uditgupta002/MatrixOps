import java.util.*;
import java.lang.*;
import java.io.*;

class MatrixRotationMethod2 {
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
		    inplaceRotateInOn(arr);
		    //transpose(arr);
		    //reverseCols(arr);
		    //reverseRows(arr);
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
	
	public static String[][] reverseRows(String[][] arr){
	    String temp;
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length/2;j++){
	            temp = arr[i][j];
	            arr[i][j] = arr[i][arr[i].length-1-j];
	            arr[i][arr[i].length-1-j] = temp;
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
	
	public static void inplaceRotateInOn(String[][] arr){
	    String temp;
	    for(int i=0;i<arr.length/2;i++){
	        for(int j=i;j<arr.length-i-1;j++){
	            temp = arr[i][j];
	            arr[i][j] = arr[j][arr.length-1-i];
	            arr[j][arr.length-1-i] = arr[arr.length-1-i][arr.length-1-j];
	            arr[arr.length-1-i][arr.length-1-j] = arr[arr.length-1-j][i];
	            arr[arr.length-1-j][i] = temp;
	        }
	    }
	    
	    
	}
	
}
