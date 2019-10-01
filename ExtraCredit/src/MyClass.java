/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milus
 */
class MyClass implements Comparable<MyClass>
{
    int sortFirst;
    String sortByLength;

    public MyClass(int sortFirst)
    {
        this.sortFirst = sortFirst;
        //this.sortByLength = sortByLength;
    }

    @Override
    public int compareTo(MyClass other)
    {
        if (sortFirst != other.sortFirst)
            return Integer.compare(sortFirst, other.sortFirst);
        else
           return 0;//Integer.compare(sortByLength.length(), other.sortByLength.length());
    }

    @Override
    public String toString()
    {
        return sortFirst + " ";// + sortByLength;
    }
}
