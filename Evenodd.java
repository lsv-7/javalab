class Evenodd{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            System.out.println(a[i]);
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            System.out.println(a[i]);
        }
    }
}