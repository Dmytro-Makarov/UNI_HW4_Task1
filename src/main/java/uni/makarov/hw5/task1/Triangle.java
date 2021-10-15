package uni.makarov.hw5.task1;

public class Triangle {
    Triangle(double A, double B, double C){
    sideA = A;
    sideB = B;
    sideC = C;
    }

double sideA;
double sideB;
double sideC;

void changeSide(double sideD, double newValue){
    sideD = newValue;
}

//angle in degrees
double calcAngle(double oppositeSide, double adjacentSide1, double adjacentSide2){
    double angle = Math.acos((adjacentSide1 * adjacentSide1 + adjacentSide2 * adjacentSide2 - oppositeSide * oppositeSide)
            / (2 * adjacentSide1 * adjacentSide2));
    return Math.toDegrees(angle);
}

double calcPerimeter(){
    return sideA + sideB + sideC;
}
}
