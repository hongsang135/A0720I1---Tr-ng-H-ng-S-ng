package b15_exception_debug.bai_tap.Illegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalTriangleException(Throwable cause) {
        super(cause);
    }

    public IllegalTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}


/*
public class IllegalTriangleException extends Throwable {
    private String message;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;



public class CheckIllegalTriangleException {
    private double side1;
    private double side2;
    private double side3;

    public CheckIllegalTriangleException() {
    }

    public CheckIllegalTriangleException(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) throws IllegalTriangleException{
        this.side1 = side1;
        if (side1 < 0 ) {
            throw new  IllegalTriangleException("Side must be larger than 0 !");
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) throws IllegalTriangleException {
        this.side2 = side2;
        if(side2 < 0) {
            throw new IllegalTriangleException("Side must be larger than 0 !");
        }
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) throws IllegalTriangleException {
        this.side3 = side3;
        if(side3 < 0 ) {
            throw new IllegalTriangleException("Side must be larger than 0 !");
        }
    }
}







public class MainException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            CheckIllegalTriangleException check = new CheckIllegalTriangleException();
            System.out.println("Enter side1: ");
            check.setSide1(input.nextDouble());
            System.out.println("Enter side2: ");
            check.setSide2(input.nextDouble());
            System.out.println("Enter side3: ");
            check.setSide3(input.nextDouble());
        } catch (IllegalTriangleException e) {
            e.getMessage();
        }
    }
}

    }*/
