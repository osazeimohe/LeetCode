class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        //empty mutable list
        var listOfSquares = mutableListOf<Int>()
        var squared = 0
        for(integer in nums){
            squared = integer * integer
            listOfSquares.add(squared)
        }
        listOfSquares.sort()
        return listOfSquares.toIntArray()
    }
}