class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> newString = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                newString.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                newString.add("Fizz");
            }
            else if(i % 5 == 0){
                newString.add("Buzz");
            }
            else {
                newString.add(Integer.toString(i));
            }
        }
        return newString;
    }
}