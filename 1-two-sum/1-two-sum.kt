class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var listOfIndices = mutableListOf<Int>()
        var sum =  0
        //for each iteration through the array 
        for(i in 0 until nums.size){
            //add it to every element after it
            for(j in i+1 until nums.size){
                sum = nums[i]+nums[j]
                if(sum == target){
                    listOfIndices.add(i)
                    listOfIndices.add(j)
                }
            }
        }
    return listOfIndices.toIntArray() 
        }
       
}
