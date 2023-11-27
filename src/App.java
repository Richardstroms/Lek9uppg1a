public class App {
    public static void main(String[] args) throws Exception {

                double radie = 9.0;
                double omkrets = omkretsCirkel(radie);
        
                System.out.println("Omkretsen av cirkeln med radie " + radie + " är: " + omkrets);
            }
        
            public static double omkretsCirkel(double radie) {
                double omkrets = 2 * Math.PI * radie;
                return omkrets;
            }
        }
