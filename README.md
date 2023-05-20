

Day 1 : Recursion and Memoization

Problem Statement:Pascal Triangle

Approach1:Naive Approach

Ex :num=3

output:

1

1 1

1 2 1

If we observe clearly This above triangle can also be viewed as

0C0

1C0 1C1

2C0 2C1 2C2

so simplest way to solve this problem can be just calculating the value of NCR which can done in mans ways.



sol1 can be using NCR formula 

NCR=(N!/((N-R)!*(R)!))

but if you observe clearly it will take a lot of memory for calculating factorial of a particular num so choosing a datatype can be tricky or in worst case u will get TLE error.



sol2: NCR using recursion thinking in such a way that we have find no of ways of selecting r item from n.

so at each step u will have 2 option whether to include particular element or no so it will be a easy way to solve a problem but still will take a lot of time(Exponential in our case).

But If you draw a recursion tree for NCR u will observe there are lot of recursive calls which are bieng calculated again so then this will give u hint of using dp to solve this problem which will reduce the time complexity from 0(exponential) to 0(polynomial).



sol3. the best approcah to solve a pascal triangle can be make use of memoization techique .

for eg: num=4

1

1 1

1 2 1

1 3 3 1

you can observe for any ith row can be calulated using (i-1)th row except 1 row and 2 row.



let row=3 to be calculated using row2

for each element from index 1 to index last-1

can be seen as a summation of two element of its previous row.

mathematically u can write as

jth element  of ith rrow=(j-1)th element of (i-1)th row +(j)th element of (i-1)th row.



eg 2nd element of row 3=1st element of row2 + 2nd element of row2 (2=1+1)

so this is how this problem can be seen as.



Special Approach of solving NCR can be seen as like that

NCR=N!/((N-R)!*R!)

or 

5C2=1*2*3*4*5/((1*2*3)/(1*2))

or

5C2=(4*5)/(1*2)

or

5C2=(5/1)*(4/2)

or 

NCR=(N/1)*((N-1)/(1+1))*((N-2)/(2+1).........r times 

this way u can reduce your time to calculate the value of NCR from 0(N) to 0(R)

Special thanks to #Striver (takeuforward) to teach this approach in his youtube video.
