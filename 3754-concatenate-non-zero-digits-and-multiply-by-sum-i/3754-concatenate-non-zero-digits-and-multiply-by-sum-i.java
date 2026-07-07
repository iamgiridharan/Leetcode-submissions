class Solution {
    public long sumAndMultiply(int n) {
        
        String str = Integer.toString(n);
        String m="";
        for(char ch : str.toCharArray()){
            if (ch=='0')
                continue;
            m+=ch;    
        }
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=str.charAt(i)-'0';
        }

        if (m.isEmpty())
            return 0;
        return (long) sum * Integer.parseInt(m);

    }
}