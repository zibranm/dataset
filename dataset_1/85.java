//**************************************
// Name: Median Number
// Description:display median number from an array
// By: Mr. SNMP Simamora
//
//
// Inputs:it's set as default in syntax by coder
//
// Returns:a number
//
//Assumes:reader must learning about array concept in JAVA Programming
//
//Side Effects:n/a
//This code is copyrighted and has limited warranties.
//Please see http://www.Planet-Source-Code.com/xq/ASP/txtCodeId.6596/lngWId.2/qx/vb/scripts/ShowCode.htm
//for details.
//**************************************



    public class Median01 {


        public static void main(String args[]) {
        float temp,A[]={6,4,3,2,6,4,9,0,2,0};
        int j,i,N;
        N=A.length;


            for(i=0;i<N;i++) {


                for(j=0;j<N-1;j++) {


                    if(A[j]>A[j+1]) {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        System.out.print("A = { ");


            for(i=0;i<N;i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("}");
        int Nn=N/2;
        float Ge=(A[Nn-1]+A[Nn])/2;
        System.out.println("Median = " + Ge);
        System.exit(0);
    }
}
		
