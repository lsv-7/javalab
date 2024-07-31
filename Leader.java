class Leader{
    public static void main(String args[])
    {
        int a[]={9,4,5,3};
        int i; 
        for(i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            System.out.println(a[i]);
        }
            
    }
}