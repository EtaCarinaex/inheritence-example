package org.example.animals;

public class Deer extends Animal{

    private String footLength;

    private String tailColor;

    private String eyeColor;


    public Deer(){
        super("Deer","on foot",13,67);
    }



    public Deer(String kindName, String moveType, Integer age, Integer hungrylevel) {
        super(kindName, moveType, age, hungrylevel);
    }
}


/*


Organizma ----------------------
         liveType
         solunumYapar
         canMove
         isMıcroscopic

        Animal---------------------------------
                  kindName
                  moveType
                  age
                  hungryLevel

                  Deer-------------------------
                    footLenght
                    eyeColor
                    tailColor

                            ForestDeer------------------
                            tırnakKalınlığı
                            yasadığıIklım
                            Kondusyonu



                           ForestDeer deer = new ForestDeer();

                           deer.kindName;

                           deer.footLenght;




 */