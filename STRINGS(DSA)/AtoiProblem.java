class AoitProblem {
    public int myAtoi(String s) {
        int i=0,sign=1; //by default sign is positive 
        long result=0;
        //if white spcaes encountered, we skip them
        while(i<s.length() && (s.charAt(i)==' '))
        {
           i++;
        }
     //now checking for the sign
         if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-'))
         {
             sign = (s.charAt(i)=='-') ? -1 : 1;
             i++;
         }
    //checking for the digits
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int digit = s.charAt(i) - '0';
            result = result*10 + digit;
            
            //oveflow condition
            
            if(sign == 1 && result > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -result < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*result);
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AoitProblem obj = new AoitProblem();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int result = obj.myAtoi(input);
        System.out.println("Converted integer: " + result);

        sc.close();
    }
}
