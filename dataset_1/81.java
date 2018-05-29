//**************************************
// Name: greatest common factor of two numbers
// Description:a class that returns the GCD of two numbers
// By: Ralph Anthony Palomar
//
//
// Inputs:None
//
// Returns:None
//
//Assumes:None
//
//Side Effects:None
//This code is copyrighted and has limited warranties.
//Please see http://www.Planet-Source-Code.com/xq/ASP/txtCodeId.5331/lngWId.2/qx/vb/scripts/ShowCode.htm
//for details.
//**************************************



    public class getGCD{
    private int num1;
    private int num2;


        public void setNum1(int num1){
        this.num1=num1;
    }


        public void setNum2(int num2){
        this.num2=num2;
    }


        public int getNum1(){
        return num1;
    }


        public int getNum2(){
        return num2;
    }


        public boolean isNotPositive(int num1, int num2){
        boolean truthValue=true;


            if(num1 > 0 && num2 > 0){
            truthValue=false;
        }
        return truthValue;
    }


        private boolean isNotEqual(){
        boolean truthValue=true;


            if(num1 == num2){
            truthValue=false;
        }
        return truthValue;
    }


        private int diffNum1Num2(){
        int diff=0;
        diff=num1-num2;
        return diff;
    }


        private int diffNum2Num1(){
        int diff=0;
        diff=num2-num1;
        return diff;
    }


        public int theGCDof2(){


            while(isNotEqual()){


                if(num1 > num2){
                num1=diffNum1Num2();
            }else


                if(num2 > num1){
                num2=diffNum2Num1();


                }else{
                break;}
            }
            return num1;
        }
    }
		
