package geco;


public class PasswordGeneration {
    private StringBuilder sb = new StringBuilder();

    public String getRandomPassword() {
        int n =8; // how many characters in password
        String set ="z"; // characters to choose from

        for (int i = 0; i < n; i++) {
            int k =0;   // random number between 0 and set.length()-1 inklusive
            sb.append(set.charAt(k));
        }
        return sb.toString();
    }
}
