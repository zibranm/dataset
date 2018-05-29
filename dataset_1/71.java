//**************************************
// Name: Serches array for a certain value
// Description:loads 3 array one named Name one named id and one named status.....status and id are loaded with values randomly(id between 1-99) and (status1-4)
// By: Mike Scarlett
//
//
// Inputs:None
//
// Returns:None
//
//Assumes:this programs loads 3 arrays the searches the status array for a value of 3 and prints the matching Name and id number with the status
//
//Side Effects:None
//This code is copyrighted and has limited warranties.
//Please see http://www.Planet-Source-Code.com/xq/ASP/txtCodeId.1986/lngWId.2/qx/vb/scripts/ShowCode.htm
//for details.
//**************************************

public class Student


    {
    private String Name;
    private int id,
    status;
    public String Student(String j)


        {
        return "Name";
    }
    public int getid(int y)


        {
        y = (int)(Math.random()*98);
        y = y + 1;
        return y;
    }
    public int getstatus(int y)


        {
        y = (int)(Math.random()*4);
        y = y + 1;
        return y;
    }
    
}

class Client


    {
    public static void main(String[] args)


        {
        Student Stu1 = new Student();
        int[] status = new int[20];
        String[] Name = new String[20];
        int[] id = new int[20];
        String p = "";
        int x,
        t = 0;


            for (int i = 0; i <= 19; i++){
            Name[i] = Stu1.Student (p);
        }


            for (int i = 0; i <= 19; i++){
            x = Stu1.getstatus(i);
            status[i] = x;
        }


            for (int i = 0; i <=19; i++){
            id[i] = Stu1.getid(t);
        }


            for (int i = 0; i <= 19; i++){


                if (i >= 9 ){
                System.out.println(Name[i] + (i + 1) + " " + id[i] + " " + status[i]);
                continue;
            }
            System.out.println(Name[i] + (i + 1) + "" + id[i] + " " + status[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println();


            for (int i = 0; i <= 19; i++){


                if (status[i] == 3){


                    if (status[i] > 9 ){
                    System.out.println(Name[i] + (i + 1) + "" + id[i] + " " + "Junior");
                    continue;
                }
                System.out.println(Name[i] + (i + 1) + "" + id[i] + " " + "Junior");
            }
        }
    }
}
		
