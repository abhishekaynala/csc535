public static void main(String []args){
       int increments=0;
       for(int k=1;k<=1000000;k++)
       {
           if(k%9==0||k%27==0||k%13==0||k%81==0)
           {
               increments++;
           }
       }
       System.out.println("Result is"+increments);
        }