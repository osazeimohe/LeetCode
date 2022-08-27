class Solution {
   fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var listOfOnes = mutableListOf<Int>()
        var numsArray = nums.toTypedArray()
        //loop through IntArray
        for(i in 0 until numsArray.size){
            //start the window of ones
            if(numsArray[i] == 1){
                listOfOnes.add(numsArray[i])//keep track of the window
            } 
            //close the window of ones
            if(numsArray[i] == 0|| i == numsArray.size-1) {
                 if(listOfOnes.size > max){ max = listOfOnes.size }
                listOfOnes.clear()
            }
        }
       return max
    }
}