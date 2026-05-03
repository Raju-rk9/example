import java.util.Random;

class random{
    public static void main(String[] args) {
        Random ra = new Random();
        int a = ra.nextInt(19);
        double dou = ra.nextDouble();
        double gaus = ra.nextGaussian();
        boolean b = ra.nextBoolean();
        System.out.println("Integer: "+a+"\n"+"Double: "+dou+"\n"+"Gaussian: "+gaus+"\n"+"Boolean Value: "+b);
        // byte b[] = new byte[4];
        // rand.nextBytes(b);
        // System.out.println(Arrays.toString(b));
    }
}