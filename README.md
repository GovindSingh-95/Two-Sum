# Two-Sum
<br>
<h4>Question Description</h4>
<p>
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
</p>
<br>
<h4>
  Algorithm
</h4>
<p>
 Here we need to use nested loops;<br>
having range of outer loop from i=0 to i<=n-2 index and that of other one from j=i+1 to j<=n-1
<br>as soon as array[i]+array[j]==target,store the values and break the loop
<br>we can even use boolean data types for checking if the pair is present in the given array or not 
</p>
<h3>
  Here is a code snippet in Java Language
</h3>
<p>
  ![2 sum](https://github.com/GovindSingh-95/Two-Sum/assets/156602160/2af449a6-a6f3-43a1-822d-89d419385af7)
</p>
