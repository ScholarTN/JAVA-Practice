public class Arrays {
    public static void main(String a[])
    {
        int nums[]={3,7,2,4};
        //updating values
        nums[1]=6; // 7 updated to 6
        System.out.println(nums[1]);

        //making the array dynamic
        int nums2[]=new int[4]; //a new array with 4 boxes but values are zero
        //setting the values 
        nums2[0]=4;
        nums2[1]=8;
        nums2[2]=3;
        nums2[3]=9;
        

        for(int i=0;i<4;i++)
        {
            System.out.println(nums2[i]);

        }
        
        //MultiDimensional Array
        int nums3[][]=new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums3[i][j]=(int)(Math.random()*10);
                //assigning random numbers to array
                //random gives double values, so type casting is required (int)
                //random values are greater than 0.0 but less than 1.0, so multiplication by 10 is required

            }
            
        }


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(nums3[i][j] + " ");
            }
            System.out.println();
        }

        //Jagged Array
        int jnums[][]=new int[3][];
        //specifies the inner cells 1 by 1
        jnums[0]=new int[3];
        jnums[1]=new int[4];
        jnums[2]=new int[2];


    }
}


