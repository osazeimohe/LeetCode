class Solution {
    fun findNumbers(nums: IntArray): Int {
        var element:Double = 0.0
        var evenCount: Int = 0
        var numberOfDigits:Int = 0
        //loop through each element 
        for(number in nums){
            element = number.toDouble()
            numberOfDigits = 0
            //divide by 10 until its a decimal
            while(element >= 1 ){
                element /= 10
               //increment (the number of times its divisible by one)
                ++numberOfDigits
                 println(element)
                 println(numberOfDigits)
            }
            
          
            
            if((numberOfDigits%2).equals(0)) evenCount+=1
        }
        return evenCount
    }
}