class Solution {
    public String lexGreaterPermutation(String s, String target) {
        char ans[] = new char[s.length()];
        int i = 0;
        int freq[] = new int[26];
        boolean flag = false;

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (i = 0; i < target.length(); i++) {

            char ch = target.charAt(i);

            if (freq[ch - 'a'] != 0) {
                ans[i] = ch;
                freq[ch - 'a']--;
            }

            else {
                for (int j = ch - 'a' + 1; j < 26; j++) {

                    if (freq[j] != 0) {
                        flag = true;

                        ans[i] = (char) ('a' + j);
                        freq[j]--;

                        int pos = i + 1;

                        for (int k = 0; k < 26; k++) {
                            while (freq[k] > 0) {
                                ans[pos++] = (char) ('a' + k);
                                freq[k]--;
                            }
                        }

                        return new String(ans);
                    }
                }

                break;
            }
        }

        if (flag == false) {

            for (int j = i - 1; j >= 0; j--) {

                freq[ans[j] - 'a']++;

                for (int k = ans[j] - 'a' + 1; k < 26; k++) {

                    if (freq[k] != 0) {

                        ans[j] = (char) ('a' + k);
                        freq[k]--;

                        int pos = j + 1;

                        for (int x = 0; x < 26; x++) {
                            while (freq[x] > 0) {
                                ans[pos++] = (char) ('a' + x);
                                freq[x]--;
                            }
                        }

                        return new String(ans);
                    }
                }
            }
        }

        return "";
    }
}