class Butterfly{
       public static void main(String args[]){
          int n=5;
          for(int i=0;i<n;i++,System.out.println("\n"))
          {
             for(int j=0;j<i+1;j++,System.out.print(" "))
             {
                    System.out.print("*");
             }
             for(int k=0;k<n-i-1;k++,System.out.print(" "))
             {                
                    System.out.print(" ");
             }
             for(int k=0;k<n-i-1;k++,System.out.print(" "))
             {
                    System.out.print(" ");
             }

             for(int k=0;k<i+1;k++,System.out.print(" "))
             {
                    System.out.print("*");
             }
          }
          for(int i=0;i<n;i++,System.out.println("\n"))
         {
         for(int j=0;j<n-i-1;j++,System.out.print(" "))
{
System.out.print("*");
}
for(int k=0;k<i+1;k++,System.out.print(" "))
{System.out.print(" ");
}

for(int k=0;k<i+1;k++,System.out.print(" "))
{System.out.print(" ");
}
for(int k=0;k<n-i-1;k++,System.out.print(" "))
{
System.out.print("*");
}
}

}
}