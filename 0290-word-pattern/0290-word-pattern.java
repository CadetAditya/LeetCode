class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm=new HashMap<>();
        String[] arr=s.split(" ");
        char[] pArr=pattern.toCharArray();

        if(arr.length != pArr.length) return false;

        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(pArr[i])){
                if(hm.get(pArr[i]).equals(arr[i])!=true) return false;
            }
            else if(hm.containsValue(arr[i])){
                return false;
            }
            else{
                hm.put(pArr[i],arr[i]);
            }
        }

        return true;

    }
}