//**************************************
// Name: Another prime number generator
// Description:Another prime number generator
// By: vasil ivanov
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
//Please see http://www.Planet-Source-Code.com/xq/ASP/txtCodeId.6139/lngWId.2/qx/vb/scripts/ShowCode.htm
//for details.
//**************************************



    class prime {
    int c = 0;
    boolean d = true;


        public prime(int c, boolean d) {
        this.c = c;
        this.d = d;
    }


        void begin_check() {


            for (int y = 2; y <= Math.sqrt(c); y++) {


                if (c % y == 0) {
                d = false;
            }
        }
    }
}


    public class Main {


        public static void main(String[] args) {


            for (int s = 0; s < 999999999; s++) {


                if (s % 2 != 0 && s != 1 || s == 2) {
                prime pr = new prime(s, true);
                pr.begin_check();


                    if (pr.d == true) {
                    System.out.println(s);
                }
            }
        }
    }
}
		
