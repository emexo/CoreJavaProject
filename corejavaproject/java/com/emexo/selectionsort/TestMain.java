package com.emexo.selectionsort;

public class TestMain
{
    public static void main(String args[])
    {
        int list[] = {77,12,98,7,17,67,69};
        int len = list.length;

        for( int i=0; i<len-1 ; i++)
        {
            int minIndex =i;
            for(int j=i+1; j<len; j++)
            {
                if(list[j]>list[minIndex])
                    minIndex =j;
            }
            System.out.println("Pass"+(i+1)+"+> Swap"+list[i]+"and"+list[minIndex]);
            int tmp=list[i];
            list[i]=list[minIndex];
            list[minIndex] = tmp;

        }
        System.out.println("SORTED ARRAY IS:");
        for(int i=0; i<len; i++)
        {
            System.out.println(list[i]);
        }
    }
}
