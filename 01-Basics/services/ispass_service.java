package services;

public class ispass_service {
    public static boolean isPass(double cgpa) {
        if (cgpa > 7.0) {
            return true;
        }
        return false;
    }
}
