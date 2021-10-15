package uni.makarov.hw5.task1;

public class RegularTriangle extends Triangle {

    RegularTriangle(double A) {
            super(A, A, A);
    }

    double area;

    @Override
    void changeSide(double sideD ,double newValue){
        sideA = newValue;
        sideB = newValue;
        sideC = newValue;
    }

    double calcArea(){
        //if the triangle is regular
        if(sideA==sideB && sideC==sideA) {
            return (sideA * sideA * Math.sqrt(3))/4.0;
        } else {return -1;}
    }
}
