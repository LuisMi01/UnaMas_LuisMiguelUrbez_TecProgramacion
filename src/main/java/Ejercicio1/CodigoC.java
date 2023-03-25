package Ejercicio1;

public class CodigoC {
        double N = 2;
        double PREC = 1e-6;

        public double bisect(double min, double max){

            double med = (min+max)/2;
            if (max-min<PREC){
                System.out.println(med);
                return med;
            }else if (f(min)*f(med)<0){
                System.out.println(bisect(min,med));
                return bisect(min,med);
            }else{
                System.out.println(bisect(med,max));
                return bisect(med,max);
            }

        }
        public double f(double x){
            double N = 2;
            double PREC = 1e-6;
            return x*x-N;
        }
}
