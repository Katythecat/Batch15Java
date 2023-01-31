package class17.Assignments;

public class Students {
    String name;
    double art;
    double math;
    double music;
    double average;


    Students(String sName,double sArt,double sMath,
             double sMusic){
        name=sName;
        art=sArt;
        math=sMath;
        music=sMusic;

        average=(sArt+sMath+sMusic)/3;


        }

        void display(){
            System.out.println("Student name "+name+" an average grade is "+average);






    }


}
