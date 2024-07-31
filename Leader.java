class Leader{
    public static void main(String args[])
    {
        int a[]={56,72,9,8};
        int i,n;
        n=a.length; 
        for(i=0;i<=n;i++)
        {
            if(a[i]>a[i+1])
            {
            System.out.println(a[i]+" ");
            i=i++;
            break;
            }
        }

    }
}