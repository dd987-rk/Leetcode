class Solution {
    public long sumAndMultiply(int n) {
        long sum =0,x =0;
for (char c : String.valueOf(n).toCharArray())
if (c != '0'){
    x = x * 10 + c - '0';
    sum += c -'0';
}
        return x * sum;
    }
}