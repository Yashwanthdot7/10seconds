class Complex {
    float real;
    float imag;

    public void getData(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }

    public void addComplex(Complex c1, Complex c2) {
        real = c1.real + c2.real;
        imag = c1.imag + c2.imag;
    }

    public void printData() {
        System.out.println("Result: " + real + " + " + imag + "i");
    }
}

class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.real =  5.0f;
        c1.imag = 10.0f;

        Complex c2 = new Complex();
        c2.real = 10.0f;
        c2.imag = 10.0f;

        Complex c3 = new Complex();
        c3.addComplex(c1, c2);
        c3.printData();
    }
}