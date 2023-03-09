## Problem Statement: Finding the sum of common elements from given two arrays ##

**Given two set of integer arrays calculate the sum of common elements**

**This exercise contains a class named SumOfCommonElements with the following methods :**

    getArraySize() : int 
    -Should scan for array size
 ----------------------------------
    getArrayElements(int) : int[]
    -Should scan for storing array elements in two arrays separately
 ---------------------------------------------------------------------
    calculateSumOfCommonElements(int[],int[]) : int
    -Should return the sum of common elements between the array elements.
    -Should return 0 if there are no common elements.
    -Should return -1 if the input array size is zero.
--------------------------------------------------------------------------    
    displayResult() : void 
    -Should diplay the result as shown in the example section 
------------------------------------------------------------------------
    closeScanner() : void
    -Should close the Scanner object
    
**Do the following in the main method of SumOfCommonElements class**

Call the functions in the required sequence. 

## Example
    Sample Input:
    {10,20,30,40,50}
    {5,10,15,20,25} 
    
    Expected Output:
    30
--------------------------------------------------------
    Sample Input:
    {10,20,20}
    {10,10,20}
    
    Expected Output:
    60
--------------------------------------------------------
    Sample Input:
    {1,2,3}
    {4,5,6}
    
    Expected Output:
    0
--------------------------------------------------------
    Sample Input:
    {}
    {}
    
    Expected Output:
    No elements in arrays

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
