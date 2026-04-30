class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(String ch : operations){
            // check for special operation cases
            if(ch.equals("+")){
                int num1 = st.pop();
                int temp = num1+st.peek();
                st.push(num1);
                st.push(temp);
                ans+=temp;
            }
            else if(ch.equals("C")){
                ans-=st.pop();
            }
            else if(ch.equals("D")){
                int temp = st.peek();
                temp*=2;
                st.push(temp);
                ans+=temp;
            }else{
                st.push(Integer.valueOf(ch));
                ans+=st.peek();
            }
        }
        return ans;
    }
}